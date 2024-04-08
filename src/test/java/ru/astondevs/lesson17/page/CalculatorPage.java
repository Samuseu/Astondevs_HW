package ru.astondevs.lesson17.page;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class CalculatorPage {
    private AndroidDriver driver;

    public WebElement digit0Button;
    public WebElement digit1Button;
    public WebElement digit2Button;
    public WebElement digit3Button;
    public WebElement digit4Button;
    public WebElement digit5Button;
    public WebElement digit6Button;
    public WebElement digit7Button;
    public WebElement digit8Button;
    public WebElement digit9Button;
    public WebElement additionButton;
    public WebElement subtractionButton;
    public WebElement multiplicationButton;
    public WebElement divisionButton;
    public WebElement equalsButton;
    public WebElement clearButton;
    public WebElement resultTextView;

    public CalculatorPage(AndroidDriver driver) {
        this.driver = driver;
        initializeElements();
    }
    private void initializeElements() {
        digit0Button = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='0']"));
        digit1Button = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='1']"));
        digit2Button = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='2']"));
        digit3Button = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='3']"));
        digit4Button = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='4']"));
        digit5Button = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='5']"));
        digit6Button = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='6']"));
        digit7Button = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='7']"));
        digit8Button = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='8']"));
        digit9Button = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='9']"));
        additionButton = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='сложить']"));
        subtractionButton = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='вычесть']"));
        multiplicationButton = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='умножение']"));
        divisionButton = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='разделить']"));
        clearButton = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='сбросить']"));
        equalsButton = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='равно']"));
        resultTextView = driver.findElement(By.id("com.google.android.calculator:id/formula"));
    }

    public CalculatorPage clickDigitButton(int digit) {
        switch (digit) {
            case 0: digit0Button.click(); break;
            case 1: digit1Button.click(); break;
            case 2: digit2Button.click(); break;
            case 3: digit3Button.click(); break;
            case 4: digit4Button.click(); break;
            case 5: digit5Button.click(); break;
            case 6: digit6Button.click(); break;
            case 7: digit7Button.click(); break;
            case 8: digit8Button.click(); break;
            case 9: digit9Button.click(); break;
        }
        return this;
    }

    public CalculatorPage performOperation(String operation) {
        switch (operation) {
            case "+": additionButton.click(); break;
            case "-": subtractionButton.click(); break;
            case "*": multiplicationButton.click(); break;
            case "/": divisionButton.click(); break;
            case "=": equalsButton.click(); break;
            case "C": clearButton.click(); break;
        }
        return this;
    }
    public String getResultText() {
        resultTextView = driver.findElement(By.id("com.google.android.calculator:id/result_final"));
        return resultTextView.getText();

    }
}
