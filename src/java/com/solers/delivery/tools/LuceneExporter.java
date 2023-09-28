package com.solers.delivery.tools;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.StringUtils;
import org.restlet.engine.connector.ClientHelper;
import org.restlet.engine.connector.ServerHelper;

//import org.restlet.engine.authentication.HttpBasicHelper;
//import org.restlet.engine.http.StreamServerHelper;
//import org.restlet.engine.connector.StreamServerHelper;
//import org.restlet.engine.http.HttpServerHelper;
import org.restlet.engine.connector.HttpServerHelper;
import org.restlet.engine.security.AuthenticatorHelper;
import org.restlet.engine.security.HttpBasicHelper;
//import org.restlet.ext.spring.SpringEngine;
//import com.solers.delivery.rest.SpringEngine;
import org.restlet.engine.Engine;

import com.solers.delivery.content.ContentService;
import com.solers.delivery.content.RestfulContentService;
import com.solers.delivery.domain.ContentSet;
import com.solers.delivery.lucene.LuceneHelper;
import com.solers.delivery.reports.history.LuceneSynchronizationHistory;
import com.solers.delivery.reports.history.ReportDetail;
import com.solers.delivery.reports.history.Synchronization;
import com.solers.delivery.reports.history.SynchronizationHistory;
import com.solers.delivery.rest.auth.DefaultRestAuthentication;
import com.solers.delivery.rest.auth.RestAuthentication;
import com.solers.delivery.rest.connectors.SslClientHelper;
import com.solers.delivery.web.export.ExportService;
import com.solers.delivery.web.export.SynchronizationDetailsExportData;
import com.solers.delivery.web.export.SynchronizationExportData;
import com.solers.util.IOConsole;



public class LuceneExporter {
    
