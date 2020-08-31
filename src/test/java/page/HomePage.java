package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    WebDriver driver;
    @FindBy(xpath = "//div[contains(@class, 'internet-bank')]/a")
    WebElement onlineBankButton;

    public HomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        driver.get("");
    }

    public LoginPage clickOnlineBankButton() {
        onlineBankButton.click();
        return new LoginPage(driver);
    }
}
