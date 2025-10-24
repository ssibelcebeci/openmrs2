package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BaseDriver;
import utils.ReusableMethods;

public class PatientInfoPage extends ReusableMethods {
    public PatientInfoPage() {
        PageFactory.initElements(BaseDriver.driver,this);
    }

    @FindBy(xpath = "//div[@id='coreapps-diagnosesList']")
    public WebElement patientDiagnoses;

    @FindBy(xpath = "//div[6]/div[1]/h3")
    public WebElement patientAppointments;

    @FindBy(xpath = "//i[@class='icon-home small']")
    public WebElement homeIcon;

    @FindBy(xpath = "//a[@id='org.openmrs.module.coreapps.deletePatient']")
    public WebElement deletePatientBtn;

    @FindBy(id = "delete-reason")
    public WebElement deleteReasonInput;

    @FindBy(xpath = "//div[@id='delete-patient-creation-dialog']/div[2]/button[1]")
    public WebElement deleteConfirmBtn;

    @FindBy(xpath = "//div[2]/div/em")
    public WebElement confirmMerge;
}
