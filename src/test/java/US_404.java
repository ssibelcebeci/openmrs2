import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterAPatientPage;
import utils.ConfigReader;
import utils.ReusableMethods;

public class US_404 extends ReusableMethods {

    @Test
    public void registerAPatient() {
        LoginPage lp = new LoginPage();
        HomePage hp = new HomePage();

        RegisterAPatientPage rap = new RegisterAPatientPage();

        String birthdateDay = "25";
        String birthdateYear = "1990";
        String cityVillage = "505 Maple St";
        String province = "Buffalo";
        String country = "NY";
        String phoneNumb = "5558901234";
        String relationshipPerson = "Jane";

        driver.get(ConfigReader.getProperty("url"));

        lp.loginValidUser();

        verifyContainsText(hp.loggedInMessage, "Logged in as Super User (admin) at Inpatient Ward.");

        myClick(lp.registerAPatientBtn);
        mySendKeys(rap.givenNameInput, ConfigReader.getProperty("givenName"));
        mySendKeys(rap.familyNameInput, ConfigReader.getProperty("familyName"));
        myClick(rap.nextForGenderOption);

        myClick(rap.genderOption);
        myClick(rap.nextBtn);

        mySendKeys(rap.birthdateDay, birthdateDay);
        new Select(rap.birthdateMonthDropdown).selectByValue("10");
        mySendKeys(rap.birthdateYear, birthdateYear);
        myClick(rap.nextBtn);

        mySendKeys(rap.cityVillageInput, cityVillage);
        mySendKeys(rap.provinceInput, province);
        mySendKeys(rap.countryInput, country);
        myClick(rap.nextBtn);

        mySendKeys(rap.phoneNumberInput, phoneNumb);
        myClick(rap.nextBtn);

        new Select(rap.relationshipTypeDropdown).selectByVisibleText("Sibling");
        mySendKeys(rap.relationshipPersonNameInput, relationshipPerson);
        myClick(rap.nextBtn);
        myClick(rap.confirmBtn);

        wait.until(ExpectedConditions.visibilityOf(rap.patientName));
        verifyContainsText(rap.patientName, ConfigReader.getProperty("givenName"));
        verifyContainsText(rap.patientID, "Patient ID");
    }
}
