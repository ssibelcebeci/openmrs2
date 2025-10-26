import org.testng.annotations.Test;
import pages.LoginPage;
import utils.ConfigReader;
import utils.ReusableMethods;

public class US_401 extends ReusableMethods {

    @Test
    public void loginNegative() {
        LoginPage lp = new LoginPage();
        driver.get(ConfigReader.getProperty("url"));

        mySendKeys(lp.usernameInput, ConfigReader.getProperty("usernameValid"));
        mySendKeys(lp.passwordInput, ConfigReader.getProperty("passwordValid"));
        myClick(lp.loginBtn);

        verifyContainsText(lp.locationError, "You must choose a location!");

        myClick(lp.inpatientWardLocation);

        lp.loginInvalidUser();

        verifyContainsText(lp.errorMessage, "Invalid username/password. Please try again.");
    }
}
