package Test_class;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import UMS_automation.UMS_automation.base_class;
import UMS_automation.UMS_automation.pom_class;

public class test_class1 extends base_class					//base class extends in test_class1
{
	@BeforeClass
	public void InitialiseBrowser() throws InterruptedException 
	{
		OpenBrowser();
		driver.manage().window().maximize();
			
		pom_class pom = new pom_class(driver);
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,500)");		//for scrollbar
		pom.EnterUN();  
		pom.EnterPWD(); 
		Thread.sleep(4000); 
		
		pom.ClickLoginButton();
	    Thread.sleep(2000);
		driver.navigate().refresh();

	}
	
	@Test
	public void test1() 
	{
		driver.findElement(By.xpath("(//a[@class=\"nav-sub-link\"])[2]")).click();
		
	}
	
//	@Test
//	public void test2() 
//	{
//		
//	}
}
