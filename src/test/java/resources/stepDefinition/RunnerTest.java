package resources.stepDefinition;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber"},
        features = {"src/test/java/resources/featurefiles"},
        glue={"resources.stepDefinition"},
        monochrome = true,
        dryRun = false)
public class RunnerTest {
}
