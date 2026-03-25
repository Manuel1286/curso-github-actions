package com.exito.driver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;


public class AppiumAdroidDriver {

    public static AppiumDriver<MobileElement> driver;

    public static AppiumAdroidDriver openApplication() {
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("deviceName", "Pixel XL  API 33 2");
            capabilities.setCapability("udid", "emulator-5554");
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("noReset", "true");
            capabilities.setCapability("platformVersion", "15");
            capabilities.setCapability("appPackage", "com.exito.appcompania");
            capabilities.setCapability("appActivity", "com.apps.ecommerce.flutter.apps_ecommerce_flutter.MainActivity");
            capabilities.setCapability("automationName", "UiAutomator2");

            driver = new AppiumDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        return new AppiumAdroidDriver();

    }

    public io.appium.java_client.AppiumDriver<MobileElement> onDriver() {
        return driver;
    }
}
