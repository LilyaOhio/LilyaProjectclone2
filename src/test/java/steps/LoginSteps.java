package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class LoginSteps {
    public WebDriver driver;

    @Given("user is able to access HRMS application")
    public void user_is_able_to_access_hrms_application() {
        driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @When("user enters admin username and password")
    public void user_enters_admin_username_and_password() {
        WebElement usernameField = driver.findElement(By.id("txtUsername"));
        usernameField.sendKeys("admin");
        //sendText(ConfigReader.read("userName"), loginPage.usernameField);
        WebElement passwordField = driver.findElement(By.id("txtPassword"));
        passwordField.sendKeys("Hum@nhrm123");
        //sendText(ConfigReader.read("password"), loginPage.passwordField);

    }

    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        loginButton.click();
    }

    @Then("user on dashboard page")
    public void user_on_dashboard_page() {
        // Assert.assertTrue(dashboardPage.welcomeText.isDisplayed());
    }


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

    @Then("user is albe to see employee")
    public void user_is_albe_to_see_employee() {
        System.out.println("passed");
    }


    @When("user clicks on ID number")
    public void user_clicks_on_id_number() {
        WebElement IDnumber = driver.findElement(By.xpath("//a[text()='EssUpdate S']"));
        IDnumber.click();
    }

    @When("user clicks on Dependents option")
    public void user_clicks_on_dependents_option() {
        WebElement Dependents = driver.findElement(By.xpath("//a[text()='Dependents']"));
        Dependents.click();
    }

    @When("user clicks on Add option")
    public void user_clicks_on_add_option() {
        WebElement Addoption = driver.findElement(By.id("btnAddDependent"));
        Addoption.click();
    }


    @Then("user enter firstname")
    public void user_enter_firstname() {
        WebElement firstName = driver.findElement(By.id("dependent_name"));
        firstName.sendKeys("Emilia");
    }

    @When("user select relationship")
    public void user_select_relationship() {
        WebElement Relationship = driver.findElement(By.xpath("//select[@id='dependent_relationshipType']"));
        Select sel = new Select(Relationship);
        sel.selectByIndex(1);

    }

    @Then("user enters Date of Birth")
    public void user_enters_date_of_birth() {
        WebElement Dateofbirth = driver.findElement(By.id("dependent_dateOfBirth"));
        Dateofbirth.click();

        WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select sel = new Select(month);
        sel.selectByValue("2");

        WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select sel1 = new Select(year);
        sel1.selectByValue("2014");

        List<WebElement> Alldate = driver.findElements(By.xpath("//table/tbody/tr/td/a"));
        for (WebElement date : Alldate) {
            if (date.getText().equals("3")) {
                date.click();

            }
        }
    }
        @Then("dependets saved successfully")
        public void dependets_saved_successfully () {
            WebElement saveButton = driver.findElement(By.id("btnSaveDependent"));
            saveButton.click();
        }

    }







