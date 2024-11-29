package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class MembershipPage extends CommonMethods {

    @FindBy(xpath="//a[@href='/humanresources/symfony/web/index.php/pim/viewMemberships/empNumber/87146']")
    public WebElement membersip;

    @FindBy(id="btnAddMembershipDetail")
    public WebElement Dependents;

    @FindBy(id="membership_membership")
    public WebElement  Membership;

    @FindBy(id="btnAddMembershipDetail")
    public WebElement add;

    @FindBy(id="membership_subscriptionAmount")
    public WebElement  amount;

    @FindBy(id="membership_subscriptionPaidBy")
    public WebElement subscription;

    public MembershipPage(){
        PageFactory.initElements(driver, this);
    }


}
