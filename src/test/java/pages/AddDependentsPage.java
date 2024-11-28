package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class AddDependentsPage extends CommonMethods {

    @FindBy(xpath="//a[text()='EssUpdate S']")
    public WebElement IDnumber;

    @FindBy(xpath="//a[text()='Dependents']")
    public WebElement Dependents;

    @FindBy(id="btnAddDependent")
    public WebElement Addoption;

    @FindBy(id="dependent_name")
    public WebElement firstName;

    public AddDependentsPage(){
        PageFactory.initElements(driver, this);
    }


}
