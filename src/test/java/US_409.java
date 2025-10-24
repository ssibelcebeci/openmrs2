import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.*;
import utils.ConfigReader;
import utils.ReusableMethods;

public class US_409 extends ReusableMethods {
    @Test
    public void mergePatient() {
        LoginPage lp = new LoginPage();
        HomePage hp = new HomePage();
        DataManagementPage dmp = new DataManagementPage();
        MergePage mp = new MergePage();
        MergeSelectRecordPage msrp = new MergeSelectRecordPage();
        PatientInfoPage pip = new PatientInfoPage();
        String firstID = "100J43";
        String secondID = "100J35";

        driver.get(ConfigReader.getProperty("url"));
        mySendKeys(lp.usernameInput, ConfigReader.getProperty("usernameValid"));
        mySendKeys(lp.passwordInput, ConfigReader.getProperty("passwordValid"));
        myClick(lp.inpatientWardLocation);
        myClick(lp.loginBtn);

        myClick(hp.dataManagementBtn);

        myClick(dmp.mergePatientBtn);

        mySendKeys(mp.firstPatientIDField, firstID);
        mySendKeys(mp.secondPatientIDField, secondID);
        mp.secondPatientIDField.sendKeys(Keys.ENTER);

        myClick(mp.confirmBtn);

        scrollToElement(msrp.checkText);
        verifyContainsText(msrp.checkText, "Merging cannot be undone!\n" +
                "Please check records before continuing.");

        myClick(msrp.selectPatient);

        myClick(mp.confirmBtn);

        verifyDisplayed(pip.confirmMerge, "Patient ID");
    }
}
