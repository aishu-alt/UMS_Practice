package Test_class;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import UMS_automation.UMS_automation.base_class;
import UMS_automation.UMS_automation.pom_class;
import net.bytebuddy.utility.RandomString;

public class test_class1 extends base_class													//base class extends in test_class1
{
	@BeforeTest
	public void InitialiseBrowser() throws InterruptedException 
	{
		OpenBrowser();
		Thread.sleep(1000); 
		driver.manage().window().maximize();
		pom_class pom = new pom_class(driver);
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,500)");				//for scrollbar
		pom.EnterUN();  
		pom.EnterPWD(); 
		pom.ClickLoginButton();
		Thread.sleep(2000); 
//		driver.navigate().refresh();
	}
	
	@Test(enabled=false)
	public void test1() throws InterruptedException
	{
		//---------------------------------INSERT COLLEGE
		//driver.navigate().refresh();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class=\"sidemenu-label\"])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@id=\"College\"]")).click();
		driver.findElement(By.xpath("//button [text()=\" Add New Record \"]")).click();
		String data3=RandomStringUtils.randomNumeric(5);											//for random alpanumeric data				
		String data4=RandomStringUtils.randomAlphabetic(4);	
		driver.findElement(By.xpath("//input[@formcontrolname=\"CgCode\"]")).sendKeys(data3);
		driver.findElement(By.xpath("//input[@formcontrolname=\"CgShName\"]")).sendKeys("MIT"+data4);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()=\"CoPattern\"]")).click(); Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=\" Regular \"]")).click();  Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@formcontrolname=\"CgName\"]")).sendKeys("MIT "+data4); Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(@class,'mat-checkbox-inner-container')]")).click(); Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[contains(@class,'mat-checkbox-inner-container')])[2]")).click(); Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='CoPattern']")).click(); Thread.sleep(3000);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()=' HUBBALLI ']")).click(); Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(@class,'ng-tns-c113-10')]")).click(); Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=' BENGALURU ']")).click(); Thread.sleep(3000);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder=\"Address 1\"]")).sendKeys("Pune");
		driver.findElement(By.xpath("//input[@placeholder=\"Address 2\"]")).sendKeys("Pune 123");
		driver.findElement(By.xpath("//input[@formcontrolname=\"CgFax\"]")).sendKeys("1574856963");
		driver.findElement(By.xpath("//input[@formcontrolname=\"CgPhone\"]")).sendKeys("9999999999");
		driver.findElement(By.xpath("//input[@formcontrolname=\"CgAddr3\"]")).sendKeys("Pune 456"); Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@formcontrolname=\"CgPin\"]")).sendKeys("444444"); Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@formcontrolname=\"CgWeb\"]")).sendKeys("www.mit"+data4+".com"); Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@formcontrolname=\"CgEmail\"]")).sendKeys("mit"+data4+"@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()=\" Submit \"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()=' Close ']")).click();
		Thread.sleep(3000);
		
		//--------------------------------UPDATE
		
		driver.navigate().refresh();
		driver.findElement(By.xpath("//button[text()=' Back']")).click(); Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder=\"Search\"]")).sendKeys("MIT "+data4); Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@title=\"Edit\"]")).click();  Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@formcontrolname=\"CgPhone\"]")).clear();  Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@formcontrolname=\"CgPhone\"]")).sendKeys("8888888888"); Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@formcontrolname=\"CgPin\"]")).clear();  Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@formcontrolname=\"CgPin\"]")).sendKeys("555555");  Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()=' Update ']")).click(); Thread.sleep(3000);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()=' Close ']")).click(); Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()=' Back']")).click();  Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder=\"Search\"]")).sendKeys("MIT "+data4); Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@title=\"Edit\"]")).click();  Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()=' Back']")).click();  Thread.sleep(3000);
		
		//----------------------------------DELETE
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder=\"Search\"]")).sendKeys("MIT "+data4); Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@title=\"Delete\"]")).click(); Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-label[text()=' Delete ']")).click();  Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=' Yes ']")).click(); Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder=\"Search\"]")).sendKeys("MIT "+data4); Thread.sleep(3000);	
		
	}
	

	@Test(enabled=true)
	public void test2() throws InterruptedException
	{
		//----------------------------------INSERT FACULTY
		
		String data5=RandomStringUtils.randomNumeric(2);
		String data6=RandomStringUtils.randomAlphabetic(2);	
		driver.findElement(By.xpath("(//span[@class=\"sidemenu-label\"])[2]")).click(); Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id=\"Faculty\"]")).click(); Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()=\" Add New Record \"]")).click(); Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder=\"Faculty Code\"]")).sendKeys("XYZ"+data5); Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder=\"Faculty Name\"]")).sendKeys("Admin "+data6); Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()=\"Submit\"]")).click(); Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()=' Close ']")).click(); Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Back']")).click(); Thread.sleep(3000);
		
