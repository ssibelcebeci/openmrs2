import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import utils.ConfigReader;
import utils.ReusableMethods;

public class US_403 extends ReusableMethods {
    @Test
    public void logoutSuccessfully() {
        LoginPage lp = new LoginPage();
        HomePage hp=new HomePage();

        driver.get(ConfigReader.getProperty("url"));

        mySendKeys(lp.usernameInput, ConfigReader.getProperty("usernameValid"));

        mySendKeys(lp.passwordInput, ConfigReader.getProperty("passwordValid"));

        myClick(lp.inpatientWardLocation);

        myClick(lp.loginBtn);

        verifyContainsText(hp.loggedInMessage, "Logged in as Super User (admin) at Inpatient Ward.");

        myClick(hp.logoutBtn);

        verifyDisplayed(lp.logoutSuccess, "Login");
    }
}
