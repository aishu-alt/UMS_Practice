package Test_class;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import UMS_automation.UMS_automation.base_class;
import UMS_automation.UMS_automation.pom_class;
import net.bytebuddy.utility.RandomString;

public class test_class1 extends base_class													//base class extends in test_class1
{
	@BeforeClass
	public void InitialiseBrowser() throws InterruptedException 
	{
		OpenBrowser();
		driver.manage().window().maximize();
			
		pom_class pom = new pom_class(driver);
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,500)");				//for scrollbar
		pom.EnterUN();  
		pom.EnterPWD(); 
		Thread.sleep(10000); 
		
		pom.ClickLoginButton();
	    Thread.sleep(2000);
		driver.navigate().refresh();

	}
	
	@Test(enabled=false)
	public void test1() throws InterruptedException 																		//positive test case
	{
		String data1=RandomStringUtils.randomNumeric(5);											//for random alpanumeric data				
		String data2=RandomStringUtils.randomAlphabetic(10);									//for random numeric data
		driver.findElement(By.xpath("(//a[@class=\"nav-sub-link\"])[2]")).click();
		driver.findElement(By.xpath("(//button[@type=\"button\"])[2]")).click();
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys(data1);					//pass sendkeys as "data" varialble 
		driver.findElement(By.xpath("//input[@formcontrolname=\"DsName\"]")).sendKeys(data2);	//passing sendkeys as "data1" variable 
		driver.findElement(By.xpath("(//button[@type=\"submit\"])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()=' Close ']")).click();
		driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]")).click();
	
	
	}
	
	@Test
	public void test2() throws InterruptedException 
	{
		driver.findElement(By.xpath("(//a[@class=\"nav-sub-link\"])[2]")).click();
		driver.findElement(By.xpath("//input[@placeholder=\"Search\"]")).sendKeys("Delhi");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//i[@aria-hidden=\"true\"])[2]")).click();
		driver.
		driver.findElement(By.xpath("//input[@placeholder=\"District Name\"]")).sendKeys("New Delhi");
		driver.findElement(By.xpath("(//button[@type=\"submit\"])[1]")).click();
		driver.findElement(By.xpath("//button[text()=' Close ']")).click();
	}
}
