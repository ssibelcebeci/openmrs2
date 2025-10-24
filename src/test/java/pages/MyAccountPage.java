package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BaseDriver;
import utils.ReusableMethods;

public class MyAccountPage extends ReusableMethods {

    public MyAccountPage() {
        PageFactory.initElements(BaseDriver.driver,this);
    }
    @FindBy(xpath = "(//a[@class='button app big'])[1]")
    public WebElement changePasswordBtn;

    @FindBy(xpath = "(//a[@class='button app big'])[2]")
    public WebElement myLanguagesBtn;
}
