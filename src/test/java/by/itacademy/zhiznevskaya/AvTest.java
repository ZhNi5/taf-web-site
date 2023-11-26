package by.itacademy.zhiznevskaya;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AvTest extends BaseTest {
    @Test
    public void testAv() throws InterruptedException {
        AvPage avPage = new AvPage();
        WebElement buttonEnter = driver.findElement(By.xpath(avPage.buttonEnterLocator));
        buttonEnter.click();

    }
}
