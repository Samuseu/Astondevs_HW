package ru.astondevs.lesson13_14.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import ru.astondevs.lesson13_14.selenium.pages.MtsPage;

import java.time.Duration;

public class TestBase {
    protected MtsPage mtsPage;
    protected WebDriver driver;

    @BeforeEach
    public void setUP() {
        WebDriverManager.chromedriver().clearDriverCache().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        mtsPage = PageFactory.initElements(driver, MtsPage.class);
    }

    @AfterEach
    void tearDown() {
        driver.close();
        driver.quit();
    }
}
