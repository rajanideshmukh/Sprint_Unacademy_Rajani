package testrunner;

import org.testng.annotations.Test;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		features = {"src/test/resources/features/Ex01_Scenario1.feature"},
		glue = {"settingpage_stepdefinitions","apphooks"},
				 plugin= {"pretty" ,
						 "html:target/creport/cucumber",
						 "json:target/creport/cucumber.json",
				 		 "junit:target/creport/cucumber.xml"}
				)
public class Ex01_TestRunner_SettingPage extends AbstractTestNGCucumberTests
{
  
  
}
