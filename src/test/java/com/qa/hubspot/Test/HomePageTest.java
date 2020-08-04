package com.qa.hubspot.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.hubspot.pages.HomePage;
import com.qa.hubspot.pages.LoginPage;

public class HomePageTest extends BaseTest{

	@Test(priority =1)
	public void homePageTitleTest() {
		page.getInstance(LoginPage.class).doLogin("krishnakumarbobba197@gmail.com","9986275722Mk");
		String title = page.getInstance(HomePage.class).getHomePageTitle();
		System.out.println("Home page title is : "+true);
		Assert.assertEquals(title, "Reports dashboard");
	}
	@Test(priority =2)
	public void verifyHomePageHeaderest() {
		page.getInstance(LoginPage.class).doLogin("krishnakumarbobba297@gmail.com","9986275722Mk");
	String header =	page.getInstance(HomePage.class).getHomePageHeader();
	System.out.println("HomePage header is:"+true);
	Assert.assertEquals(header, "Sales Dashboard");
}
}