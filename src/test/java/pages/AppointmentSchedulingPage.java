package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BaseDriver;
import utils.ReusableMethods;

public class AppointmentSchedulingPage extends ReusableMethods {
    public AppointmentSchedulingPage() {
        PageFactory.initElements(BaseDriver.driver,this);
    }

    @FindBy(xpath = "//a[@id='appointmentschedulingui-manageAppointments-app']/i")
    public WebElement manageAppointmentsBtn;

    @FindBy(id = "patient-search")
    public WebElement patientSearch;

    @FindBy(xpath = "//table[@id='patient-search-results-table']/tbody/tr[1]/td[3]")
    public WebElement patientInfo;

    @FindBy(xpath = "//div[@id='time-zone-warning']/div/div/p")
    public WebElement timezoneWarning;
}
