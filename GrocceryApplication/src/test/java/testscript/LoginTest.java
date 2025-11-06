package testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import automationcore.Base;
import pages.LoginPage;
import utilities.ExcelUtility;


public class LoginTest extends Base
{     @Test
	
	 public void verifyUserWithValidCredentials() throws IOException
   {
	   String username= ExcelUtility.getStringData(0, 0, "GrocceryLoginPage");
	   String password = ExcelUtility.getStringData(0, 1,"GrocceryLoginPage");
	 LoginPage loginpage = new LoginPage(driver);
	loginpage.enterUsernameOnUsernameField(username);
	loginpage.enterPasswordOnPasswordField(password);
	loginpage.clickOnSigninnButton();
}
@Test
public void verifyUserWithValidUsernameAndInValidPassword() throws IOException

{
	 String username= ExcelUtility.getStringData(1, 0, "GrocceryLoginPage");
	   String password = ExcelUtility.getStringData(1, 1, "GrocceryLoginPage");
	 LoginPage loginpage = new LoginPage(driver);
	loginpage.enterUsernameOnUsernameField(username);
	loginpage.enterPasswordOnPasswordField(password);
	loginpage.clickOnSigninnButton();
}
@Test
public void verifyUserWithInValidUsernameAndValidPassword() throws IOException

{
	 String username= ExcelUtility.getStringData(1, 0, "GrocceryLoginPage");
	   String password = ExcelUtility.getStringData(1, 1, "GrocceryLoginPage");
	 LoginPage loginpage = new LoginPage(driver);
	loginpage.enterUsernameOnUsernameField(username);
	loginpage.enterPasswordOnPasswordField(password);
	loginpage.clickOnSigninnButton();
}
@Test
public void verifyWithInvalidCredentials() throws IOException
{
	   String username= ExcelUtility.getStringData(2, 0, "GrocceryLoginPage");
	   String password = ExcelUtility.getStringData(2, 1, "GrocceryLoginPage");
	 LoginPage loginpage = new LoginPage(driver);
	loginpage.enterUsernameOnUsernameField(username);
	loginpage.enterPasswordOnPasswordField(password);
	loginpage.clickOnSigninnButton();
}
}