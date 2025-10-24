package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BaseDriver;
import utils.ReusableMethods;

public class DataManagementPage extends ReusableMethods {
    public DataManagementPage() {
        PageFactory.initElements(BaseDriver.driver,this);
    }

    @FindBy(id = "coreapps-mergePatientsHomepageLink-app")
    public WebElement mergePatientBtn;
}
