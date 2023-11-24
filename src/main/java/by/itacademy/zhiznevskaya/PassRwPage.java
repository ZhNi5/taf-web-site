package by.itacademy.zhiznevskaya;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PassRwPage {
    public String personalCabinetXpath="//*[contains(text(),\'Личный кабинет\')]'";
    public String modelDialogCheckboxTextXpath="//span[text()='Больше не показывать']";
    private WebDriver driver;

    public PassRwPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLinkPersonalCabinet(){
        By personalCabinetBy = By.xpath(personalCabinetXpath);
        WebElement personalCabinetElement = driver.findElement(personalCabinetBy);
        personalCabinetElement.click();
    }

    public void modelDialogCheckBoxAccept(){
        By modelDialogCheckBoxAcceptBy=By.xpath(modelDialogCheckboxTextXpath);
        WebElement modelDialogCheckBoxElement=driver.findElement(modelDialogCheckBoxAcceptBy);
        modelDialogCheckBoxElement.click();
    }

}
