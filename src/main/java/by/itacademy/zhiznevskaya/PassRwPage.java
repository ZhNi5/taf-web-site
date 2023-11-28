package by.itacademy.zhiznevskaya;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PassRwPage {
    public String personalCabinetXpath="//span[contains(text(),'Личный кабинет')]";
    public String modelDialogCheckboxTextXpath="//span[text()='Больше не показывать']";
    public String formAuthorizationXpath="//*[contains(text(),'Авторизация')]";
    public String authorizationFormLoginXpath ="//input[contains(@name,'login')]";
    public String authorizationFormPasswordXpath ="//input[contains(@name,'password')]";

    public String authorizationFormEnterButtonXpath="//input[contains(@value,'Войти')]";
    public String authorizationFormErrorEmptyFieldXpath="//label[contains(text(),'Заполните поле')]";

    public String authorizationFormErrorEmptyLoginFieldXpath="//label[contains(@for,'login')]";

    public String authorizationFormErrorUserNotFoundXpath="//div[contains(text(),'Пользователь не найден')]";
    private WebDriver driver;

    public PassRwPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLinkPersonalCabinet(){
        By personalCabinetBy = By.xpath(personalCabinetXpath);
        WebElement personalCabinetElement = driver.findElement(personalCabinetBy);
        personalCabinetElement.click();
    }

    public void clickModelDialogCheckBoxAccept(){
        By modelDialogCheckBoxAcceptBy=By.xpath(modelDialogCheckboxTextXpath);
        WebElement modelDialogCheckBoxElement=driver.findElement(modelDialogCheckBoxAcceptBy);
        modelDialogCheckBoxElement.click();
    }

    public boolean isAuthorizationFormOpened(){
        boolean isFormOpened=false;
        By authorizationFormOpenedBy=By.xpath(formAuthorizationXpath);
        WebElement formAuthorizationXpathElement=driver.findElement(authorizationFormOpenedBy);

        if(formAuthorizationXpathElement.isDisplayed()){
            isFormOpened=true;
        }
        else
        {
            isFormOpened=false;
        }
    return isFormOpened;
    }

    public String enterEmptyFieldsAuthorizationForm(){
        By authorizationFormLoginBy=By.xpath(authorizationFormLoginXpath);
        WebElement authorizationFormLoginElement= driver.findElement(authorizationFormLoginBy);
        authorizationFormLoginElement.sendKeys("");
        By authorizationFormPasswordBy=By.xpath(authorizationFormPasswordXpath);
        WebElement authorizationFormPasswordElement=driver.findElement(authorizationFormPasswordBy);
        authorizationFormPasswordElement.sendKeys("");
        By authorizationFormEnterButtonBy=By.xpath(authorizationFormEnterButtonXpath);
        WebElement authorizationFormEnterButtonElement=driver.findElement(authorizationFormEnterButtonBy);
        authorizationFormEnterButtonElement.click();
        return driver.findElement(By.xpath(authorizationFormErrorEmptyFieldXpath)).getText();
    }

    public String enterLoginEmptyFieldsAuthorizationForm(){
        By authorizationFormLoginBy=By.xpath(authorizationFormLoginXpath);
        WebElement authorizationFormLoginElement= driver.findElement(authorizationFormLoginBy);
        authorizationFormLoginElement.sendKeys("");
        By authorizationFormPasswordBy=By.xpath(authorizationFormPasswordXpath);
        WebElement authorizationFormPasswordElement=driver.findElement(authorizationFormPasswordBy);
        authorizationFormPasswordElement.sendKeys("123456");
        By authorizationFormEnterButtonBy=By.xpath(authorizationFormEnterButtonXpath);
        WebElement authorizationFormEnterButtonElement=driver.findElement(authorizationFormEnterButtonBy);
        authorizationFormEnterButtonElement.click();
        return driver.findElement(By.xpath(authorizationFormErrorEmptyLoginFieldXpath)).getText();
    }

    public String enterNotFoundUserAuthorizationForm(){
        By authorizationFormLoginBy=By.xpath(authorizationFormLoginXpath);
        WebElement authorizationFormLoginElement= driver.findElement(authorizationFormLoginBy);
        authorizationFormLoginElement.sendKeys("email@gmail.com");
        By authorizationFormPasswordBy=By.xpath(authorizationFormPasswordXpath);
        WebElement authorizationFormPasswordElement=driver.findElement(authorizationFormPasswordBy);
        authorizationFormPasswordElement.sendKeys("123456");
        By authorizationFormEnterButtonBy=By.xpath(authorizationFormEnterButtonXpath);
        WebElement authorizationFormEnterButtonElement=driver.findElement(authorizationFormEnterButtonBy);
        authorizationFormEnterButtonElement.click();
        return driver.findElement(By.xpath(authorizationFormErrorUserNotFoundXpath)).getText();
    }
}
