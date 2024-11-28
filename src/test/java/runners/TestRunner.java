package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


    @RunWith(Cucumber.class)
    @CucumberOptions( features = "src/test/features/",
    glue="steps",
    dryRun=true,
    tags="@member",
    plugin = {"pretty"}
    )

    public class TestRunner {

}
