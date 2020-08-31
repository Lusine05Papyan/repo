package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(xpath = "//div[contains(@class, 'operation-form__field')]/div[contains(@class, 'label')]")
    WebElement label;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public String getLabelText() {
       return label.getText();
    }
}
