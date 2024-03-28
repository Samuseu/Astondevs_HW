package ru.astondevs.lesson13.selenide.pages;

import static com.codeborne.selenide.Selenide.open;

public class CheckingTheBlockMtsPage {
    public CheckingTheBlockMtsPage openPage() {
        open("/");
        return this;
    }
}