//		//----------------------------------SEARCH
//		
//		driver.findElement(By.xpath("//input[@placeholder=\"Search\"]")).sendKeys("Admin "+data6); Thread.sleep(3000);
		
		//----------------------------------UPDATE
		driver.navigate().refresh();
	   // driver.findElement(By.xpath("//input[@placeholder=\\\"Search\\\"]")).clear(); Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder=\"Search\"]")).sendKeys("Admin "+data6); Thread.sleep(3000);
		//driver.findElement(By.xpath("//a[@class=\"btn-floating\"]")).click(); Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@title=\"Edit\"]")).click(); Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder=\"Faculty Name\"]")).clear(); Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder=\"Faculty Name\"]")).sendKeys("Admin "+data6+ " XYZ"); Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Update']")).click(); Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()=' Close ']")).click(); Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Back']")).click(); Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@formcontrolname=\"FcCode\"]")).sendKeys("Admin "+data6+" XYZ"); Thread.sleep(3000);
		
		//----------------------------------DELETE
		
		driver.navigate().refresh();
		driver.findElement(By.xpath("//input[@placeholder=\"Search\"]")).sendKeys("Admin "+data6+" XYZ"); Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@title=\"Delete\"]")).click(); Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Delete']")).click(); Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id=\"yes\"]")).click(); Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()=' Close ']")).click(); Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[text()='Back']")).click(); Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder=\"Search\"]")).sendKeys("Admin "+data6+" XYZ"); Thread.sleep(3000);
		
		
	}
	
	
	
//	@Test()
//	public void test2() throws InterruptedException 																		//positive test case
//	{
//		String data1=RandomStringUtils.randomNumeric(5);											//for random alpanumeric data				
//		String data2=RandomStringUtils.randomAlphabetic(10);									//for random numeric data
//		driver.findElement(By.xpath("(//a[@class=\"nav-sub-link\"])[2]")).click();
//		driver.findElement(By.xpath("(//button[@type=\"button\"])[2]")).click();
//		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys(data1);					//pass sendkeys as "data" varialble 
//		driver.findElement(By.xpath("//input[@formcontrolname=\"DsName\"]")).sendKeys(data2);	//passing sendkeys as "data1" variable 
//		driver.findElement(By.xpath("(//button[@type=\"submit\"])[1]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//button[text()=' Close ']")).click();
//		driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]")).click();
//	
//	
//	}
	
	
	
	
//	@Test
//	public void test3() throws InterruptedException 
//	{
//		driver.findElement(By.xpath("(//a[@class=\"nav-sub-link\"])[2]")).click();
//		driver.findElement(By.xpath("//input[@placeholder=\"Search\"]")).sendKeys("Delhi");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//i[@aria-hidden=\"true\"])[2]")).click();
//		driver.findElement(By.xpath("//input[@placeholder=\"District Name\"]")).sendKeys("New Delhi");
//		driver.findElement(By.xpath("(//button[@type=\"submit\"])[1]")).click();
//		driver.findElement(By.xpath("//button[text()=' Close ']")).click();
//	}
}
