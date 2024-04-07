package ru.astondevs.lesson17;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

import java.net.MalformedURLException;
import java.net.URL;

public class TestBase {
    public static AndroidDriver driver;

    @BeforeAll
    static void beforeAll() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Redmi note 9 Pro");
        options.setPlatformVersion("12.0");
        options.setAppPackage("com.google.android.calculator");
        options.setAppActivity("com.android.calculator2.Calculator");
        options.setNoReset(true);
        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), options);
    }

    @AfterEach
    void afterEach() {
        driver.quit();
    }
}
