package org.appium.driver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.appium.utils.ConfigReader;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AndroidDriverManager {
    public static AndroidDriver initializeDriver() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, ConfigReader.DEVICE_NAME.getProperty());
        desiredCapabilities.setCapability(MobileCapabilityType.UDID, ConfigReader.UDID.getProperty());
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, ConfigReader.PLATFORM_NAME.getProperty());
        desiredCapabilities.setCapability("appPackage", ConfigReader.APP_PACKAGE.getProperty());
        desiredCapabilities.setCapability("appActivity", ConfigReader.APP_ACTIVITY.getProperty());

        URL url = new URL (ConfigReader.URL.getProperty());

        return new AndroidDriver(url, desiredCapabilities);
    }
}
