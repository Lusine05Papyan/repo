package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.HomePage;

public class OnlineBankTest extends BaseTest {
    @Test
    public void test() {
        HomePage homePage = new HomePage(driver);
        Assert.assertEquals(homePage.clickOnlineBankButton().getLabelText(), "Вход в ВТБ-Онлайн");


    }
}
