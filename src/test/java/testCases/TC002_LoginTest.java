package testCases;

import org.checkerframework.checker.units.qual.t;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC002_LoginTest  extends BaseClass{
	@Test(groups = {"sanity","master"})
	public void verify_login() {
		logger.info("**starting login");
		try {
		HomePage hp =new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		LoginPage lp = new LoginPage(driver);
		lp.setEmail(p.getProperty("email"));
		lp.setPassword("pwd");
		lp.btnClickLogin();
        	
		MyAccountPage mac = new MyAccountPage(driver);
   boolean 	tergetpage =	mac.isMyAccountPageExist();
	Assert.assertEquals(tergetpage, true);
		}
		
		catch(Exception e) {
			Assert.fail();
		}
		
		
		
		
   
   logger.info("***Finished***");
   
   
   
   
		
		
	}
	
	
	

}
