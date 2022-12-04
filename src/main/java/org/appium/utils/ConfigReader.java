package org.appium.utils;

import java.util.Properties;

public enum ConfigReader {
    DEVICE_NAME,
    UDID,
    PLATFORM_NAME,
    APP_PACKAGE,
    APP_ACTIVITY,
    URL;

    private final Properties properties;

    ConfigReader() {
        String configPath = "./environments/";
         this.properties = PropertyUtils.propertyLoader(configPath + "config.properties");
    }

    public String getProperty() {
        return properties.getProperty(this.toString());
    }
}
