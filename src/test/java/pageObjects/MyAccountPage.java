 package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage{
	
	public MyAccountPage(WebDriver driver)
	{
		super(driver);
	}
	
	Actions act=new Actions(driver);
	
	@FindBy(xpath="//button[@data-automation-id='navigationItem-Candidate Home']")
	WebElement homeBtn;
	
	@FindBy(xpath="//h2[normalize-space()='Welcome to Candidate Home']")
	WebElement txtHeader;
	
	
	@FindBy(xpath="//span[normalize-space()='Sign Out']")
	WebElement btnSignout;
	
	public void clickHome()
	{
		homeBtn.click();
	}
	
	public boolean isMyAccountPageExists()
	{
	try
	{
		return (txtHeader.isDisplayed());
	}
	catch(Exception e)
	{
		return false;
	}
	}
	
	
	public void clickSignout()
	{
		act.moveToElement(btnSignout).click();;
	}
}
