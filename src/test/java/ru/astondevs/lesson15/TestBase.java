package ru.astondevs.lesson15;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import ru.astondevs.lesson15.pages.WildberriesPage;

import java.time.Duration;

public class TestBase {
    protected WildberriesPage WildberriesPage;
    protected WebDriver driver;

    @BeforeEach
    public void setUP() {
        WebDriverManager.chromedriver().clearDriverCache().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WildberriesPage = PageFactory.initElements(driver, WildberriesPage.class);
    }

    @AfterEach
    void tearDown() {
        driver.close();
        driver.quit();
    }
}
