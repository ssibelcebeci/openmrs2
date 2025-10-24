package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BaseDriver;
import utils.ReusableMethods;

public class MergeSelectRecordPage extends ReusableMethods {
    public MergeSelectRecordPage() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(xpath = "//div[3]/h1")
    public WebElement checkText;

    @FindBy(id = "first-patient")
    public WebElement selectPatient;
}
