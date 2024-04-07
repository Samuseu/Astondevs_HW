package ru.astondevs.lesson17.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import ru.astondevs.lesson17.TestBase;

public class CalculatorTests extends TestBase {
    @Test
    public void additionTest() {
        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='2']")).click();
        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='сложить']")).click();
        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='3']")).click();
        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='равно']")).click();
        String result = driver.findElement(By.className("android.widget.TextView")).getText();
        Assertions.assertEquals(result, "5");
    }

}
