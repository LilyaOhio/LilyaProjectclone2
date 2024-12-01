package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


    @RunWith(Cucumber.class)
    @CucumberOptions( features = "src/test/resources/features/",
    glue="steps",
    dryRun=false,
    tags="@regression5",
    plugin = {"pretty", "html:target/cucumber.html","json:target/cucumber-reports/cucumber.json",
            // to execute failed test cases one more time
            "rerun:target/failed.tex"}
    )

    public class TestRunner {

}
