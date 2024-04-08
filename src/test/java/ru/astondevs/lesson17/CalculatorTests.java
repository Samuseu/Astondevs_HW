package ru.astondevs.lesson17;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class CalculatorTests extends TestBase {

    @Test
    @DisplayName("Тест сложения чисел")
    void additionTest() throws InterruptedException {
        calculatorPage.clickDigitButton(2)
                .performOperation("+")
                .clickDigitButton(2)
                .performOperation("=");
        String result = calculatorPage.getResultText();
        Assertions.assertEquals("4", result, "Результат сложения неверен");
    }
}
