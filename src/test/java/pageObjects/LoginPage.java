package pageObjects;


import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	Actions act =  new Actions(driver);
	
	//String expectedUrl= driver.getCurrentUrl();
	
//WebDriverWait wait=new WebDriverWait(driver,10);
	
	@FindBy(xpath="//input[@data-automation-id='email']")
	WebElement txtemail;
	
	@FindBy(xpath="//input[@data-automation-id='password']")
	WebElement txtpwd;
	
	
	//@FindBy(xpath="//button[@type='submit'][@data-automation-id='signInSubmitButton']")
	WebElement Loginbtn=driver.findElement(By.xpath("//button[@type='submit'][@data-automation-id='signInSubmitButton']"));
	
	
	
	@FindBy(xpath="//button[@data-automation-id='navigationItem-Candidate Home']")
	WebElement txthome;
	
	public void setemail(String email)
	{
		txtemail.sendKeys(email);
	}
	
	public void setpwd(String pwd)
	{
		txtpwd.sendKeys(pwd);
	}
	
	public void clickbtn()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		act.moveToElement(Loginbtn).click().perform();
		//Loginbtn.click();
		
	}
	
	public void validateHome()
	{
		txthome.click();
	}

}
