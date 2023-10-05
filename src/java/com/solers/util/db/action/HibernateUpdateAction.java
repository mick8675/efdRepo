package com.solers.util.db.action;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.hibernate.tool.hbm2ddl.SchemaExport.Action;

import com.solers.util.db.Database;
import org.hibernate.tool.hbm2ddl.SchemaUpdate;
import org.hibernate.tool.schema.TargetType;

public class HibernateUpdateAction implements DatabaseAction {

    private static final Logger log = Logger.getLogger(HibernateUpdateAction.class);
    
    private Properties hibernateProperties;
    private Class<?> [] hibernateClasses;
    
    public void setHibernateProperties(Properties hibernateProperties) {
        this.hibernateProperties = hibernateProperties;
    }

    public void setHibernateClasses(Class<?>[] hibernateClasses) {
        this.hibernateClasses = Arrays.copyOf(hibernateClasses, hibernateClasses.length);
    }
    
    @Override
    public void execute(Database db) {
        StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
            .applySettings(hibernateProperties)
            .build();

        MetadataSources metadataSources = new MetadataSources(serviceRegistry);

        for (Class<?> clazz : hibernateClasses) {
            metadataSources.addAnnotatedClass(clazz);
        }

        Metadata metadata = metadataSources.buildMetadata();

        Connection conn = null;
        Statement stmt = null;

        try {
            conn = db.getConnection();
            stmt = conn.createStatement();
            
            SchemaUpdate schemaUpdate = new SchemaUpdate();
            schemaUpdate.setHaltOnError(true);
            schemaUpdate.setDelimiter(";");
            schemaUpdate.execute(EnumSet.of(TargetType.DATABASE), metadata, serviceRegistry);




        } catch (SQLException ex) {
            log.error("Error updating hibernate", ex);
        } finally {
            close(stmt);
            close(conn);
            StandardServiceRegistryBuilder.destroy(serviceRegistry);
        }
    }
    
    private void close(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException ignore) {
                log.error("Error closing connection: " + ignore.getMessage(), ignore);
            }
        }
    }
    
    private void close(Statement stmt) {
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException ignore) {
                log.error("Error closing statement: " + ignore.getMessage(), ignore);
            }
        }
    }
}

// DatabaseAction remains unchanged



/*package com.solers.util.db.action;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.dialect.Dialect;
import org.hibernate.engine.jdbc.connections.spi.ConnectionProvider;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.hibernate.tool.schema.TargetType;

import com.solers.util.db.Database;
import java.util.EnumSet;
import org.springframework.stereotype.Component;


public class HibernateUpdateAction implements DatabaseAction 
{

    private static final Logger log = Logger.getLogger(HibernateUpdateAction.class);

    private Properties hibernateProperties;
    private Class<?>[] hibernateClasses;

    public void setHibernateProperties(Properties hibernateProperties) 
    {
        this.hibernateProperties = hibernateProperties;
    }

    public void setHibernateClasses(Class<?>[] hibernateClasses) 
    {
        this.hibernateClasses = Arrays.copyOf(hibernateClasses, hibernateClasses.length);
    }

    @Override
    public void execute(Database db) 
    {
        StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                .applySettings(hibernateProperties)
                .build();

        MetadataSources metadataSources = new MetadataSources(serviceRegistry);
        for (Class<?> clazz : hibernateClasses) 
        {
            metadataSources.addAnnotatedClass(clazz);
        }

        Metadata metadata = metadataSources.buildMetadata();

        Dialect dialect = metadata.getDatabase().getDialect();

        Connection conn = null;
        Statement stmt = null;
        try 
        {
            conn = db.getConnection();
            stmt = conn.createStatement();

            SessionFactoryImplementor sessionFactory = (SessionFactoryImplementor) metadata
                    .getSessionFactoryBuilder()
                    .build();

            ConnectionProvider connectionProvider = sessionFactory
                    .getServiceRegistry()
                    .getService(ConnectionProvider.class);

            SchemaExport schemaExport = new SchemaExport();
            schemaExport.setHaltOnError(true);
            schemaExport.setFormat(true);
            schemaExport.setDelimiter(";");

            schemaExport.execute(EnumSet.of(TargetType.DATABASE), SchemaExport.Action.CREATE, metadata, serviceRegistry);
            //schemaUpdate.execute(EnumSet.of(TargetType.SCRIPT), metadata.buildMetadata());
        } 
            catch (SQLException ex) 
        {
            log.error("Error updating Hibernate", ex);
        } 
        finally 
        {
            close(stmt);
            close(conn);
            StandardServiceRegistryBuilder.destroy(serviceRegistry);
        }
    }

    private void close(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException ignore) {
                log.error("Error closing connection: " + ignore.getMessage(), ignore);
            }
        }
    }

    private void close(Statement stmt) {
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException ignore) {
                log.error("Error closing statement: " + ignore.getMessage(), ignore);
            }
        }
    }
}
*/


