import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import pages.FindPatientPage;
import pages.HomePage;
import pages.LoginPage;
import pages.PatientInfoPage;
import utils.ConfigReader;
import utils.ReusableMethods;

public class US_406 extends ReusableMethods {
    @Test
    public void searchPatientList() {
        LoginPage lp = new LoginPage();
        HomePage hp = new HomePage();
        FindPatientPage fpp = new FindPatientPage();
        PatientInfoPage pip = new PatientInfoPage();
        String searchByID = "100HYE";

        driver.get(ConfigReader.getProperty("url"));
        lp.loginValidUser();

        myClick(hp.findPatientRecordBtn);

        mySendKeys(fpp.searchField, ConfigReader.getProperty("givenName"));
        mySendKeys(fpp.searchField, ConfigReader.getProperty("familyName"));
        mySendKeys(fpp.searchField, searchByID);
        fpp.searchField.sendKeys(Keys.ENTER);

        wait.until(ExpectedConditions.visibilityOf(pip.patientDiagnoses));
        verifyContainsText(pip.patientDiagnoses, "DIAGNOSES");

        wait.until(ExpectedConditions.visibilityOf(pip.patientAppointments));
        verifyContainsText(pip.patientAppointments, "APPOINTMENTS");

        myClick(pip.homeIcon);
        myClick(hp.findPatientRecordBtn);
        mySendKeys(fpp.searchField, ConfigReader.getProperty("givenNameInvalid"));

        verifyContainsText(fpp.noMatchText, "No matching records found");
    }
}

