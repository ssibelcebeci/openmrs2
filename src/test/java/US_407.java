import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.FindPatientPage;
import pages.HomePage;
import pages.LoginPage;
import pages.PatientInfoPage;
import utils.ConfigReader;
import utils.ReusableMethods;

public class US_407 extends ReusableMethods {
    @Test
    public void deletePatient() {
        LoginPage lp = new LoginPage();
        HomePage hp = new HomePage();
        PatientInfoPage pip = new PatientInfoPage();
        FindPatientPage fpp = new FindPatientPage();

        driver.get(ConfigReader.getProperty("url"));
        lp.loginValidUser();

        myClick(hp.findPatientRecordBtn);
        mySendKeys(fpp.searchField, ConfigReader.getProperty("givenNameForDelete"));
        myClick(pip.chooseForDelete);

        myClick(pip.deletePatientBtn);
        mySendKeys(pip.deleteReasonInput, ConfigReader.getProperty("deleteReason"));
        myClick(pip.deleteConfirmBtn);
    }
}
