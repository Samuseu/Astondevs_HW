package ru.astondevs.lesson15;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WildberriesTests extends TestBase {
    @Test
    public void testAddToCart() throws InterruptedException {
        driver.get("https://www.wildberries.ru/");
        List<WebElement> products = driver.findElements(By.cssSelector(".product-card"));
        List<String> expectedProductNames = new ArrayList<>();
        List<String> expectedProductPrice = new ArrayList<>();

        products.get(3).click();
        addProductToCart();
        expectedProductNames.add(getExpectedTittleText());
        expectedProductPrice.add(getExpectedPrice());
        Thread.sleep(1000);
        navigateBack();

        products.get(6).click();
        addProductToCart();
        expectedProductNames.add(getExpectedTittleText());
        expectedProductPrice.add(getExpectedPrice());
        Thread.sleep(1000);
        navigateBack();

        products.get(9).click();
        addProductToCart();
        expectedProductNames.add(getExpectedTittleText());
        expectedProductPrice.add(getExpectedPrice());
        Thread.sleep(1000);
        navigateBack();

        openCartForCheck();

        List<String> actualProductNames = getProductNames();

        Collections.sort(actualProductNames);
        Collections.sort(expectedProductNames);

        Assertions.assertIterableEquals(expectedProductNames, actualProductNames);


        List<String> actualProductPrice = getProductPrice();
        Collections.sort(actualProductPrice);
        Collections.sort(expectedProductPrice);

        System.out.println("Ожидаемые цены товаров:");
        for (String price : expectedProductPrice) {
            System.out.println(price);
        }

        System.out.println("Фактические цены товаров:");
        for (String price : actualProductPrice) {
            System.out.println(price);
        }

        Assertions.assertIterableEquals(expectedProductPrice, actualProductPrice);



        String totalPriceString = driver.findElement(By.cssSelector("p.b-top__total.line span[data-link*='basketPriceWithCurrencyV2']"))
                .getText()
                .replaceAll("[^\\d]", "");
        Long actualTotalPrice = Long.parseLong(totalPriceString);

        Assertions.assertEquals(getTotalProductPrice(), actualTotalPrice);


    }

    public long getTotalProductPrice() throws InterruptedException {
        List<String> productPrices = getProductPrice();

        return productPrices.stream()
                .mapToLong(price -> Long.parseLong(price.replaceAll("[^\\d]", "")))
                .sum();
    }
    private String getExpectedTittleText() {
        WebElement titleText = driver.findElement(By.cssSelector(".product-page__title"));
        return titleText.getText();
    }

    private String getExpectedPrice() {
        WebElement priceText = driver.findElement(By.cssSelector(".price-block__final-price.wallet"));
        return priceText.getText();
    }

    private void addProductToCart() {
        WebElement addToCartButton1 = driver.findElement(By.xpath("(//button[@class='btn-main'])[1]"));
        WebElement addToCartButton2 = driver.findElement(By.xpath("(//button[@class='btn-main'])[2]"));

        try {
            addToCartButton1.click();
        } catch (Exception e) {
            addToCartButton2.click();
        }
        try {
            WebElement sizeDialog = driver.findElement(By.cssSelector(".popup-list-of-sizes.shown"));
            if (sizeDialog.isDisplayed()) {
                WebElement firstSizeOption = sizeDialog.findElement(By.cssSelector(".sizes-list__item"));
                firstSizeOption.click();
            }
        } catch (NoSuchElementException ignored) {
        }
    }

    private void navigateBack() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.history.back()");
    }

    private void openCartForCheck() {
        WebElement element = driver.findElement(By.cssSelector(".navbar-pc__icon--basket"));
        element.click();
    }

    public List<String> getProductNames() {
        List<WebElement> productElements = driver.findElements(By.cssSelector(".good-info__good-name"));
        List<String> productNames = new ArrayList<>();

        for (WebElement productElement : productElements) {
            productNames.add(productElement.getText());
        }
        return productNames;
    }

    public List<String> getProductPrice() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Thread.sleep(10000);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".list-item__price-new.wallet")));

        List<WebElement> productPriceElements = driver.findElements(By.cssSelector(".list-item__price-new.wallet"));
        List<String> productPrice = new ArrayList<>();
        for (WebElement productElement : productPriceElements) {
            productPrice.add(productElement.getText());
        }
        return productPrice;
    }
}

