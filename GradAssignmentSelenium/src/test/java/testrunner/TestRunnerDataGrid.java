package testrunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;








@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = { "pretty"},
		features ="src\\main\\java\\Features\\testExcelSheet.feature",
        glue = {"stepDefinitions"},
        dryRun = false,
		monochrome = true
        
)
public class TestRunnerDataGrid { // NOSONAR SonarLint does not know about @RunWith(Cucumber.class)
}