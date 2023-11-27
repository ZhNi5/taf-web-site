package by.itacademy.zhiznevskaya;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OzPage {
    public String ulrOzBy = "https://oz.by/";
    public String userBarEnterXpath="//span[contains(text(),'Войти')]";
    public String loginFormEmailLinkTabXpath="//*[contains(text(),'Электронная почта')]";
    public String inputFieldEmailLoginFormXpath="//input[contains(@placeholder,'Электронная почта')]";
    public String inputFieldPasswordLoginFormXpath="//input[contains(@placeholder,'Пароль')]";
    public String incorrectEmail="email@gmail.com";
    public String incorrectPassword="123456789";
    public String loginFormEmailLinkTabButtonEnterXpath="//button[contains(text(),'Войти')]";
    public String errorMessageLoginFormXpath="//*[contains(text(),'Неверный пароль. Если вы потеряли или забыли пароль')]";

    public String expectedTitleOfTheLoginForm="//*[contains(text(),'Вход')]";

    private WebDriver driver;

    public OzPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickUserBarEnter(){
        By userBarEnterLocatorBy =By.xpath(userBarEnterXpath);
        WebElement userBarEnterElement=driver.findElement(userBarEnterLocatorBy);
        userBarEnterElement.click();
    }
    public void clickLoginFormEmailLinkTab(){
        By emailTabOnLoginForm = By.xpath(loginFormEmailLinkTabXpath);
        WebElement emailTabOnLoginFormElement= driver.findElement(emailTabOnLoginForm);
        emailTabOnLoginFormElement.click();
    }

    public String getErrorMessageAfterSendKeysUnRealUser() throws InterruptedException {
        By emailFieldEnter =By.xpath(inputFieldEmailLoginFormXpath);
        WebElement emailFieldEnterElement=driver.findElement(emailFieldEnter);
        emailFieldEnterElement.sendKeys(incorrectEmail);
        By passwordFieldEnter =By.xpath(inputFieldPasswordLoginFormXpath);
        WebElement inputFieldPasswordLoginFormXpath=driver.findElement(passwordFieldEnter);
        inputFieldPasswordLoginFormXpath.sendKeys(incorrectPassword);
        By buttonEnterXpath = By.xpath(loginFormEmailLinkTabButtonEnterXpath);
        WebElement buttonEnterElement= driver.findElement(buttonEnterXpath);
        buttonEnterElement.click();
        Thread.sleep(5000);
        By errorMessageBy = By.xpath(errorMessageLoginFormXpath);
        WebElement errorMessageElement = driver.findElement(errorMessageBy);
        return  errorMessageElement.getText();

    }

    public String getTitleOfTheLoginForm()  throws InterruptedException{
        By expectedTitleOfTheLoginFormBy=By.xpath(expectedTitleOfTheLoginForm);
        WebElement expectedTitleOfTheLoginFormElement= driver.findElement(expectedTitleOfTheLoginFormBy);
        return expectedTitleOfTheLoginFormElement.getText();
    }



}
