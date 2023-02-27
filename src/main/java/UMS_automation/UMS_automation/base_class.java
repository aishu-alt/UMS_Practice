package UMS_automation.UMS_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base_class {
	
	public WebDriver driver;	//declare publically webdriver driver
	
	public void OpenBrowser()			    //browser open
	{ 
	    System.setProperty("webdriver.chrome.driver", "D:\\selenium_files\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://192.168.1.103:4990/student-login");
		driver.manage().window().maximize();	
	}
	

}
