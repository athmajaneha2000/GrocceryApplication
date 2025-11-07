package testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import automationcore.Base;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class HomeTest extends Base
{
	@Test
	 public void verifyUserCanLogoutSuccessfully() throws IOException
	   {
		   String username= ExcelUtility.getStringData(0, 0, "GrocceryLoginPage");
		   String password = ExcelUtility.getStringData(0, 1,"GrocceryLoginPage");
		   LoginPage loginpage = new LoginPage(driver);
		   loginpage.enterUsernameOnUsernameField(username);
		   loginpage.enterPasswordOnPasswordField(password);
	       loginpage.clickOnSigninnButton();
		   HomePage homepage = new HomePage(driver);
		   homepage.clickOnAdminIcon();
		   homepage.clickOnLogoutButton();
	}
	
	 
}

