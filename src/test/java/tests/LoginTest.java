package tests;

import org.testng.annotations.Test;


import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest {
	@Test	
	public void testValidLogin()
	{
		LoginPage loginpage= new LoginPage(driver);
		loginpage.enterusername("admin@yourstore.com");
		loginpage.enterpasswordname("admin");
		loginpage.rememberme();
		loginpage.clickbutton();
		System.out.println("title of the page is" + driver.getTitle());
		
		
	}
	

}
