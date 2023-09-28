package com.solers.delivery.transport.http.client.util;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

//deprecated
//import org.springframework.beans.factory.annotation.Required;



public class CompressionRules {

    private final List<String> compressibleExtensions;
    private long minimumSizeBytes;

    public CompressionRules() {
        compressibleExtensions = new ArrayList<>();
    }

    //@Required
    @Autowired
    public void setCompressibleExtensions(String compressibleExtensions) {
        String[] extensions = compressibleExtensions.split(",");
        for (String extension : extensions) {
            this.compressibleExtensions.add(extension.trim().toUpperCase());
        }
     }
    
    //@Required
    @Autowired
    public void setMinimumFileSizeBytes(long minimumSizeBytes) {
        this.minimumSizeBytes = minimumSizeBytes;
    }
    
    private String getExtension(String path) {
        if (!path.matches(".*\\.+.+[^\\.]$")) {
            return null;
        } else {
            try {
                return path.substring(path.lastIndexOf('.') + 1, path.length());
            } catch (IndexOutOfBoundsException e) {
                return null;
            }
        } 
    }

    public boolean shouldBeCompressed(String path, long bytes) {
        String ext = getExtension(path);
        return (ext == null) ? false :  compressibleExtensions.contains(ext.toUpperCase()) && bytes >= this.minimumSizeBytes ;
    }
}
