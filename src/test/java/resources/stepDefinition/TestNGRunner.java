package resources.stepDefinition;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/resources/featurefiles",
        glue = {"resources.stepDefinition"},
        plugin = {"pretty",
                "html:target/cucumber-Reporter.html",
                "json:target/report.json"})

public class TestNGRunner extends AbstractTestNGCucumberTests{
}
