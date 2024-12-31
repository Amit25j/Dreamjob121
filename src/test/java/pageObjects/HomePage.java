package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	//Loctors
	
	@FindBy(xpath="//span[@class='menu-item-txt'][normalize-space()='More']")
	WebElement lnkMore;
	
	@FindBy(xpath="https://www.qualys.com/careers/")
	WebElement lnkCareers;
	
	@FindBy(xpath="//a[@id='CybotCookiebotDialogBodyButtonAccept']")
	WebElement accept;
	
	@FindBy(xpath="//a[@class='q-button right']")
	WebElement lnkSearch;
	
	@FindBy(xpath="//span[@class='css-1xtbc5b']")
	WebElement lnkSignin;
	
	public void clickMore()
	{
		lnkMore.click();
	}
	
	public void clickCarrer()
	{
		lnkCareers.click();
	}
	
	public void clickAccept()
	{
		accept.click();
	}
	
	public void clickSearch()
	{
		lnkSearch.click();
	}
	
	public void clickSignin()
	{
		lnkSignin.click();
	}
	

}
