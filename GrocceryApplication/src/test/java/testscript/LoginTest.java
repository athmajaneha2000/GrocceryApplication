package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationcore.Base;
import pages.LoginPage;
import utilities.ExcelUtility;


public class LoginTest extends Base
{     @Test(priority =1,description= "verifying user with valid credentials")
	
	 public void verifyUserWithValidCredentials() throws IOException
   {
	   String username= ExcelUtility.getStringData(0, 0, "GrocceryLoginPage");
	   String password = ExcelUtility.getStringData(0, 1,"GrocceryLoginPage");
	 LoginPage loginpage = new LoginPage(driver);
	loginpage.enterUsernameOnUsernameField(username);
	loginpage.enterPasswordOnPasswordField(password);
	loginpage.clickOnSigninnButton();
	boolean isdashboarddisplayed =loginpage.dasboardDisplayed();
	Assert.assertTrue(isdashboarddisplayed,"user is unable to login with valid credentials");
}
@Test(priority=2,description="verifying user with valid username and invalid password")
public void verifyUserWithValidUsernameAndInValidPassword() throws IOException

{
	 String username= ExcelUtility.getStringData(1, 0, "GrocceryLoginPage");
	   String password = ExcelUtility.getStringData(1, 1, "GrocceryLoginPage");
	 LoginPage loginpage = new LoginPage(driver);
	loginpage.enterUsernameOnUsernameField(username);
	loginpage.enterPasswordOnPasswordField(password);
	loginpage.clickOnSigninnButton();
}
@Test(priority=3,description="verifying user with invalid username and valid password")
public void verifyUserWithInValidUsernameAndValidPassword() throws IOException

{
	 String username= ExcelUtility.getStringData(1, 0, "GrocceryLoginPage");
	   String password = ExcelUtility.getStringData(1, 1, "GrocceryLoginPage");
	 LoginPage loginpage = new LoginPage(driver);
	loginpage.enterUsernameOnUsernameField(username);
	loginpage.enterPasswordOnPasswordField(password);
	loginpage.clickOnSigninnButton();
	
}
@Test(priority=4,description="verifying user with invalid credentials")
public void verifyWithInvalidCredentials() throws IOException
{
	   String username= ExcelUtility.getStringData(2, 0, "GrocceryLoginPage");
	   String password = ExcelUtility.getStringData(2, 1, "GrocceryLoginPage");
	 LoginPage loginpage = new LoginPage(driver);
	loginpage.enterUsernameOnUsernameField(username);
	loginpage.enterPasswordOnPasswordField(password);
	loginpage.clickOnSigninnButton();
	boolean isdashboarddisplayed =loginpage.dasboardDisplayed();
	Assert.assertFalse(isdashboarddisplayed,"user is able to login with valid credentials");
}
}