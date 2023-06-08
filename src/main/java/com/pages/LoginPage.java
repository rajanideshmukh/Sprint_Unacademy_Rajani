package com.pages;

import java.io.IOException;
//import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Utility;

public class LoginPage extends Utility  
{
	
	public String validateLoginPageTitle()
	{
		return driver.getTitle(); 
	} 
	
	
	@FindBy(xpath="//input[@aria-invalid='false']")
    WebElement mobilenumber;  

    public void loginmobilenumber(String mn)
    {
            mobilenumber.sendKeys(mn);
    }
    
	
	@FindBy(xpath="(//span[@class=\"button--label-content css-0\"])[3]")
//	@FindBy(xpath="//*[text()='Log in'])[2]")
	 WebElement Login2; 

	public void LoginButton2()
	{
		Login2.click();
		//return driver.getTitle(); 
	}
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="(//span[@class=\"button--label-content css-0\"])[3]")
	WebElement verifyotp;
	
	public void verifyOtp(String string)
	{
		verifyotp.click();
	}

}


