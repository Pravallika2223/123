package cucumberOptions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/features",
		glue="stepDefination",
		tags = "@regression",
		monochrome = true,
		strict = true,
		dryRun =true
		)
public class TestRunner {
}
