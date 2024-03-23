package ru.astondevs.lesson12;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class FactorialTests {
    @DisplayName("Тестирование вычисления факториала для положительных чисел ")
    @CsvSource({
            "2,2",
            "3,6",
            "4,24",
            "5,120",
            "6,720",
    })
    @ParameterizedTest(name = "Факториал {0} должен быть равен {1}")
    @Tag("UNIT_TEST")
    public void testFactorialOfPositive(
            int input,
            int expected) {
        Assertions.assertEquals(expected, Factorial.factorial(input));

    }

    @DisplayName("Тестирование вычисления факториала для нуля")
    @Test
    @Tag("UNIT_TEST")
    public void testFactorialOfZero() {
        Assertions.assertEquals(1, Factorial.factorial(0));
    }

    @DisplayName("Тестирование вычисления факториала для отрицательных чисел")
    @ParameterizedTest(name = "Факториал от отрицательного числа {0} должен вызывать исключение")
    @ValueSource(
            ints = {-2,
                    -3,
                    -4,
                    -5}
    )
    @Tag("UNIT_TEST")
    public void testFactorialOfNegative(int input) {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Factorial.factorial(input));
    }
}
