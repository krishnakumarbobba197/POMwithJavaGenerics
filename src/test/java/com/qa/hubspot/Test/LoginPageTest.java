/**
 * 
 * Krishna Kumar
 */

package com.qa.hubspot.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.hubspot.pages.LoginPage;

public class LoginPageTest extends BaseTest{
	@Test(priority =1)
	public void verifyLoginPageTitleTest() 
	{
   	String title = page.getInstance(LoginPage.class).getLoginPageTitle();
		System.out.println("Login Page Title: " + true);
		Assert.assertEquals(title, "HubSpot Login");  
	}
	@Test(priority=2) 
	public void loginTest ()
	{
	   	page.getInstance(LoginPage.class).doLogin("krishnakumarbobba197@gmail.com","9986275722Mk");
			
	}
	
	
	

}
