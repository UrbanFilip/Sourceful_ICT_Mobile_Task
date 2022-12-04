package org.appium.test;

import io.appium.java_client.android.AndroidDriver;
import org.appium.driver.AndroidDriverManager;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;


public class BaseTest {
    protected ThreadLocal<AndroidDriver> driver = new ThreadLocal<>();
    private void setDriver(AndroidDriver driver) {
        this.driver.set(driver);
    }
    protected AndroidDriver getDriver() {
        return this.driver.get();
    }

    @BeforeMethod
    public void setup() throws MalformedURLException {
        setDriver(AndroidDriverManager.initializeDriver());
    }

    @AfterMethod
    public void tearDown() {
        getDriver().quit();
    }
}
