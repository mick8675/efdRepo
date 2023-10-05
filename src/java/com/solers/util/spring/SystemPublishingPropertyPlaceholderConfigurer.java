package com.solers.util.spring;

import java.util.Enumeration;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

/**
 * Publishes all resolved properties to the System using {@code System.setProperty(String,String)}
 * 
 */
public class SystemPublishingPropertyPlaceholderConfigurer extends PropertyPlaceholderConfigurer {

    private static final Logger log = Logger.getLogger(SystemPublishingPropertyPlaceholderConfigurer.class);
    
    @Override
    protected void processProperties(ConfigurableListableBeanFactory factory, Properties properties) throws BeansException {
        super.processProperties(factory, properties);
        
        for (Enumeration<?> e = properties.propertyNames(); e.hasMoreElements();) {
            String key = (String) e.nextElement();
            if (System.getProperty(key) == null) {
                System.setProperty(key, properties.getProperty(key));
                log.info("++++++++ Adding "+key+"="+System.getProperty(key)+"\n");
            } else {
               log.info("--------Already defined in system properties, skipping "+key+"="+System.getProperty(key)+"\n");
               
            }
        }
        log.info("All properties: " + properties);

    }
}







/*package com.solers.util.spring;

import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.stereotype.Component;

import java.util.Properties;


@Component
public class SystemPublishingPropertyPlaceholderConfigurer extends PropertySourcesPlaceholderConfigurer {

    private static final Logger log = Logger.getLogger(SystemPublishingPropertyPlaceholderConfigurer.class);
    
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        super.postProcessBeanFactory(beanFactory);

        ConfigurableEnvironment env = (ConfigurableEnvironment) getAppliedPropertySources();

        if (env != null) {
            Properties properties = new Properties();
            env.getPropertySources().forEach(ps -> {
                if (ps instanceof PropertiesPropertySource) {
                    properties.putAll(((PropertiesPropertySource) ps).getSource());
                }
            });

            properties.forEach((key, value) -> {
                String keyStr = String.valueOf(key);
                if (System.getProperty(keyStr) == null) {
                    System.setProperty(keyStr, String.valueOf(value));
                } else {
                    log.info(keyStr + " already defined in system properties, skipping");
                }
            });
        }
    }
}
*/


/**
 * Publishes all resolved properties to the System using {@code System.setProperty(String,String)}
 */
/*
@Component
public class SystemPublishingPropertyPlaceholderConfigurer extends PropertySourcesPlaceholderConfigurer{//PropertyPlaceholderConfigurer {

    private static final Logger log = Logger.getLogger(SystemPublishingPropertyPlaceholderConfigurer.class);
    
    @Override
    protected void processProperties(ConfigurableListableBeanFactory factory, Properties properties) throws BeansException {
        super.postProcessBeanFactory(factory);//doProcessProperties(factory, (StringValueResolver) properties);
        
        for (Enumeration<?> e = properties.propertyNames(); e.hasMoreElements();) {
            String key = (String) e.nextElement();
            if (System.getProperty(key) == null) {
                System.setProperty(key, properties.getProperty(key));
            } else {
               log.info(key+" already defined in system properties, skipping");
            }
        }
    }
}
*/



/*package com.solers.util.spring;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.EnumerablePropertySource;
import org.springframework.core.env.PropertySource;

@Configuration
public class SystemPublishingPropertyPlaceholderConfigurer 
{

    private static final Logger log = Logger.getLogger(SystemPublishingPropertyPlaceholderConfigurer.class);

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer(ConfigurableEnvironment environment) 
    {
        PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
        configurer.setEnvironment(environment);
        return configurer;
    }

    public static void publishSystemProperties(ConfigurableEnvironment environment) 
    {
        for (PropertySource<?> propertySource : environment.getPropertySources()) 
        {
            if (propertySource instanceof EnumerablePropertySource) 
            {
                EnumerablePropertySource<?> enumerablePropertySource = (EnumerablePropertySource<?>) propertySource;
                for (String propertyName : enumerablePropertySource.getPropertyNames()) 
                {
                    if (System.getProperty(propertyName) == null) 
                    {
                        Object propertyValue = enumerablePropertySource.getProperty(propertyName);
                        if (propertyValue != null) 
                        {
                            System.setProperty(propertyName, propertyValue.toString());
                        }
                    } 
                    else 
                    {
                        log.info(propertyName + " already defined in system properties, skipping");
                    }
                }
            }
        }
    }
}*/





/*package com.solers.util.spring;

import java.util.Enumeration;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.EnumerablePropertySource;
import org.springframework.core.env.PropertySource;
import org.springframework.stereotype.Component;

@Component
public class SystemPublishingPropertyPlaceholderConfigurer extends PropertySourcesPlaceholderConfigurer implements BeanFactoryPostProcessor 
{

    private static final Logger log = Logger.getLogger(SystemPublishingPropertyPlaceholderConfigurer.class);

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException 
    {
        ConfigurableEnvironment environment = beanFactory.getBean(ConfigurableEnvironment.class);
        for (PropertySource<?> propertySource : environment.getPropertySources()) 
        {
            if (propertySource instanceof EnumerablePropertySource) 
            {
                EnumerablePropertySource<?> enumerablePropertySource = (EnumerablePropertySource<?>) propertySource;
                for (String propertyName : enumerablePropertySource.getPropertyNames()) 
                {
                    if (System.getProperty(propertyName) == null) 
                    {
                        Object propertyValue = enumerablePropertySource.getProperty(propertyName);
                        if (propertyValue != null) 
                        {
                            System.setProperty(propertyName, propertyValue.toString());
                        }
                    } 
                    else 
                    {
                        log.info(propertyName + " already defined in system properties, skipping");
                    }
                }
            }
        }
    }
    
       
    
}*/




/*package com.solers.util.spring;

import java.util.Enumeration;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

//deprecated
//import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
*/

/**
 * Publishes all resolved properties to the System using {@code System.setProperty(String,String)}
 * 
 */

/*
public class SystemPublishingPropertyPlaceholderConfigurer extends PropertySourcesPlaceholderConfigurer {// PropertyPlaceholderConfigurer {

    private static final Logger log = Logger.getLogger(SystemPublishingPropertyPlaceholderConfigurer.class);
    
    @Override
    protected void processProperties(ConfigurableListableBeanFactory factory, Properties properties) throws BeansException 
    {
        super.processProperties(factory, properties);
        
        for (Enumeration<?> e = properties.propertyNames(); e.hasMoreElements();) 
        {
            String key = (String) e.nextElement();
            if (System.getProperty(key) == null) 
            {
                System.setProperty(key, properties.getProperty(key));
            } 
            else 
            {
               log.info(key+" already defined in system properties, skipping");
            }
        }
    }
}
*/