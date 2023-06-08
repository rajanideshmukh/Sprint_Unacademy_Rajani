package settingpage_stepdefinitions;

import static org.testng.Assert.assertEquals;
import java.io.IOException;

import com.aventstack.extentreports.Status;
import com.pages.HomePage;
import com.pages.LandingPage;
import com.pages.LoginPage;
import com.pages.SettingPage;
import com.utility.Utility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Ex01_Scenario1 extends Utility{

	public LandingPage ldp;
	public LoginPage lp;
	public HomePage hp;
	public SettingPage sp;
	
	public void objectMethod() throws IOException {

		ldp = new LandingPage();
		lp = new LoginPage();
		hp = new HomePage();
		sp = new SettingPage();
	}
	
	@Given("Chrome is opened and Unacademy app is opened")
	public void chrome_is_opened_and_unacademy_app_is_opened() throws IOException, InterruptedException
	{
		objectMethod();
		Thread.sleep(3000);
		String actualtitle = ldp.validateLandinPageTitle();
		String expectedtitle = "Unacademy - India's largest learning platform"; 
		assertEquals(expectedtitle, actualtitle);
		System.out.println(actualtitle); 
	//	Thread.sleep(2000);
		Utility.implicitWait();
		
		logger =report.createTest("test01");
	    logger.log(Status.INFO, "Validating landing page title");
 
			
			
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
		String expectedtitle = "Unacademy - India's largest learning platform"; 
		assertEquals(expectedtitle, actualtitle);
		System.out.println(actualtitle); 
	//	Thread.sleep(2000);
		 logger.log(Status.INFO, "Step2 is executed");
		 Utility.implicitWait();
	}

	
	@When("User clicks on login button")
	public void user_clicks_on_login_button() throws IOException, InterruptedException
	{
		objectMethod();
		Thread.sleep(2000);
	//	String actualtitle = ldp.validateLandinPageTitle();
	    ldp.LoginButton1();
     	System.out.println("click on login button"); 
		Thread.sleep(2000);
		
		 logger.log(Status.INFO, "Step3 is executed");
	}
	
	@Then("User Navigates onto login page")
	public void user_navigates_onto_login_page() throws IOException, InterruptedException 
	{
		objectMethod();
		Thread.sleep(1000);
		String actualtitle = lp.validateLoginPageTitle();
		System.out.println("navigate to login page"); 
		Thread.sleep(2000);
		
		 logger.log(Status.INFO, "Step4 is executed");
	}
	
	@When("User enters mobile number")
	public void user_enters_mobile_number() throws IOException, InterruptedException 
	{
		objectMethod();
		Thread.sleep(3000);
		lp.loginmobilenumber("7743836896");
		System.out.println("mobile number"); 
		
		 logger.log(Status.INFO, "Step5 is executed");
	}
		
	
	@When("Clicks on login button")
	public void clicks_on_login_button() throws IOException, InterruptedException 
	{
		objectMethod();
		Thread.sleep(5000);
		//String actualtitle = lp.LoginButton();
	    lp.LoginButton2();
		System.out.println("click on login button"); 
		Thread.sleep(5000);
		
		 logger.log(Status.INFO, "Step6 is executed");

	}
	@When("User enter the OTP")
	public void user_enter_the_otp() throws IOException, InterruptedException 
	{
		objectMethod();
		Thread.sleep(15000);
		//lp.loginOtp("896803");
        Thread.sleep(2000);
        
        logger.log(Status.INFO, "Step7 is executed");
	}
	
	@When("User click on verify OTP button")
	public void user_click_on_verify_otp_button() throws IOException, InterruptedException 
	{
		objectMethod();
		Thread.sleep(5000);
		lp.verifyOtp("");
  	System.out.println("verify OTP");
  	
  	 logger.log(Status.INFO, "Step8 is executed");
	}

	
	@Then("User Navigates on home page")
	public void user_navigates_on_home_page() throws IOException, InterruptedException
	{
		objectMethod();
		Thread.sleep(2000);
		String actualtitle = hp.validateHomePageTitle();
	//	String expectedtitle = "UPSC CSE - GS Exam Preparation 2023 | Crack UPSC CSE - GS | Unacademy"; 
	//	assertEquals(expectedtitle, actualtitle);
		System.out.println(actualtitle); 
		Thread.sleep(5000);
		
		 logger.log(Status.INFO, "Step9 is executed");
	}


	@When("User clicks on profile icon")
	public void user_clicks_on_profile_icon() throws IOException, InterruptedException  
	{
		objectMethod();
		Thread.sleep(5000);
		//String actualtitle = sp.ProfileIcon();
	    sp.ProfileIcon();
		//System.out.println(actualtitle); 
		Thread.sleep(5000);
		System.out.println("clicked on profile icon"); 
		
		 logger.log(Status.INFO, "Step10 is executed");
	}
	@When("User click on Setting option")
	public void user_click_on_setting_option() throws IOException, InterruptedException 
	{
		objectMethod();
		Thread.sleep(5000);
		//String actualtitle = sp.ProfileIcon();
	    sp.SettingOption();
		//System.out.println(actualtitle); 
		Thread.sleep(5000);
		System.out.println("clicked on setting option"); 
		
		 logger.log(Status.INFO, "Step11 is executed");
	}
	
	@Then("User navigate to the profile setting page")
	public void user_navigate_to_the_profile_setting_page() throws IOException, InterruptedException 
	{
		objectMethod();
		Thread.sleep(2000);
		//String actualtitle = hp.validateHomePageTitle();
		//System.out.println(actualtitle); 
		Thread.sleep(8000);
		System.out.println("navigate to profile setting page"); 
		
		 logger.log(Status.INFO, "Step12 is executed");
	}
	
	
	@Then("User should see current profile information:")
	public void user_should_see_current_profile_information() throws IOException, InterruptedException 
	{
		objectMethod();
		Thread.sleep(8000);
		
		 logger.log(Status.INFO, "Step13 is executed");
	}
	
   @When("Users go to the name field")
	public void users_go_to_the_name_field() throws IOException, InterruptedException
	{
		objectMethod();
		Thread.sleep(4000);
		sp.NameVisible();	
		System.out.println("go to name field"); 
		
		 logger.log(Status.INFO, "Step14 is executed");
	}
	
	@Then("User able to click on the editnumber field")
	public void user_able_to_click_on_the_editnumber_field() throws IOException, InterruptedException
	{
		objectMethod();
		Thread.sleep(5000);
		sp.Cancel();
		sp.editnumber();
		Thread.sleep(3000);
		System.out.println("clicked on editnumber"); 
		
		 logger.log(Status.INFO, "Step15 is executed");
	}
	@When("User clicks on edit Username button")
	public void user_clicks_on_edit_username_button() throws IOException, InterruptedException 
	{
	    
		objectMethod();
		Thread.sleep(1000);
		sp.textname();
	//	sp.clearExistingText();
		Thread.sleep(3000);
		System.out.println("clicked on edit username"); 
		
		 logger.log(Status.INFO, "Step16 is executed");
	}
	
	@When("User edit the data in Username field {string}")
	public void user_edit_the_data_in_username_field(String string) throws IOException, InterruptedException
	{
		objectMethod();
		sp.editUsernameField();
		Thread.sleep(5000);
	
		 logger.log(Status.INFO, "Step17 is executed");
	}
	
	@Then("It shows the updated Username")
	public void it_shows_the_updated_username() throws InterruptedException
	{
	   
		Thread.sleep(5000);
		 logger.log(Status.INFO, "Step18 is executed");
	}
	
	
	@When("User clicks on edit Email button")
	public void user_clicks_on_edit_email_button() throws IOException, InterruptedException 
	{
		objectMethod();
		Thread.sleep(1000);
		sp.editEmailField();
		Thread.sleep(3000);
		System.out.println("clicks on edit email button"); 
		
		 logger.log(Status.INFO, "Step19 is executed");
		
	}
	
	@When("User enters the invalid data in email field\"<email>\"")
	public void user_enters_the_invalid_data_in_email_field_email() throws IOException, InterruptedException 
	{
	    
		objectMethod();
		Thread.sleep(2000);
		sp.invalidData("rajanideshmukh2915@gmail.com.innnn");
		Thread.sleep(3000);
		sp.emailContinue();
		Thread.sleep(2000);
		System.out.println("enter invalid data"); 
		
		 logger.log(Status.INFO, "Step20 is executed");
		
	}
	@Then("It shows Email is not valid")
	public void it_shows_email_is_not_valid() throws InterruptedException
	{
		Thread.sleep(1000);
		System.out.println("Email is not valid");
		Thread.sleep(3000);
		
		 logger.log(Status.INFO, "Step21 is executed");
	}

}

