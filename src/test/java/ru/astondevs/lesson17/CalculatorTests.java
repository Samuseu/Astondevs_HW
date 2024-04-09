package ru.astondevs.lesson17;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class CalculatorTests extends TestBase {

    @Test
    @DisplayName("Тест сложения чисел")
    void numberAdditionTest() {
        calculatorPage.clickDigitButton(2)
                .performOperation("+")
                .clickDigitButton(2)
                .performOperation("=");
        String result = calculatorPage.getResultText();
        Assertions.assertEquals("4", result, "Результат сложения неверен");
    }

    @Test
    @DisplayName("Тест вычитания чисел")
    void subTractionOfNumbersTest() {
        calculatorPage.clickDigitButton(1)
                .clickDigitButton(2)
                .performOperation("-")
                .clickDigitButton(6)
                .performOperation("=");
        String result = calculatorPage.getResultText();
        Assertions.assertEquals("6", result, "Результат вычитания неверен");
    }

    @Test
    @DisplayName("Тест умножение чисел")
    void multiplicationOfNumbersTest() {
        calculatorPage.clickDigitButton(3)
                .performOperation("*")
                .clickDigitButton(5)
                .performOperation("=");
        String result = calculatorPage.getResultText();
        Assertions.assertEquals("15", result, "Результат умножения неверен");
    }

    @Test
    @DisplayName("Тест деление чисел")
    void divisionOfNumbersTest() {
        calculatorPage.clickDigitButton(4)
                .clickDigitButton(9)
                .performOperation("/")
                .clickDigitButton(7)
                .performOperation("=");
        String result = calculatorPage.getResultText();
        Assertions.assertEquals("7", result, "Результат деления неверен");
    }
}
