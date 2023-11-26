package by.itacademy.zhiznevskaya;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PassRwTest extends BaseTest{
    @Test
    public void testPassRw() throws InterruptedException {
        driver.get("https://pass.rw.by/ru/");
        Thread.sleep(5000);
        PassRwPage passRwPagePersonalCabinet = new PassRwPage(driver);
        Thread.sleep(5000);
        passRwPagePersonalCabinet.clickLinkPersonalCabinet();
    }
}
