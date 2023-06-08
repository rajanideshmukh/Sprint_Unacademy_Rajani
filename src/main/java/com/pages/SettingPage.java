package com.pages;

import com.utility.Utility;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.JavascriptExecutor;
public class SettingPage extends Utility 
 {
	
	

	public SettingPage() 
	{

        PageFactory.initElements(driver, this);

    }
	
	@FindBy(xpath="//img[@src=\"https://static.uacdn.net/thumbnail/user/default.png\"]")
    WebElement profileicon;  
	public void ProfileIcon()
	{
		  profileicon.click();
		 
	}
	
	
	@FindBy(xpath="//p[text()='Settings']")
    WebElement profileSetting;
	
	public void SettingOption() 
	{
	 profileSetting.click();
		
	}
   
	
	@FindBy(xpath="(//*[@class=\"title-undefined css-1kan1lc-P1-Title e5iwyy2\"])[1]")
	 WebElement name;
	
	public void NameVisible() 
	{
		JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].scrollIntoView(true);", name);
        name.isDisplayed();
        System.out.println("name is visible");
		
	}

	@FindBy(xpath="//*[text()='Edit number']")
	 WebElement editNumber;
	public void editnumber() 
	{
		editNumber.click();
		
	}
	
	
	@FindBy(xpath="//div[@class='css-12kcuqz-TTUWidget e19xu9zu5']")
	 WebElement cancelcross;
	public void Cancel() 
	{
		cancelcross.click();
		
	}
	
	@FindBy(xpath="//button[@aria-label='Edit username']")
    WebElement text;
	
	public void textname() 
	{
	    text.click();
	   // text.clear();
		
	}
	
	
	@FindBy(xpath="//*[text()='Save']")
    WebElement save;  
	
	public void editUsernameField() 
	{
           save.click();
	}
	
	
	@FindBy(xpath="//*[text()='Edit email']")
    WebElement emailedit;  
	
	public void editEmailField() 
	{
           emailedit.click();
	}
	
	
	@FindBy(xpath="//input[@type='email']")
    WebElement data;  

	public void invalidData(String mn)
	{
		data.sendKeys("rajanideshmukh2915@gmail.com.innnn");
		
		
	}
	
	
	@FindBy(xpath="//*[text()='Continue']")
    WebElement email;  
	
	public void emailContinue() 
	{
		 email.click();
	}
	
	
	
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement editData;
	
	public void editSave(String username) throws InterruptedException
    {
	      //  edit.clear();	
	        Thread.sleep(3000);
            editData.sendKeys(username);
            Thread.sleep(3000);
    }

	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
//	@FindBy(xpath="//div[@variant='determinate']")
//   WebElement edit;  
	
//	public void editClear() throws InterruptedException
//  {
//	        editData.clear();	
//	        Thread.sleep(3000);
//         //  edit.sendKeys();
//           Thread.sleep(3000);
//		
//   }

	
//	@FindBy(xpath="//*[text()='Edit username']")
//    WebElement textBox; 
//	public void clearExistingText(String newText)
//	{
//	    textBox.clear();
//	    textBox.sendKeys("rajanideshmukh");
//	}
	
 }
