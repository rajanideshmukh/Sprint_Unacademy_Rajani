package settingpage_stepdefinitions_testdata;
import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;
import java.util.Map;
 
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
 
import com.aventstack.extentreports.Status;
import com.pages.HomePage;
import com.pages.LandingPage;
import com.pages.LoginPage;
import com.pages.SettingPage;
import com.utility.Config;
import com.utility.ExcelReader;
import com.utility.Utility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Ex2_Scenario_testdata extends Utility
{
	public LandingPage ldp;
	public LoginPage lp;
	public HomePage hp;
	public SettingPage sp;
	 ExcelReader reader;
	//private int rowNumber;
	//private String SheetName;

public void objectMethod() throws IOException 
{
	ldp = new LandingPage();
	lp = new LoginPage();
	hp = new HomePage();
	sp = new SettingPage();
}

@Given("Chrome is opened and Unacademy app is opened")
public void chrome_is_opened_and_unacademy_app_is_opened() throws IOException, InterruptedException
{
	 objectMethod();
     Thread.sleep(5000);

     logger =report.createTest("test01");
     logger.log(Status.INFO, "Validating landing page title");

     String actualtitle = ldp.validateLandinPageTitle();
	 String expectedtitle = "Unacademy - India's largest learning platform"; 
		
		
	 try {
         assertEquals(actualtitle, expectedtitle);
         logger.log(Status.PASS, "Step1 is passed");
         System.out.println(actualtitle);
         assert true;
     } catch (AssertionError e) {
         e.printStackTrace();
         logger.log(Status.FAIL, "Step1 is failed");
         captureScreenshotOnFailure();
         assert false;
     }

 
}

@Then("User navigate onto Unacademy landing page")
public void user_navigate_onto_unacademy_landing_page() throws IOException, InterruptedException
{
	objectMethod();
	Thread.sleep(2000);
	String actualtitle = ldp.validateLandinPageTitle();
	System.out.println(actualtitle); 
	Thread.sleep(2000);
	
	 logger.log(Status.INFO, "Step2 is executed");

}

@When("User clicks on login button")
public void user_clicks_on_login_button() throws IOException, InterruptedException 
{
	objectMethod();
	Thread.sleep(2000);
    ldp.LoginButton1();
//	Thread.sleep(2000);
	Utility.implicitWait();
	logger.log(Status.INFO, "Step3 is executed");
}

@Then("User Navigates onto login page")
public void user_navigates_onto_login_page() throws IOException, InterruptedException 
{
    
	objectMethod();
	Thread.sleep(1000);
	String actualtitle = lp.validateLoginPageTitle();
	System.out.println(actualtitle); 
	Thread.sleep(2000);
	
	logger.log(Status.INFO, "Step4 is executed");
	
}

@When("User enters mobile number")
public void user_enters_mobile_number() throws IOException, InterruptedException 
{
	objectMethod();
	Thread.sleep(3000);
	lp.loginmobilenumber("7743836896");
	
	logger.log(Status.INFO, "Step5 is executed");
}

@When("Clicks on login button")
public void clicks_on_login_button() throws IOException, InterruptedException 
{
	objectMethod();
	Thread.sleep(3000);
    lp.LoginButton2();
	Thread.sleep(3000);
	
	logger.log(Status.INFO, "Step6 is executed");
}

@When("User enter the OTP")
public void user_enter_the_otp() throws IOException, InterruptedException
{

	objectMethod();
	Thread.sleep(15000);
    
	logger.log(Status.INFO, "Step7 is executed");
	
}

@When("User click on verify OTP button")
public void user_click_on_verify_otp_button() throws IOException, InterruptedException 
{
	objectMethod();
	Thread.sleep(5000);
	lp.verifyOtp("");
	
	logger.log(Status.INFO, "Step8 is executed");
}

@Then("User Navigates on home page")
public void user_navigates_on_home_page() throws IOException, InterruptedException 
{
	objectMethod();
	Thread.sleep(2000);
	String actualtitle = hp.validateHomePageTitle();
	System.out.println(actualtitle); 
	Thread.sleep(5000);

	logger.log(Status.INFO, "Step9 is executed");
}

@When("User clicks on profile icon")
public void user_clicks_on_profile_icon() throws IOException, InterruptedException 
{
	objectMethod();
	Thread.sleep(5000);
	sp.ProfileIcon();	
	Thread.sleep(5000);
	
	logger.log(Status.INFO, "Step10 is executed");
	
}

@When("User click on Setting option")
public void user_click_on_setting_option() throws IOException, InterruptedException 
{
	objectMethod();
	Thread.sleep(5000);
    sp.SettingOption();
	
	logger.log(Status.INFO, "Step11 is executed");
}

@Then("User should see current profile information:")
public void user_should_see_current_profile_information() throws IOException, InterruptedException
{
	objectMethod();
	Thread.sleep(5000);
	
	logger.log(Status.INFO, "Step12 is executed");
	
	
}

@When("User clicks on edit Username button")
public void user_clicks_on_edit_username_button() throws IOException, InterruptedException 
{
	objectMethod();
	Thread.sleep(1000);
	sp.textname();
	Thread.sleep(5000);
	
	logger.log(Status.INFO, "Step13 is executed");
}

@When("User fills the form from given sheetname {string} and rownumber {int}")
public void user_fills_the_form_from_given_sheetname_and_rownumber(String sheetName,Integer rowNumber) throws IOException, InvalidFormatException, InterruptedException 
{
	objectMethod();
    Utility.implicitWait();
    reader = new ExcelReader();
    List<Map<String,String>> testData = reader.getData(Config.excelPath, sheetName);     
    Thread.sleep(3000);
    String username = testData.get(rowNumber).get("username");
   
    Thread.sleep(3000);
    sp.editSave(username);                //for entering data
    Thread.sleep(3000);
    sp.editUsernameField();            //for save
    Thread.sleep(2000);
    
    logger.log(Status.INFO, "Step14 is executed");
	
}

@Then("It shows the updated Username")
public void it_shows_the_updated_username() throws InterruptedException 
{
	Thread.sleep(2000);

	logger.log(Status.INFO, "Step15 is executed");
}

}