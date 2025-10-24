package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BaseDriver;
import utils.ReusableMethods;

import java.util.List;

public class RegisterAPatientPage extends ReusableMethods {
    public RegisterAPatientPage() {
        PageFactory.initElements(BaseDriver.driver,this);
    }
    @FindBy(xpath = "//input[@name='givenName']")
    public WebElement givenNameInput;

    @FindBy(xpath = "//input[@name='familyName']")
    public WebElement familyNameInput;

    @FindBy(xpath = "//icon[@class='fas fa-chevron-right']")
    public WebElement nextForGenderOption;

    @FindBy(xpath = "//option[@value='F']")
    public WebElement genderOption;

    @FindBy(id = "next-button")
    public WebElement nextBtn;

    @FindBy(id = "birthdateDay-field")
    public WebElement birthdateDay;

    @FindBy(xpath = "//select[@id='birthdateMonth-field']")
    public WebElement birthdateMonthDropdown;

    @FindBy(xpath = "//input[@id='birthdateYear-field']")
    public WebElement birthdateYear;

    @FindBy(id = "cityVillage")
    public WebElement cityVillageInput;

    @FindBy(id = "stateProvince")
    public WebElement provinceInput;

    @FindBy(id = "country")
    public WebElement countryInput;

    @FindBy(xpath = "//input[@name='phoneNumber']")
    public WebElement phoneNumberInput;

    @FindBy(id = "relationship_type")
    public WebElement relationshipTypeDropdown;

    @FindBy(xpath = "//div[@id='relationship']/p[2]/input[1]")
    public WebElement relationshipPersonNameInput;

    @FindBy(id = "submit")
    public WebElement confirmBtn;

    @FindBy(xpath = "//span[@class='PersonName-givenName']")
    public WebElement patientName;

    @FindBy(xpath = "//div[@class='float-sm-right']/em")
    public WebElement patientID;
}
