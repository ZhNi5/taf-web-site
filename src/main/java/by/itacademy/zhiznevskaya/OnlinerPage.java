package by.itacademy.zhiznevskaya;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OnlinerPage {
    private String enterButtonLocator = "//*[@id=\"userbar\"]/div[1]/div/div/div[1]";
    private String enterTitleAouthFromLocator = "//*[@id=\"auth-container\"]/div/div[2]/div/form/div[3]/button";
    private WebDriver driver;

    public OnlinerPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickEnterButton(){
        By enterButtonLBy = By.xpath(enterButtonLocator);
        WebElement enterButtonElement = driver.findElement(enterButtonLBy);
        enterButtonElement.click();
    }

    public String getTextEnterTitleAouthFrom() throws InterruptedException {
        By enterTitleOauthFormBy = By.xpath(enterTitleAouthFromLocator);
        Thread.sleep(5000);
        WebElement enterTitleOauthFormElement = driver.findElement(enterTitleOauthFormBy);
        return  enterTitleOauthFormElement.getText();
    }

}
