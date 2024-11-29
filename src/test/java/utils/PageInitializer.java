package utils;

import pages.*;

public class PageInitializer {
    public static LoginPage loginPage;
    public static SearchEmployeePage searchEmployeePage;
    public static AddDependentsPage addDependentsPage;
    public static MembershipPage membershipPage;
public static DashboardPage dashboardPage;


    public static void initializePageObjects(){
        loginPage=new LoginPage();
        searchEmployeePage= new SearchEmployeePage();
        addDependentsPage= new AddDependentsPage();
membershipPage=new MembershipPage();
dashboardPage= new DashboardPage();
    }

}
