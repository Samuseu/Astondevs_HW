package ru.astondevs.lesson13.selenide;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import ru.astondevs.lesson13.selenide.pages.CheckingTheBlockMtsPage;


public class TestBase {
    CheckingTheBlockMtsPage checkingTheBlockMtsPage = new CheckingTheBlockMtsPage();
    @BeforeAll
    static void beforeAll(){
        Configuration.baseUrl = "https://www.mts.by";
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
    }
}
