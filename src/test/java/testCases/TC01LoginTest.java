package testCases;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;
//import org.junit.Assert;

public class TC01LoginTest extends BaseClass{
	
	
	@Test
	public void verify_login()
	{
		
		logger.info("***********Starting TC01************");
		//try {
		HomePage hp=new HomePage(driver);
		//hp.clickMore();
		//hp.clickCarrer();
		hp.clickAccept();
		hp.clickSearch();
		logger.info("***********Clicked on Search************");
		hp.clickSignin();
		logger.info("***********Clicked on SignIn************");
		
		LoginPage lp=new LoginPage(driver);
		lp.setemail(p.getProperty("email"));
		lp.setpwd(p.getProperty("password"));
		lp.clickbtn();
		lp.validateHome();
		

		
		
		//logger.info("***********Clicked on Sign in************");
		//logger.debug("Debug Logs");
		
		//MyAccountPage map=new MyAccountPage(driver);
		//map.clickHome();
		//map.isMyAccountPageExists();
		//boolean targetPage=map.isMyAccountPageExists();
		//Assert.assertTrue(targetPage);
		//map.clickSignout();
		
		//}
		//catch(Exception e)
		//{
		//	logger.error("Test Failed");
		//	logger.debug("Debug Logs ");
		//	Assert.fail();
		//}
		
}
}
