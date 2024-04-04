package ru.astondevs.lesson15;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WildberriesTests extends TestBase {
    @Test
    public void testAddToCart() throws InterruptedException {
        List<String> expectedProductNames = new ArrayList<>();
        List<String> expectedProductPrice = new ArrayList<>();

        wildberriesPage.baseUrl()
                .acceptCookies();
        for (int i = 0; i < 3; i++) {
            int randomIndex = wildberriesPage.generateRandomNumber(1, 28);
            wildberriesPage.selectProduct(randomIndex)
                    .addProductToCart();
            expectedProductNames.add(wildberriesPage.getExpectedTittleText());
            expectedProductPrice.add(wildberriesPage.getExpectedPrice());
            wildberriesPage.navigateBack();
        }

        wildberriesPage.openCartForCheck();

        List<String> actualProductNames = wildberriesPage.getProductNames();
        Collections.sort(actualProductNames);
        Collections.sort(expectedProductNames);
        Assertions.assertIterableEquals(expectedProductNames, actualProductNames);

        List<String> actualProductPrice = wildberriesPage.getProductPrice();
        Collections.sort(actualProductPrice);
        Collections.sort(expectedProductPrice);
        Assertions.assertIterableEquals(expectedProductPrice, actualProductPrice);

        Assertions.assertEquals(wildberriesPage.getTotalProductPrice(), wildberriesPage.getActualTotalPrice());
    }
}


