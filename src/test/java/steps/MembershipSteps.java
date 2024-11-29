package steps;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.CommonMethods;

import java.util.List;

public class MembershipSteps extends CommonMethods {


    @Then("user click on membership button")
    public void user_click_on_membership_button() {
        //WebElement membersip = driver.findElement(By.xpath("//a[@href='/humanresources/symfony/web/index.php/pim/viewMemberships/empNumber/87146']"));
        click(membershipPage.membersip);
    }

    @Then("user clicks on Add option button")
    public void user_clicks_on_add_option_button() {
        //WebElement add = driver.findElement(By.id("btnAddMembershipDetail"));
        click(membershipPage.add);
    }

    @Then("user select option from dropdown menu")
    public void user_select_option_from_dropdown_menu() {
        //WebElement Membership = driver.findElement(By.id("membership_membership"));
        Select sel = new Select(membershipPage.Membership);
        sel.selectByIndex(3);
    }

    @Then("user select Subscription Paid By")
    public void user_select_subscription_paid_by() {
        //WebElement subscription = driver.findElement(By.id("membership_subscriptionPaidBy"));
        Select sel = new Select(membershipPage.subscription);
        sel.selectByIndex(1);
    }

    @Then("user enter paid amount {string}")
    public void user_enter_paid_amount(String string) {
        WebElement amount = driver.findElement(By.id("membership_subscriptionAmount"));
        amount.sendKeys(string);

    }

    @Then("user select Currency")
    public void user_select_currency() {
       WebElement currency = driver.findElement(By.id("membership_currency"));
        Select sel = new Select(currency);
        sel.selectByVisibleText("United States Dollar");
    }

    @Then("user enters day of Subscription and Renewal")
    public void user_enters_day_of_subscription_and_renewal() {
        WebElement subscriptionCommenceDate = driver.findElement(By.id("membership_subscriptionCommenceDate"));
        subscriptionCommenceDate.click();

        WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select sel = new Select(month);
        sel.selectByValue("10");

        WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select sel1 = new Select(year);
        sel1.selectByValue("2024");

        List<WebElement> Alldate = driver.findElements(By.xpath("//table/tbody/tr/td/a"));
        for (WebElement date : Alldate) {
            if (date.getText().equals("3")) {
                date.click();


                WebElement renewal = driver.findElement(By.id("membership_subscriptionRenewalDate"));
                renewal.click();
                WebElement month2 = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
                Select sel2 = new Select(month2);
                sel2.selectByValue("10");

                WebElement year2 = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
                Select sel3 = new Select(year2);
                sel3.selectByValue("2025");

                List<WebElement> Alldate2 = driver.findElements(By.xpath("//table/tbody/tr/td/a"));
                for (WebElement date2 : Alldate2) {
                    if (date2.getText().equals("3")) {
                        date2.click();
                    }
                }
            }
        }
    }
                    @Then("user clicks on save button")
                    public void user_clicks_o_save_button () {
                        WebElement saveButton = driver.findElement(By.id("btnSaveMembership"));
                        saveButton.click();
                    }

                }





