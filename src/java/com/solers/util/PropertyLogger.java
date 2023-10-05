package com.solers.util;



import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

/**
 *
 * @author Mick Lecher - NPD Contract -- used to test the properties and output to the logger in the installer portion of this project.
 */

@Component
public class PropertyLogger {

   // private static final Log log = LogFactory.getLog(PropertyLogger.class);
    protected static final Logger log = Logger.getLogger(PropertyLogger.class);
    
    private String propertyValue;
    private String propertyName;

    public void setPropertyValue(String propertyValue) {
        this.propertyValue = propertyValue;
    }
    
    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public void logProperty() {
        log.info("\n~~\nProperty Logger: "+propertyName + "=" + propertyValue + "\n~~\n");
    }
}

