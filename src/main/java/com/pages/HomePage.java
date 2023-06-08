package com.pages;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import com.utility.Utility;

public class HomePage extends Utility
{ 
	
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	} 
	
	
	public  String validateHomePageTitle()
	{
		return driver.getTitle(); 
	}  
	
}
