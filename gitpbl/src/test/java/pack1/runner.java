package pack1;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features="/Users/TA20463982/Tamilworkspace/limat/src/main/java/pack1/petstore.feature",
				glue={"bind"},
				dryRun=false)


public class runner extends AbstractTestNGCucumberTests{
	
	

}
