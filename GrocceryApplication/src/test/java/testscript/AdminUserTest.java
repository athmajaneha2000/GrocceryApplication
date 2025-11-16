package testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import automationcore.Base;
import pages.AdminUserPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;
import utilities.FakerUtility;

public class AdminUserTest extends Base {

	@Test
	public void verifyUserAbleToAddNewAdminUser() throws IOException 
	{
		String username = ExcelUtility.getStringData(0, 0, "GrocceryLoginPage");
		String password = ExcelUtility.getStringData(0, 1, "GrocceryLoginPage");

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnSigninnButton();
		HomePage homepage = new HomePage(driver);
		homepage.clickOnAdminMoreInfoLink();
	
		FakerUtility faker = new FakerUtility();
		
		String username1 = faker.creteRandomUser();
		String password1 = faker.createRandomPassword();
		AdminUserPage adminpage = new AdminUserPage(driver);
		adminpage.addNewUser();
		adminpage.enterUsernameOnUsernameFeild(username1);
		adminpage.enterpasswordOnPasswordFeild(password1);
		adminpage.selectingUserType();
		adminpage.ClickOnSaveButton();
	}

	@Test

	public void verifyUserAbleToSearchNewlyAddedAdminUser() throws IOException 
	{
		String username = ExcelUtility.getStringData(0, 0, "GrocceryLoginPage");
		String password = ExcelUtility.getStringData(0, 1, "GrocceryLoginPage");

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnSigninnButton();
		HomePage homepage = new HomePage(driver);
		homepage.clickOnAdminMoreInfoLink();

		String username1 = ExcelUtility.getStringData(0, 0, "GrocceryAdminPage");
		AdminUserPage adminpage = new AdminUserPage(driver);
		adminpage.clickOnSearchButton();
		adminpage.enterUsernameOnSearchAdminUsers(username1);
		adminpage.selectUserTypeOnSearchAdminUser();
		adminpage.clickOnSearchButtonOnAdminSeachUser();
	}

	@Test
	public void verifyUserAbleToResetAdminUser() throws IOException {
		String username = ExcelUtility.getStringData(0, 0, "GrocceryLoginPage");
		String password = ExcelUtility.getStringData(0, 1, "GrocceryLoginPage");

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnSigninnButton();
		HomePage homepage = new HomePage(driver);
		homepage.clickOnAdminMoreInfoLink();
		AdminUserPage adminpage = new AdminUserPage(driver);
		adminpage.clickOnResetButtonOnAdminUser();
	}

}
