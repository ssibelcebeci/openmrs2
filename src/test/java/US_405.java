import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import pages.ChangePasswordPage;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;
import utils.ConfigReader;
import utils.ReusableMethods;

import java.util.Random;

public class US_405 extends ReusableMethods {
    @Test
    public void myAccount() {
        LoginPage lp = new LoginPage();
        HomePage hp=new HomePage();
        Random random = new Random();
        MyAccountPage map = new MyAccountPage();
        ChangePasswordPage cp = new ChangePasswordPage();

        driver.get(ConfigReader.getProperty("url"));
        mySendKeys(lp.usernameInput, ConfigReader.getProperty("usernameValid"));
        mySendKeys(lp.passwordInput, ConfigReader.getProperty("passwordValid"));

        wait.until(ExpectedConditions.visibilityOfAllElements(lp.locations));
        int randomIndex = random.nextInt(lp.locations.size());
        myClick(lp.locations.get(randomIndex));

        myClick(lp.loginBtn);

        Actions actions = new Actions(driver);
        wait.until(ExpectedConditions.visibilityOf(hp.myAccountOption));
        actions.moveToElement(hp.myAccountOption).perform();
        wait.until(ExpectedConditions.visibilityOf(hp.myAccountBtn));
        myClick(hp.myAccountBtn);

        myClick(map.changePasswordBtn);

        myClick(cp.cancelBtn);

        myClick(map.myLanguagesBtn);
    }
}
