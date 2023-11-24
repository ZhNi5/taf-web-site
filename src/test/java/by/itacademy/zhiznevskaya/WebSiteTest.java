package by.itacademy.zhiznevskaya;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebSiteTest {
    @Test
    public void testOnliner() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://onliner.by/");

        OnlinerPage onlinerPage = new OnlinerPage(driver);
        onlinerPage.clickEnterButton();
        String actual = onlinerPage.getTextEnterTitleAouthFrom();
        String expected = "Войти";
        Assertions.assertEquals(expected, actual);
        driver.close();
    }

    @Test
    public void testOnlinerLogin() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://onliner.by/");
        ;
        String enterButtonLocator = "//*[@id=\"userbar\"]/div[1]/div/div/div[1]";
        By enterButtonLBy = By.xpath(enterButtonLocator);
        WebElement enterButtonElement = driver.findElement(enterButtonLBy);
        enterButtonElement.click();
        Thread.sleep(5000);
        String buttonEmterLogin = "/html/body/div[5]/div/div/div/div/div/div/div/div[2]/div/form/div[3]/button";
        By buttomEnterBy = By.xpath(buttonEmterLogin);
        WebElement buttonEmterLoginelement = driver.findElement(buttomEnterBy);
        buttonEmterLoginelement.click();
        String errorMessageLogin = "html.responsive-layout body.no-touch.modal-visible div.modal.modal_open div.modal-dialog div.modal-content div.auth-content div.auth-wrapper div.auth-entry div#auth-container.auth-container.auth-container_max-width_mmmm div.auth-form div.auth-form__body div.auth-container.auth-container_max-width_sssm form div.auth-form__row.auth-form__row_condensed-alter div.auth-form__group.auth-form__group_width_full div.auth-form__row.auth-form__row_condensed-alter div.auth-form__group.auth-form__group_width_full div.auth-form__field div.auth-form__line.auth-form__line_condensed div.auth-form__description.auth-form__description_error.auth-form__description_base.auth-form__description_extended-other";
        By errorMessageLoginBy = By.xpath(errorMessageLogin);
        WebElement errorMessageLoginElement = driver.findElement(errorMessageLoginBy);
        String actualerrorMessageLogin = errorMessageLoginElement.getText();
        String expectederrorMessageLogin = "\n" + " Укажите ник или e-mail" + "\n";
        Assertions.assertEquals(actualerrorMessageLogin, expectederrorMessageLogin);
    }

    @Test
    public void testOnlinerFakeUser() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.onliner.by/");
        Thread.sleep(4000);
        String enterButtonLocator = "//*[@id=\"userbar\"]/div[1]/div/div/div[1]";
        By enterButtonBy = By.xpath(enterButtonLocator);
        WebElement enterButtonWebElement = driver.findElement(enterButtonBy);
        enterButtonWebElement.click();

        //ввести почту в поле логин
        String inputEmailFormLogin = "//*[@id=\"auth-container\"]/div/div[2]/div/form/div[1]/div/div[2]/div/div/div/div/input";
        By inputEmailFormLoginBy = By.xpath(inputEmailFormLogin);
        WebElement inputEmailFormLoginElement = driver.findElement(inputEmailFormLoginBy);
        inputEmailFormLoginElement.sendKeys("email@gamil.com");

        //вводит пароль пользователя

        String inputEmailFormPassword = "//*[@id=\"auth-container\"]/div/div[2]/div/form/div[2]/div/div/div[1]/div/input";
        By inputEmailFormPasswordBy = By.xpath(inputEmailFormPassword);
        WebElement inputEmailFormPasswordElement = driver.findElement(inputEmailFormPasswordBy);
        inputEmailFormPasswordElement.sendKeys("password");

        //нажимаем кнпоку войти
        String buttonEnter = "//*[@id=\"auth-container\"]/div/div[2]/div/form/div[3]/button";
        By buttonEnterBy = By.xpath(buttonEnter);
        WebElement buttonEnterWebElement = driver.findElement(buttonEnterBy);
        buttonEnterWebElement.click();
        Thread.sleep(4000);

        //сравниваем два сообщения,то, что приходит, и то что ожидали
        String errorMassageFakeUser = "/html/body/div[6]/div/div/div/div/div/div/div/div[2]/div/form/div[3]/div";
        By errorMassageFakeUserBy = By.xpath(errorMassageFakeUser);
        WebElement errorMassageFakeUserElement = driver.findElement(errorMassageFakeUserBy);
        String actualErrorMassageFakeUser = errorMassageFakeUserElement.getText();
        String expectedErrorMassageFakeUser = "Неверный логин или пароль";
        Assertions.assertEquals(actualErrorMassageFakeUser, expectedErrorMassageFakeUser);

    }

    @Test
    public void testAv() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.onliner.by/");
        Thread.sleep(4000);

        AvPage avPage = new AvPage();
        WebElement buttonEnter = driver.findElement(By.xpath(avPage.buttonEnterLocator));
        buttonEnter.click();

    }
}
