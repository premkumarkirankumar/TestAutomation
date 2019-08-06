package cucumberOptions;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features="src/test/java/cucumberFeatures",
		glue="cucumberStepDefinations")

public class TestRunnerTestNG extends AbstractTestNGCucumberTests {

}
