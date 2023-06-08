package testrunner;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		features = {"src/test/resources/features/Ex02_Scenario_Outline.feature"},
		glue = {"settingpage_stepdefinitions","apphooks"},
				 plugin= {"pretty" ,
						 "html:target/creport/cucumber",
						 "json:target/creport/cucumber.json",
				 		 "junit:target/creport/cucumber.xml"}
				)
public class Ex02_TestRunner_SettingPage_Outline extends AbstractTestNGCucumberTests{
 
}
