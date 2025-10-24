import org.testng.annotations.Test;
import pages.LoginPage;
import utils.ConfigReader;
import utils.ReusableMethods;

public class US_401 extends ReusableMethods {
    @Test
    public void loginNegative() {
        LoginPage lp = new LoginPage();
        driver.get(ConfigReader.getProperty("url"));

        mySendKeys(lp.usernameInput, ConfigReader.getProperty("usernameInvalid"));

        mySendKeys(lp.passwordInput, ConfigReader.getProperty("passwordInvalid"));

        myClick(lp.loginBtn);

        verifyDisplayed(lp.locationError, "You must choose a location!");

        myClick(lp.inpatientWardLocation);

        mySendKeys(lp.usernameInput, ConfigReader.getProperty("usernameInvalid"));

        mySendKeys(lp.passwordInput, ConfigReader.getProperty("passwordInvalid"));

        myClick(lp.loginBtn);

        verifyDisplayed(lp.errorMessage, "Invalid username/password. Please try again.");
    }
}
