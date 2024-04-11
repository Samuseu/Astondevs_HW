package ru.astondevs.lesson15;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class WildberriesTests extends TestBase {
    @DisplayName("Smoke тестирование для сайта wildberries.ru")
    @Test
    public void testAddToCart() throws InterruptedException {
        List<String> expectedProductNames = new ArrayList<>();
        List<String> expectedProductPrice = new ArrayList<>();

        wildberriesPage.baseUrl()
                .selectThreeRandomProducts(expectedProductNames, expectedProductPrice)
                .openCartForCheck();


        List<String> actualProductNames = wildberriesPage.getProductNames();
        List<String> actualProductPrice = wildberriesPage.getProductPrice();

        wildberriesPage.verifyProductNames(expectedProductNames, actualProductNames);
        wildberriesPage.verifyProductPrice(expectedProductPrice, actualProductPrice);
        wildberriesPage.verifyTotalPrice();
        wildberriesPage.verifyItemCount(7);
    }
}


