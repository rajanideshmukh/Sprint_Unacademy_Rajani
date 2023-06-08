package com.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Utility;

public class LandingPage extends Utility 
{

    public LandingPage() 
    {
        PageFactory.initElements(driver, this);
    }


    public String validateLandinPageTitle()
    {
        return validatePageTitle();
    }   
    
    @FindBy(xpath="(//*[text()='Log in'])")
	WebElement Login1; 
	public void LoginButton1()
	{
		Login1.click();
		//return driver.getTitle(); 
	}
}

















//@FindBy(xpath="//span[text()='Select your goal ']")
//private WebElement Selectyourgoal;
	
