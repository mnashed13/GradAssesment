package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\798014\\eclipse-workspace\\GradAssignmentSelenium\\src\\main\\java\\Features\\test.feature", 
		glue= {"stepDefinitions"},
		name= {"pretty","html:test-outout"},
		monochrome = true,
		dryRun= false
		
		)





public class testrunner {

}
