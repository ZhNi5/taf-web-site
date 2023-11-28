package by.itacademy.zhiznevskaya;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class PassRwTest extends BaseTest {
    @Test
    public void testPassRw() throws InterruptedException {
        driver.get("https://pass.rw.by/ru/");
        Thread.sleep(5000);
        PassRwPage passRwPagePersonalCabinet = new PassRwPage(driver);
        Thread.sleep(5000);
        passRwPagePersonalCabinet.clickLinkPersonalCabinet();
    }

    @Test
    public void testAuthorizationFormOpen() throws InterruptedException {
        driver.get("https://pass.rw.by/ru/");
        Thread.sleep(5000);
        PassRwPage passRwPagePersonalCabinet = new PassRwPage(driver);
        passRwPagePersonalCabinet.clickLinkPersonalCabinet();
        Thread.sleep(5000);
        String mainWindowHandle = driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();
        Iterator<String> itr = windowHandles.iterator();
        while (itr.hasNext()) {
            String childWindowHandle = itr.next();
            // to skip the handle of our main window and switch to new one
            if (!mainWindowHandle.equalsIgnoreCase(childWindowHandle))
                driver.switchTo().window(childWindowHandle);
        }
        boolean actual = passRwPagePersonalCabinet.isAuthorizationFormOpened();
        boolean expected = true;
        Assertions.assertEquals(expected, actual);

}
    @Test void testAuthorizationFormEmptyFieldsInput() throws InterruptedException {
        driver.get("https://pass.rw.by/ru/");
        Thread.sleep(5000);
        PassRwPage passRwPagePersonalCabinet = new PassRwPage(driver);
        passRwPagePersonalCabinet.clickLinkPersonalCabinet();
        Thread.sleep(5000);
        String mainWindowHandle = driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();
        Iterator<String> itr = windowHandles.iterator();
        while (itr.hasNext()) {
            String childWindowHandle = itr.next();
            // to skip the handle of our main window and switch to new one
            if (!mainWindowHandle.equalsIgnoreCase(childWindowHandle))
                driver.switchTo().window(childWindowHandle);
        }
        String actual = passRwPagePersonalCabinet.enterEmptyFieldsAuthorizationForm();
        String expected = "Заполните поле";
        Assertions.assertEquals(expected, actual);
    }

    @Test void testAuthorizationFormLoginEmptyFieldInput() throws InterruptedException {
        driver.get("https://pass.rw.by/ru/");
        Thread.sleep(5000);
        PassRwPage passRwPagePersonalCabinet = new PassRwPage(driver);
        passRwPagePersonalCabinet.clickLinkPersonalCabinet();
        Thread.sleep(5000);
        String mainWindowHandle = driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();
        Iterator<String> itr = windowHandles.iterator();
        while (itr.hasNext()) {
            String childWindowHandle = itr.next();
            // to skip the handle of our main window and switch to new one
            if (!mainWindowHandle.equalsIgnoreCase(childWindowHandle))
                driver.switchTo().window(childWindowHandle);
        }
        String actual = passRwPagePersonalCabinet.enterLoginEmptyFieldsAuthorizationForm();
        String expected = "Заполните поле";
        Assertions.assertEquals(expected, actual);
    }

    @Test void testAuthorizationFormUserNotFoundInput() throws InterruptedException {
        driver.get("https://pass.rw.by/ru/");
        Thread.sleep(5000);
        PassRwPage passRwPagePersonalCabinet = new PassRwPage(driver);
        passRwPagePersonalCabinet.clickLinkPersonalCabinet();
        Thread.sleep(5000);
        String mainWindowHandle = driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();
        Iterator<String> itr = windowHandles.iterator();
        while (itr.hasNext()) {
            String childWindowHandle = itr.next();
            // to skip the handle of our main window and switch to new one
            if (!mainWindowHandle.equalsIgnoreCase(childWindowHandle))
                driver.switchTo().window(childWindowHandle);

        }
            String actual =passRwPagePersonalCabinet.enterNotFoundUserAuthorizationForm();
            Thread.sleep(5000);
            Assertions.assertEquals("Пользователь не найден",actual);
        }
}
