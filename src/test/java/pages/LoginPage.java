package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BaseDriver;
import utils.ConfigReader;
import utils.ReusableMethods;

import java.util.List;

public class LoginPage extends ReusableMethods {

    public LoginPage(){
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(id = "username")
    public WebElement usernameInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(id = "loginButton")
    public WebElement loginBtn;

    @FindBy(id = "sessionLocationError")
    public WebElement locationError;

    @FindBy(id = "Inpatient Ward")
    public WebElement inpatientWardLocation;

    @FindBy(id = "error-message")
    public WebElement errorMessage;

    @FindBy(xpath = "//form[@id='login-form']/fieldset/legend")
    public WebElement logoutSuccess;

    @FindBy(xpath = "//i[@class='icon-user']")
    public WebElement registerAPatientBtn;

    @FindBy(id = "sessionLocation")
    public List<WebElement> locations;

    public void loginValidUser() {
        mySendKeys(usernameInput, ConfigReader.getProperty("usernameValid"));
        mySendKeys(passwordInput, ConfigReader.getProperty("passwordValid"));
        myClick(inpatientWardLocation);
        myClick(loginBtn);
    }

    public void loginInvalidUser() {
        mySendKeys(usernameInput, ConfigReader.getProperty("usernameInvalid"));
        mySendKeys(passwordInput, ConfigReader.getProperty("passwordInvalid"));
        myClick(inpatientWardLocation);
        myClick(loginBtn);
    }
}
