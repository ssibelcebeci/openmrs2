package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BaseDriver;
import utils.ReusableMethods;

public class HomePage extends ReusableMethods {
    public HomePage() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(xpath = "//div[@id='content']/div[2]/div/h4")
    public WebElement loggedInMessage;

    @FindBy(xpath = "//div/ul/li[3]/a")
    public WebElement logoutBtn;

    @FindBy(xpath = "//li[@class='nav-item identifier']")
    public WebElement myAccountOption;

    @FindBy(xpath = "//ul[@id='user-account-menu']/li/a")
    public WebElement myAccountBtn;

    @FindBy(id = "coreapps-activeVisitsHomepageLink-coreapps-activeVisitsHomepageLink-extension")
    public WebElement findPatientRecordBtn;

    @FindBy(xpath = "//a[@id='coreapps-datamanagement-homepageLink-coreapps-datamanagement-homepageLink-extension']/i")
    public WebElement dataManagementBtn;

    @FindBy(xpath = "//a[@id='appointmentschedulingui-homeAppLink-appointmentschedulingui-homeAppLink-extension']/i")
    public WebElement appointmentSchedulingBtn;
}
