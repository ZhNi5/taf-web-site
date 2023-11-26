package by.itacademy.zhiznevskaya;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class BaseTest {
    WebDriver driver;
    @BeforeEach
    public void start(){
      driver=new ChromeDriver();
      driver.manage().window().maximize();
      //driver.get("https://onliner.by/");
    }
    @AfterEach
    public void finish() {
        driver.quit();
    }
}
