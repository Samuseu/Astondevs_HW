package ru.astondevs.lesson15.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WildberriesPage {

    private WebDriver driver;

    public WildberriesPage(WebDriver driver) {
        this.driver = driver;
    }

    private final String BASE_URL = "https://www.wildberries.ru/";

    public WildberriesPage baseUrl() {
        driver.get(BASE_URL);
        return this;
    }

    public WildberriesPage acceptCookies() {
        WebElement agreeCookies = driver.findElement(By.cssSelector(".cookies__btn.btn-minor-md"));
        agreeCookies.click();
        return this;
    }

    public int generateRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    public WildberriesPage selectProduct(int index) {
        List<WebElement> products = driver.findElements(By.cssSelector(".product-card"));
        products.get(index).click();
        return this;
    }

    public WildberriesPage addProductToCart() {
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
        return this;
    }

    public WildberriesPage navigateBack() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.history.back()");
        return this;
    }

    public WildberriesPage openCartForCheck() {
        WebElement element = driver.findElement(By.cssSelector(".navbar-pc__icon--basket"));
        element.click();
        return this;
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
        Thread.sleep(5000);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".list-item__price-new.wallet")));

        List<WebElement> productPriceElements = driver.findElements(By.cssSelector(".list-item__price-new.wallet"));
        List<String> productPrice = new ArrayList<>();
        for (WebElement productElement : productPriceElements) {
            productPrice.add(productElement.getText());
        }
        return productPrice;
    }

    public String getExpectedTittleText() {
        WebElement titleText = driver.findElement(By.cssSelector(".product-page__title"));
        return titleText.getText();
    }

    public String getExpectedPrice() {
        WebElement priceText = driver.findElement(By.cssSelector(".price-block__final-price.wallet"));
        return priceText.getText();
    }

    public long getTotalProductPrice() throws InterruptedException {
        List<String> productPrices = getProductPrice();
        return productPrices.stream()
                .mapToLong(price -> Long.parseLong(price.replaceAll("[^\\d]", "")))
                .sum();
    }

    public long getActualTotalPrice() {
        String totalPriceString = driver.findElement(By.cssSelector("p.b-top__total.line span[data-link*='basketPriceWithCurrencyV2']"))
                .getText()
                .replaceAll("[^\\d]", "");
        return Long.parseLong(totalPriceString);
    }
}