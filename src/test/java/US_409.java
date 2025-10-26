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
        String firstID = "100HUN";
        String secondID = "100HNY";

        driver.get(ConfigReader.getProperty("url"));
        lp.loginValidUser();

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

        verifyContainsText(pip.confirmMerge, "Patient ID");
    }
}