    public static void main(String [] args) {
        Engine engine = new Engine();
        engine.setRegisteredClients(Arrays.asList((ClientHelper) new SslClientHelper(null)));
        engine.setRegisteredServers(Arrays.asList((ServerHelper) new HttpServerHelper(null)));
        //engine.setRegisteredAuthentications(Arrays.asList((AuthenticatorHelper) new HttpBasicHelper()));
        engine.setRegisteredAuthenticators(Arrays.asList((AuthenticatorHelper) new HttpBasicHelper()));
        try {
            run(args);
        } catch (UsageException ex) {
            usage(ex.getMessage());
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }
    
    private static void run(String [] args) throws UsageException {
        checkArgs(args);
        File siteDirectory = getSiteDirectory(args);
        int port = getPort(args);
        String host = "localhost";
        RestAuthentication auth = new DefaultRestAuthentication(getUsername(), getPassword());
        ContentService service = new RestfulContentService(host, port, auth);
        
        if (listing(args)) {
            listContentSets(service);
        } else {
            ContentSet set = getContentSet(args, service);
            if (set != null) {
                export(siteDirectory, set.getId(), set.getName());
            }
        }
    }
    
    private static void listContentSets(ContentService service) {
        IOConsole.DEFAULT.println("Content sets:");
        int count = 1;
        for (ContentSet c : service.getContentSets()) {
            IOConsole.DEFAULT.println((count++)+".) "+c.getName());
        }
    }
    
    private static ContentSet getContentSet(String [] args, ContentService service) {
        String name = args[2];
        for (ContentSet c : service.getContentSets()) {
            if (c.getName().equals(name)) {
                return c;
            }
        }
        IOConsole.DEFAULT.println(name+" is not a valid content set");
        return null;
    }
    
    private static void checkArgs(String [] args) throws UsageException {
        if (args.length < 2) {
            throw new UsageException("Invalid arguments");
        }
    }
    
    private static File getSiteDirectory(String [] args) throws UsageException {
        File siteDirectory = new File(args[0]);
        if (!siteDirectory.exists()) {
            throw new UsageException("Site directory does not exist");
        }
        return siteDirectory;
    }
    
    private static int getPort(String [] args) throws UsageException {
        try {
            return Integer.parseInt(args[1]);
        } catch (NumberFormatException ex) {
            throw new UsageException("Port must be a number");
        }
    }
    
    private static boolean listing(String [] args) {
        return args.length == 2 || args.length == 3 && StringUtils.isBlank(args[2]);
    }
    
    private static String getPassword() {
        return String.valueOf(IOConsole.DEFAULT.readPassword("web", false));
    }
    
    private static String getUsername() {
        return IOConsole.DEFAULT.readLine("Enter [web] username");
    }
    
    private static void export(File siteDirectory, Long id, String name) {
        String strId = String.valueOf(id);
        LuceneHelper helper = new LuceneHelper(siteDirectory);
        File file = new File(helper.getEventDirectory(), strId);
        if (!file.exists()) {
            IOConsole.DEFAULT.println("There are no events for content set: "+name);
            return;
        }
        
        try {
            File workDir = new File(System.getProperty("java.io.tmpdir"), strId+"-workdir");
            workDir.mkdirs();
            
            doExport(workDir, siteDirectory, id, name);
            doZip(workDir, name);
            
            FileUtils.deleteDirectory(workDir);
            System.out.println("Done");
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }
    
    private static void doExport(File workDir, File siteDirectory, Long contentSetId, String exportName) {
        ExportService service = new ExportService(workDir);
        LuceneHelper helper = new LuceneHelper(siteDirectory);
        SynchronizationHistory history = new LuceneSynchronizationHistory(helper);
        
        List<Synchronization> synchronizations = history.getSynchronizations(contentSetId, null, null, false, SynchronizationHistory.PAGE_SIZE);
        service.export(new SynchronizationExportData(false, synchronizations), exportName);
        
        for (Synchronization sync : synchronizations) {
            List<ReportDetail> details = history.getSynchronizationDetails(contentSetId, sync.getId(), null, null, SynchronizationHistory.PAGE_SIZE);
            service.export(new SynchronizationDetailsExportData(false, details), exportName);
        }
        
        System.out.println("Exporting...");
        service.shutdown();
        System.out.println("Export complete");
    }
    
    private static void doZip(File workDir, String name) throws IOException {
        System.out.println("Zipping exported files...");
        File output = new File(name+".zip");
        
        // KRJ 2016-08-31: Converted zipOut and input creation to "try with resources"
        // based on an HP Fortify recommendation
        
        try (ZipOutputStream zipOut = new ZipOutputStream(new FileOutputStream(output))) {
        
            File dir = new File(workDir, name);
        
            for (File f : dir.listFiles()) {
                zipOut.putNextEntry(new ZipEntry(name+File.separator+f.getName()));
                try (InputStream inputStream = new FileInputStream(f)) {
                    IOUtils.copyLarge(inputStream, zipOut);
                }
            }
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
            
        System.out.println("Zipped files to: "+output.getAbsolutePath());
    }
    
    private static void usage(String message) {
        System.err.println(message);
        System.err.println("Usage: java "+LuceneExporter.class.getSimpleName()+" <site directory> <port number> [content set name]");
    }
}


/*package com.solers.delivery.tools;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.util.ResourceUtils;
import org.springframework.web.client.RestTemplate;

import com.solers.delivery.content.ContentService;
import com.solers.delivery.content.RestfulContentService;
import com.solers.delivery.domain.ContentSet;
import com.solers.delivery.lucene.LuceneHelper;
import com.solers.delivery.reports.history.LuceneSynchronizationHistory;
import com.solers.delivery.reports.history.ReportDetail;
import com.solers.delivery.reports.history.Synchronization;
import com.solers.delivery.reports.history.SynchronizationHistory;
import com.solers.delivery.rest.auth.DefaultRestAuthentication;
import com.solers.delivery.rest.auth.RestAuthentication;
import com.solers.delivery.web.export.ExportService;
import com.solers.delivery.web.export.SynchronizationDetailsExportData;
import com.solers.delivery.web.export.SynchronizationExportData;
import com.solers.util.IOConsole;

@Configuration
//@ImportResource("classpath:application-context.xml") // Import your existing Spring XML configuration file
public class LuceneExporter {
    
    @Autowired
    private Environment env;
    
    @Autowired
    private RestTemplate restTemplate;
    
    @Autowired
    @Qualifier("contentService")
    private ContentService contentService;
    
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(LuceneExporter.class);
        context.refresh();
        
        LuceneExporter exporter = context.getBean(LuceneExporter.class);
        
        try {
            exporter.run(args);
        } catch (UsageException ex) {
            exporter.usage(ex.getMessage());
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        
        context.close();
    }
    
    private void run(String[] args) throws UsageException {
        checkArgs(args);
        File siteDirectory = getSiteDirectory(args);
        int port = getPort(args);
        String host = "localhost";
        RestAuthentication auth = new DefaultRestAuthentication(getUsername(), getPassword());
        contentService.setHost(host);
        contentService.setPort(port);
        contentService.setAuthentication(auth);
        
        if (listing(args)) {
            listContentSets();
        } else {
            ContentSet set = getContentSet(args);
            if (set != null) {
                export(siteDirectory, set.getId(), set.getName());
            }
        }
    }
    
    private void listContentSets() {
        IOConsole.DEFAULT.println("Content sets:");
        int count = 1;
        for (ContentSet c : contentService.getContentSets()) {
            IOConsole.DEFAULT.println((count++) + ".) " + c.getName());
        }
    }
    
    private ContentSet getContentSet(String[] args) {
        String name = args[2];
        for (ContentSet c : contentService.getContentSets()) {
            if (c.getName().equals(name)) {
                return c;
            }
        }
        IOConsole.DEFAULT.println(name + " is not a valid content set");
        return null;
    }
    
    private void checkArgs(String[] args) throws UsageException {
        if (args.length < 2) {
            throw new UsageException("Invalid arguments");
        }
    }
    
    private File getSiteDirectory(String[] args) throws UsageException {
        File siteDirectory;
        try {
            siteDirectory = ResourceUtils.getFile(args[0]);
        } catch (IOException ex) {
            throw new UsageException("Site directory does not exist");
        }
        return siteDirectory;
    }
    
    private int getPort(String[] args) throws UsageException {
        try {
            return Integer.parseInt(args[1]);
        } catch (NumberFormatException ex) {
            throw new UsageException("Port must be a number");
        }
    }
    
    private boolean listing(String[] args) {
        return args.length == 2 || (args.length == 3 && StringUtils.isBlank(args[2]));
    }
    
    private String getPassword() {
        return String.valueOf(IOConsole.DEFAULT.readPassword("web", false));
    }
    
    private String getUsername() {
        return IOConsole.DEFAULT.readLine("Enter [web] username");
    }
    
    private void export(File siteDirectory, Long id, String name) {
        String strId = String.valueOf(id);
        LuceneHelper helper = new LuceneHelper(siteDirectory);
        File file = new File(helper.getEventDirectory(), strId);
        if (!file.exists()) {
            IOConsole.DEFAULT.println("There are no events for content set: " + name);
            return;
        }
        
        try {
            File workDir = new File(System.getProperty("java.io.tmpdir"), strId + "-workdir");
            workDir.mkdirs();
            
            doExport(workDir, siteDirectory, id, name);
            doZip(workDir, name);
            
            FileUtils.deleteDirectory(workDir);
            System.out.println("Done");
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }
    
    private void doExport(File workDir, File siteDirectory, Long contentSetId, String exportName) {
        ExportService service = new ExportService(workDir);
        LuceneHelper helper = new LuceneHelper(siteDirectory);
        SynchronizationHistory history = new LuceneSynchronizationHistory(helper);
        
        List<Synchronization> synchronizations = history.getSynchronizations(contentSetId, null, null, false, SynchronizationHistory.PAGE_SIZE);
        service.export(new SynchronizationExportData(false, synchronizations), exportName);
        
        for (Synchronization sync : synchronizations) {
            List<ReportDetail> details = history.getSynchronizationDetails(contentSetId, sync.getId(), null, null, SynchronizationHistory.PAGE_SIZE);
            service.export(new SynchronizationDetailsExportData(false, details), exportName);
        }
        
        System.out.println("Exporting...");
        service.shutdown();
        System.out.println("Export complete");
    }
    
    private void doZip(File workDir, String name) throws IOException {
        System.out.println("Zipping exported files...");
        File output = new File(name + ".zip");
        
        try (ZipOutputStream zipOut = new ZipOutputStream(new FileOutputStream(output))) {
            File dir = new File(workDir, name);
            
            for (File f : dir.listFiles()) {
                zipOut.putNextEntry(new ZipEntry(name + File.separator + f.getName()));
                try (InputStream inputStream = new FileInputStream(f)) {
                    IOUtils.copyLarge(inputStream, zipOut);
                }
            }
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
        
        System.out.println("Zipped files to: " + output.getAbsolutePath());
    }
    
    private void usage(String message) {
        System.err.println(message);
        System.err.println("Usage: java " + LuceneExporter.class.getSimpleName() + " <site directory> <port number> [content set name]");
    }
    
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
    
    @Bean
    @Scope("prototype")
    public ContentService contentService() {
        return new RestfulContentService(contentService.getHost(),contentService.getPort(), contentService.getAuthentication());
    }
    
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
*/


/* original code 
package com.solers.delivery.tools;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.StringUtils;
import org.restlet.engine.connector.ClientHelper;
import org.restlet.engine.connector.ServerHelper;
import org.restlet.engine.security.AuthenticatorHelper;
//import org.restlet.engine.authentication.HttpBasicHelper;
import org.restlet.engine.http.StreamServerHelper;
import org.restlet.ext.spring.SpringEngine;

import com.solers.delivery.content.ContentService;
import com.solers.delivery.content.RestfulContentService;
import com.solers.delivery.domain.ContentSet;
import com.solers.delivery.lucene.LuceneHelper;
import com.solers.delivery.reports.history.LuceneSynchronizationHistory;
import com.solers.delivery.reports.history.ReportDetail;
import com.solers.delivery.reports.history.Synchronization;
import com.solers.delivery.reports.history.SynchronizationHistory;
import com.solers.delivery.rest.auth.DefaultRestAuthentication;
import com.solers.delivery.rest.auth.RestAuthentication;
import com.solers.delivery.rest.connectors.SslClientHelper;
import com.solers.delivery.web.export.ExportService;
import com.solers.delivery.web.export.SynchronizationDetailsExportData;
import com.solers.delivery.web.export.SynchronizationExportData;
import com.solers.util.IOConsole;
import org.restlet.engine.security.HttpBasicHelper;


public class LuceneExporter {
    
    public static void main(String [] args) {
        SpringEngine engine = new SpringEngine();
        engine.setRegisteredClients(Arrays.asList((ClientHelper) new SslClientHelper(null)));
        engine.setRegisteredServers(Arrays.asList((ServerHelper) new StreamServerHelper(null)));
        engine.setRegisteredAuthentications(Arrays.asList((AuthenticatorHelper) new HttpBasicHelper()));
        try {
            run(args);
        } catch (UsageException ex) {
            usage(ex.getMessage());
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }
    
    private static void run(String [] args) throws UsageException {
        checkArgs(args);
        File siteDirectory = getSiteDirectory(args);
        int port = getPort(args);
        String host = "localhost";
        RestAuthentication auth = new DefaultRestAuthentication(getUsername(), getPassword());
        ContentService service = new RestfulContentService(host, port, auth);
        
        if (listing(args)) {
            listContentSets(service);
        } else {
            ContentSet set = getContentSet(args, service);
            if (set != null) {
                export(siteDirectory, set.getId(), set.getName());
            }
        }
    }
    
    private static void listContentSets(ContentService service) {
        IOConsole.DEFAULT.println("Content sets:");
        int count = 1;
        for (ContentSet c : service.getContentSets()) {
            IOConsole.DEFAULT.println((count++)+".) "+c.getName());
        }
    }
    
    private static ContentSet getContentSet(String [] args, ContentService service) {
        String name = args[2];
        for (ContentSet c : service.getContentSets()) {
            if (c.getName().equals(name)) {
                return c;
            }
        }
        IOConsole.DEFAULT.println(name+" is not a valid content set");
        return null;
    }
    
    private static void checkArgs(String [] args) throws UsageException {
        if (args.length < 2) {
            throw new UsageException("Invalid arguments");
        }
    }
    
    private static File getSiteDirectory(String [] args) throws UsageException {
        File siteDirectory = new File(args[0]);
        if (!siteDirectory.exists()) {
            throw new UsageException("Site directory does not exist");
        }
        return siteDirectory;
    }
    
    private static int getPort(String [] args) throws UsageException {
        try {
            return Integer.parseInt(args[1]);
        } catch (NumberFormatException ex) {
            throw new UsageException("Port must be a number");
        }
    }
    
    private static boolean listing(String [] args) {
        return args.length == 2 || args.length == 3 && StringUtils.isBlank(args[2]);
    }
    
    private static String getPassword() {
        return String.valueOf(IOConsole.DEFAULT.readPassword("web", false));
    }
    
    private static String getUsername() {
        return IOConsole.DEFAULT.readLine("Enter [web] username");
    }
    
    private static void export(File siteDirectory, Long id, String name) {
        String strId = String.valueOf(id);
        LuceneHelper helper = new LuceneHelper(siteDirectory);
        File file = new File(helper.getEventDirectory(), strId);
        if (!file.exists()) {
            IOConsole.DEFAULT.println("There are no events for content set: "+name);
            return;
        }
        
        try {
            File workDir = new File(System.getProperty("java.io.tmpdir"), strId+"-workdir");
            workDir.mkdirs();
            
            doExport(workDir, siteDirectory, id, name);
            doZip(workDir, name);
            
            FileUtils.deleteDirectory(workDir);
            System.out.println("Done");
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }
    
    private static void doExport(File workDir, File siteDirectory, Long contentSetId, String exportName) {
        ExportService service = new ExportService(workDir);
        LuceneHelper helper = new LuceneHelper(siteDirectory);
        SynchronizationHistory history = new LuceneSynchronizationHistory(helper);
        
        List<Synchronization> synchronizations = history.getSynchronizations(contentSetId, null, null, false, SynchronizationHistory.PAGE_SIZE);
        service.export(new SynchronizationExportData(false, synchronizations), exportName);
        
        for (Synchronization sync : synchronizations) {
            List<ReportDetail> details = history.getSynchronizationDetails(contentSetId, sync.getId(), null, null, SynchronizationHistory.PAGE_SIZE);
            service.export(new SynchronizationDetailsExportData(false, details), exportName);
        }
        
        System.out.println("Exporting...");
        service.shutdown();
        System.out.println("Export complete");
    }
    
    private static void doZip(File workDir, String name) throws IOException {
        System.out.println("Zipping exported files...");
        File output = new File(name+".zip");
        
        // KRJ 2016-08-31: Converted zipOut and input creation to "try with resources"
        // based on an HP Fortify recommendation
        
        try (ZipOutputStream zipOut = new ZipOutputStream(new FileOutputStream(output))) {
        
            File dir = new File(workDir, name);
        
            for (File f : dir.listFiles()) {
                zipOut.putNextEntry(new ZipEntry(name+File.separator+f.getName()));
                try (InputStream inputStream = new FileInputStream(f)) {
                    IOUtils.copyLarge(inputStream, zipOut);
                }
            }
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
            
        System.out.println("Zipped files to: "+output.getAbsolutePath());
    }
    
    private static void usage(String message) {
        System.err.println(message);
        System.err.println("Usage: java "+LuceneExporter.class.getSimpleName()+" <site directory> <port number> [content set name]");
    }
}
*/