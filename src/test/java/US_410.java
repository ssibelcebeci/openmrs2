import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.AppointmentSchedulingPage;
import pages.HomePage;
import pages.LoginPage;
import utils.ConfigReader;
import utils.ReusableMethods;

public class US_410 extends ReusableMethods {
    @Test
    public void timeZoneSync(){
        LoginPage lp = new LoginPage();
        HomePage hp=new HomePage();
        AppointmentSchedulingPage asp=new AppointmentSchedulingPage();

        driver.get(ConfigReader.getProperty("url"));
        mySendKeys(lp.usernameInput, ConfigReader.getProperty("usernameValid"));
        mySendKeys(lp.passwordInput, ConfigReader.getProperty("passwordValid"));
        myClick(lp.inpatientWardLocation);
        myClick(lp.loginBtn);

        myClick(hp.appointmentSchedulingBtn);

        myClick(asp.manageAppointmentsBtn);

        mySendKeys(asp.patientSearch,ConfigReader.getProperty("givenNameForAppointment"));
        asp.patientSearch.sendKeys(Keys.ENTER);

        verifyContainsText(asp.timezoneWarning,"Your computer is not set to the right time zone." +
                " Please change to Coordinated Universal Time and then close and restart your " +
                "browser to assure proper scheduling functionality.");
    }
}
