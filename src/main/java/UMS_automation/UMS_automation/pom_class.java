package UMS_automation.UMS_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom_class 
{
	@FindBy (xpath="//input[@id=\"LoginName\"]") private WebElement UserName;
	@FindBy (xpath="//input[@id=\"password-field\"]") private WebElement UserPWD;
	@FindBy (xpath="//button[text()='Sign In']") private WebElement clickLoginButton;
	
	
	public pom_class(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
		
	}
	
	public void EnterUN() 
	{
		UserName.sendKeys("shweta");
	}
	
	public void EnterPWD() 
	{
		UserPWD.sendKeys("shweta12");
	}
	
	public void ClickLoginButton() 
	{
		clickLoginButton.click();
	}

}
