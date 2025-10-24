package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BaseDriver;
import utils.ReusableMethods;

public class ChangePasswordPage extends ReusableMethods {
    public ChangePasswordPage() {
        PageFactory.initElements(BaseDriver.driver,this);
    }

    @FindBy(id = "cancel-button")
    public WebElement cancelBtn;
}
