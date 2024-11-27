package steps;

import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

public class DashboardSteps extends CommonMethods {

    @When("user clicks on PIM option")
    public void user_clicks_on_pim_option() {
        WebElement PimOption = driver.findElement(By.id("menu_pim_viewPimModule"));
        PimOption.click();
    }

    @When("user cliks on employee list option")
    public void user_cliks_on_employee_list_option() {
        WebElement EmployeeList = driver.findElement(By.id("menu_pim_viewEmployeeList"));
        EmployeeList.click();
    }

    @When("user enter emplyee ID")
    public void user_enter_emplyee_id() {
        WebElement empID = driver.findElement(By.id("empsearch_id"));
        empID.sendKeys("12306546");
    }

    @When("user clicks on search button")
    public void user_clicks_on_search_button() {
        WebElement search = driver.findElement(By.id("searchBtn"));
        search.click();
    }

}
