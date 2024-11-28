package pages;

import utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchEmployeePage extends CommonMethods {
    @FindBy(id="menu_pim_viewPimModule")
    public WebElement PimOption;

    @FindBy(id="menu_pim_viewEmployeeList")
    public WebElement EmployeeList;

    @FindBy(id="empsearch_id")
    public WebElement empID;

    @FindBy(id="searchBtn")
    public WebElement search;



    public SearchEmployeePage(){
        PageFactory.initElements(driver, this);
    }
}

