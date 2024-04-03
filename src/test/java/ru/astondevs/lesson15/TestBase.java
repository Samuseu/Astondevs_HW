package ru.astondevs.lesson15;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.astondevs.lesson15.pages.WildberriesPage;

import java.time.Duration;

public class TestBase {
    protected WildberriesPage wildberriesPage;
    protected WebDriver driver;

    @BeforeEach
    public void setUp() {
        WebDriverManager.chromedriver().clearDriverCache().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        wildberriesPage = new WildberriesPage(driver);
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }
}