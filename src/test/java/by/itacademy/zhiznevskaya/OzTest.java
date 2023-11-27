package by.itacademy.zhiznevskaya;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OzTest extends BaseTest {

    @Test

    public void clickEnterOnHomePageToCheckErrorMassageWithIncorrectEmailAndPassword() {
        driver.get("https://oz.by/");
        OzPage OzPage= new OzPage(driver);
        OzPage.clickUserBarEnter();
        OzPage.clickLoginFormEmailLinkTab();
        String actual = null;
        try {
            actual = OzPage.getErrorMessageAfterSendKeysUnRealUser();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String expected = "Неверный пароль. Если вы потеряли или забыли пароль — восстановите его";
        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void checkNameOfTheLoginForm() throws InterruptedException {
        driver.get("https://oz.by/");
        OzPage OzPage2= new OzPage(driver);
        OzPage2.clickUserBarEnter();
        OzPage2.clickLoginFormEmailLinkTab();
        String actual= OzPage2.getTitleOfTheLoginForm();
        String expected = "Вход";
        Assertions.assertEquals(expected, actual);

    }


}
