package Runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		//path of feature file
		features = "/Users/VE20463903/Desktop/eclipse-workspace/Petpbl/src/main/java/Feature/pet.feature",
		 dryRun = false,
		glue = {"Bindingspet"}
		
		
		
		
		)
public class Pet_runnerfile {

}


///Users/VE20463903/Desktop/eclipse-workspace/Petpbl/src/main/java/Feature/Pet.Feature





