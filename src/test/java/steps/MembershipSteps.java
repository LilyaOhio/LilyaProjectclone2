package steps;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.CommonMethods;

public class MembershipSteps extends CommonMethods {



    @Then("user click on membership button")
    public void user_click_on_membership_button() {
WebElement membersip= driver.findElement(By.xpath("//a[@href='/humanresources/symfony/web/index.php/pim/viewMemberships/empNumber/87146']"));
membersip.click();
    }
    @Then("user clicks on Add option button")
    public void user_clicks_on_add_option_button() {
WebElement add= driver.findElement(By.id("btnAddMembershipDetail"));
add.click();
    }
    @Then("user select option from dropdown menu")
    public void user_select_option_from_dropdown_menu() {
        WebElement Membership = driver.findElement(By.id("membership_membership"));
        Select sel = new Select(Membership);
        sel.selectByIndex(3);
    }
    @Then("user select Subscription Paid By")
    public void user_select_subscription_paid_by() {
WebElement subscription= driver.findElement(By.id("membership_subscriptionPaidBy"));
Select sel= new Select(subscription);
sel.selectByIndex(1);
    }
    @Then("user enter paid amount")
    public void user_enter_paid_amount() {
WebElement amount= driver.findElement(By.id("membership_subscriptionAmount"));
amount.sendKeys("70");
    }
    @Then("user select Currency")
    public void user_select_currency() {
WebElement currency= driver.findElement(By.id("membership_currency"));
Select sel= new Select(currency);
sel.selectByVisibleText("United States Dollar");
    }
    @Then("user enters day of Subscription and Renewal")
    public void user_enters_day_of_subscription_and_renewal() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
