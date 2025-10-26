import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FindPatientPage;
import pages.HomePage;
import pages.LoginPage;
import utils.ConfigReader;
import utils.ReusableMethods;

public class US_408 extends ReusableMethods {
    @Test
    public void patientList(){
        LoginPage lp = new LoginPage();
        HomePage hp=new HomePage();
        FindPatientPage fpp=new FindPatientPage();

        driver.get(ConfigReader.getProperty("url"));
        lp.loginValidUser();

        myClick(hp.findPatientRecordBtn);

        wait.until(ExpectedConditions.visibilityOfAllElements(fpp.patientList));
        int rowCount = fpp.patientList.size();

        String infoText = fpp.patientResultsText.getText().trim();
        int showingTo = Integer.parseInt(infoText.replaceAll(".*to\\s+(\\d+).*", "$1"));

        Assert.assertEquals(rowCount, showingTo, "Displayed row count does not match visible range!");
    }
}
