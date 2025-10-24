package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BaseDriver;
import utils.ReusableMethods;

public class MergePage extends ReusableMethods {
    public MergePage() {
        PageFactory.initElements(BaseDriver.driver,this);
    }

    @FindBy(id = "patient1-text")
    public WebElement firstPatientIDField;

    @FindBy(id = "patient2-text")
    public WebElement secondPatientIDField;

    @FindBy(id = "confirm-button")
    public WebElement confirmBtn;
}
