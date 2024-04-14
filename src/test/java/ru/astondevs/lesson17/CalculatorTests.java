package ru.astondevs.lesson17;

import io.qameta.allure.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Epic("Калькулятор")
@Feature("Базовые операции")
public class CalculatorTests extends TestBase {

    @Test
    @Tag("Phone")
    @DisplayName("Тест сложения чисел")
    @Description("Проверка операции сложения двух чисел")
    @Story("Сложение")
    @Owner("Влад Самусев")
    void numberAdditionTest() {
        performNumberAddition();
    }

    @Step("Выполнение сложения чисел")
    void performNumberAddition() {
        calculatorPage.clickDigitButton(2);
        calculatorPage.performOperation("+");
        calculatorPage.clickDigitButton(2);
        calculatorPage.performOperation("=");
        String result = calculatorPage.getResultText();
        Assertions.assertEquals("4", result, "Результат сложения неверен");
    }

    @Test
    @Tag("Phone")
    @DisplayName("Тест вычитания чисел")
    @Description("Проверка операции вычитания двух чисел")
    @Story("Вычитание")
    @Owner("Влад Самусев")
    void subTractionOfNumbersTest() {
        performSubtractionOfNumbers();
    }

    @Step("Выполнение вычитания чисел")
    void performSubtractionOfNumbers() {
        calculatorPage.clickDigitButton(1);
        calculatorPage.clickDigitButton(2);
        calculatorPage.performOperation("-");
        calculatorPage.clickDigitButton(6);
        calculatorPage.performOperation("=");
        String result = calculatorPage.getResultText();
        Assertions.assertEquals("6", result, "Результат вычитания неверен");
    }

    @Test
    @Tag("Phone")
    @DisplayName("Тест умножения чисел")
    @Description("Проверка операции умножения двух чисел")
    @Story("Умножение")
    @Owner("Влад Самусев")
    void multiplicationOfNumbersTest() {
        performMultiplicationOfNumbers();
    }

    @Step("Выполнение умножения чисел")
    void performMultiplicationOfNumbers() {
        calculatorPage.clickDigitButton(3);
        calculatorPage.performOperation("*");
        calculatorPage.clickDigitButton(5);
        calculatorPage.performOperation("=");
        String result = calculatorPage.getResultText();
        Assertions.assertEquals("15", result, "Результат умножения неверен");
    }

    @Test
    @Tag("Phone")
    @DisplayName("Тест деления чисел")
    @Description("Проверка операции деления двух чисел")
    @Story("Деление")
    @Owner("Влад Самусев")
    void divisionOfNumbersTest() {
        performDivisionOfNumbers();
    }

    @Step("Выполнение деления чисел")
    void performDivisionOfNumbers() {
        calculatorPage.clickDigitButton(4);
        calculatorPage.clickDigitButton(9);
        calculatorPage.performOperation("/");
        calculatorPage.clickDigitButton(7);
        calculatorPage.performOperation("=");
        String result = calculatorPage.getResultText();
        Assertions.assertEquals("7", result, "Результат деления неверен");
    }
}
