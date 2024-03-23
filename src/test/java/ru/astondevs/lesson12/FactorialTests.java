package ru.astondevs.lesson12;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FactorialTests {
    @DataProvider(name = "positiveNumbers")
    public Object[][] positiveNumbers() {
        return new Object[][]{
                {2, 2},
                {3, 6},
                {4, 24},
                {5, 120},
                {6, 720}
        };
    }

    @Test(dataProvider = "positiveNumbers")
    public void testFactorialOfPositive(int input, int expected) {
        Assert.assertEquals(Factorial.factorial(input), expected);
    }


    @Test
    public void testFactorialOfZero() {
        Assert.assertEquals(Factorial.factorial(0), 1);
    }



    @DataProvider(name = "negativeNumbers")
    public Object[] negativeNumbers() {
        return new Object[]{-2, -3, -4, -5};
    }

    @Test(dataProvider = "negativeNumbers", expectedExceptions = IllegalArgumentException.class)
    public void testFactorialOfNegative(int input) {
        Factorial.factorial(input);
    }
}
