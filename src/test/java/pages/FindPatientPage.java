package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BaseDriver;
import utils.ReusableMethods;

import java.util.List;

public class FindPatientPage extends ReusableMethods {
    public FindPatientPage() {
        PageFactory.initElements(BaseDriver.driver,this);
    }

    @FindBy(id = "patient-search")
    public WebElement searchField;

    @FindBy(xpath = "//td[@class='dataTables_empty']")
    public WebElement noMatchText;

    @FindBy(css = "#patient-search-results-table > tbody >tr")
    public List<WebElement> patientList;

    @FindBy(id = "patient-search-results-table_info")
    public WebElement patientResultsText;
}
