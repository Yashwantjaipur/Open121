package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegisterationPage;
import pageObjects.HomePage;
import testBase.BaseClass;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class TC_001AccountRegistrationTest  extends BaseClass{
	
	@Test(groups = {"Regression","Master"})
	public   void verify_account_regestration() {
		logger.info("**** StartingTC001_AccountRegistration****");
		
		try {
			
		
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		logger.info("Clicked on My account");
		hp.clickRegister();
		logger.info("Clicked on My register link");
		AccountRegisterationPage repage = new AccountRegisterationPage(driver);
		
		logger.info("Providing Customer Details");
		repage.setFirstName(randomeString().toUpperCase());
		repage.setLastName(randomeString().toUpperCase());
		repage.setEmail(randomeString()+"@gmail.com");
		repage.setTelephone(randomeNumber());
		
		String password = randomeAlphaNumber();
		repage.setPassword(password);
		repage.setConfirmPassword(password);
		repage.setPrivacyPolicy();
		repage.clickContinue();
		logger.info("Validating Expected Message..");
	String confirmation =	repage.getConfirmationMsg();
    	
	Assert.assertEquals(confirmation, "Your Account Has Been Created!");
	
	
    }
		catch(Exception e) {
			logger.error("Test Failed");
			logger.debug("Debug logs");
			Assert.fail();
		}
	}
	

}
