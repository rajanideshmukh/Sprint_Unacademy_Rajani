package testrunner;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		features = {"src/test/resources/features/Ex2_Scenario_testdata.feature"},
		glue = {"settingpage_stepdefinitions_testdata","apphooks"},
				 plugin= {"pretty" ,
						 "html:target/creport/cucumber",
						 "json:target/creport/cucumber.json",
				 		 "junit:target/creport/cucumber.xml"}
			
				)
public class Ex2_TestRunner_Setting_Testdata extends AbstractTestNGCucumberTests 
{
  
	
}
