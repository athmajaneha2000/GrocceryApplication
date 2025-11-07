package automationcore;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base
{
	 public WebDriver driver;
     @BeforeMethod
	  public void initialiseBrowser()
	   {
		   driver = new ChromeDriver();
		   
		   driver.get("https://groceryapp.uniqassosiates.com/admin/login");
		   
		   driver.manage().window().maximize();
		   
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	  }
      @AfterMethod
	   public void driverCloseandQuit()
	   {
		  // driver.close();
		  // driver.quit();
}
}