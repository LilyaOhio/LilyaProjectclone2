package utils;

import pages.AddDependentsPage;
import pages.SearchEmployeePage;
import pages.LoginPage;

public class PageInitializer {
    public static LoginPage loginPage;
    public static SearchEmployeePage searchEmployeePage;
    public static AddDependentsPage addDependentsPage;



    public static void initializePageObjects(){
        loginPage=new LoginPage();
        searchEmployeePage= new SearchEmployeePage();
        addDependentsPage= new AddDependentsPage();

    }

}
