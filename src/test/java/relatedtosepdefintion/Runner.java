package relatedtosepdefintion;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
	features = {"C:\\Users\\kumar\\Documents\\workspace-spring-tool-suite-4-4.21.1.RELEASE\\BDDCucumberTestNG2\\src\\test\\resources\\Form\\form2.feature"},
	glue = ("stepdefinition")  //inside bracket Packege Name
 )

public class Runner extends AbstractTestNGCucumberTests {

}