//original code is below
/*
package com.solers.util.db.action;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.dialect.Dialect;
import org.hibernate.tool.hbm2ddl.DatabaseMetadata;

import com.solers.util.db.Database;

public class HibernateUpdateAction implements DatabaseAction {
    
    private static final Logger log = Logger.getLogger(HibernateUpdateAction.class);
    
    private Properties hibernateProperties;
    private Class<?> [] hibernateClasses;
    
    public void setHibernateProperties(Properties hibernateProperties) {
        this.hibernateProperties = hibernateProperties;
    }

    public void setHibernateClasses(Class<?>[] hibernateClasses) {
        this.hibernateClasses = Arrays.copyOf(hibernateClasses, hibernateClasses.length);
    }
    
    @Override
    public void execute(Database db) {
        AnnotationConfiguration config = new AnnotationConfiguration();
        config.setProperties(hibernateProperties);
        
        for (Class<?> clazz : hibernateClasses) {
            config.addAnnotatedClass(clazz);
        }
        
        Dialect dialect = Dialect.getDialect(hibernateProperties);
        
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = db.getConnection();
            stmt = conn.createStatement();
            DatabaseMetadata meta = new DatabaseMetadata(conn, dialect);
            
            String [] sqlStatements = config.generateSchemaUpdateScript(dialect, meta);
            for (String sql : sqlStatements) {
                stmt.executeUpdate(sql);
            }
        } catch (SQLException ex) {
            log.error("Error updating hibernate", ex);
        } finally {
            close(stmt);
            close(conn);
        }
    }
    
    private void close(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException ignore) {
                log.error("Error closing connection: " + ignore.getMessage(), ignore);
            }
        }
    }
    
    private void close(Statement stmt) {
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException ignore) {
                log.error("Error closing statement: " + ignore.getMessage(), ignore);
            }
        }
    }
    
}*/








//_______________________________________________________________________________________
/*package com.solers.util.db.action;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.hibernate.cfg.Configuration;
import org.hibernate.dialect.Dialect;
import org.hibernate.service.Service;
//import org.hibernate.tool.hbm2ddl.DatabaseMetadata;
import org.hibernate.tool.hbm2ddl.SchemaUpdateTask;

import com.solers.util.db.Database;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.boot.registry.classloading.spi.ClassLoaderService;
import org.hibernate.boot.spi.MetadataImplementor;
import org.hibernate.engine.jdbc.dialect.internal.StandardDialectResolver;
import org.hibernate.engine.jdbc.dialect.spi.DatabaseMetaDataDialectResolutionInfoAdapter;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.hibernate.tool.hbm2ddl.SchemaUpdate;
import org.hibernate.tool.schema.TargetType;
import org.apache.derby.jdbc.EmbeddedDriver;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.service.ServiceRegistry;
//import org.hibernate.boot.Metadata;
import org.restlet.data.Metadata;
import org.springframework.beans.factory.annotation.Autowired;
//import org.restlet.data.Metadata;



public class HibernateUpdateAction implements DatabaseAction {
    
    private static final Logger log = Logger.getLogger(HibernateUpdateAction.class);
    
    
    
    private Properties hibernateProperties;
    private Class<?> [] hibernateClasses;
    
    public void setHibernateProperties(Properties hibernateProperties) 
    {
        this.hibernateProperties = hibernateProperties;
    }

    public void setHibernateClasses(Class<?>[] hibernateClasses) 
    {
        this.hibernateClasses = Arrays.copyOf(hibernateClasses, hibernateClasses.length);
    }
    
    @Autowired
    private static SessionFactory sessionFactory;
    
    @Override
    public void execute(Database db) 
    {
        Configuration config = new Configuration();
        config.setProperties(hibernateProperties);
        
        for (Class<?> clazz : hibernateClasses) 
        {
            config.addAnnotatedClass(clazz);
        }
        
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = db.getConnection();
            stmt = conn.createStatement();
            //DatabaseMetadata meta = new DatabaseMetadata(conn, dialect);
             //getDialect is deprecated
            //Dialect dialect = Dialect.getDialect(hibernateProperties);
            Dialect dialect = new StandardDialectResolver().resolveDialect(
                    new DatabaseMetaDataDialectResolutionInfoAdapter(conn.getMetaData()));
            
           ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
           sessionFactory = config.buildSessionFactory(serviceRegistry);
           
            Map settings = new HashMap();
            settings.put("hibernate.dialect", dialect);
            MetadataSources metadata = new MetadataSources(new StandardServiceRegistryBuilder().applySettings(settings).build());
            for (Class<?> clazz : hibernateClasses) 
            {
                metadata.addAnnotatedClass(clazz);
            }
            //SchemaExport schemaExport = new SchemaExport();
            SchemaUpdate schemaUpdate = new SchemaUpdate();
            schemaUpdate.setFormat(true);
            schemaUpdate.execute(EnumSet.of(TargetType.SCRIPT), metadata.buildMetadata());
            
//metadataSources.addAnnotatedClass();
//metadataSources.addResource()
            
            
        } catch (SQLException ex) {
            log.error("Error updating hibernate", ex);
        } finally {
            close(stmt);
            close(conn);
        }
    }
    
    private void close(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException ignore) {
                log.error("Error closing connection: " + ignore.getMessage(), ignore);
            }
        }
    }
    
    private void close(Statement stmt) {
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException ignore) {
                log.error("Error closing statement: " + ignore.getMessage(), ignore);
            }
        }
    }
    
}//_____________________________________end class_______________________________


*/