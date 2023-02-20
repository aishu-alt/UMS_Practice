package Test_class;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import UMS_automation.UMS_automation.base_class;
import UMS_automation.UMS_automation.pom_class;

public class test extends base_class
{

	@Test
	public void InitialiseBrowser() throws InterruptedException 
	{
		OpenBrowser();
		Thread.sleep(1000); 
//		pom_class pom = new pom_class(driver);
//		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,500)");				//for scrollbar
//		pom.EnterUN();  
//		pom.EnterPWD(); 
//		Thread.sleep(10000); 
//		
//		pom.ClickLoginButton();
//	    Thread.sleep(2000);
//		driver.navigate().refresh();

	}
}
