package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.CommonMethods;

import java.io.IOException;
import java.time.Duration;

public class Hooks extends CommonMethods {

    @Before
    public void start() throws IOException {
        openBrowserAndLaunchApplication();
        //driver = new ChromeDriver();
        //driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        //driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

@After
    public void end(){

        //driver.quit();
    closeBrowser();
}



}
