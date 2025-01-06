package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegisterationPage extends BasePage {
	
	public AccountRegisterationPage( WebDriver driver) {
		super(driver);
	}
 @FindBy(xpath = "//input[@name='firstname']")
  WebElement txtFirstName;
 @FindBy(xpath = "//input[@name='lastname']")
  WebElement txtLastName;
 
 @FindBy(xpath = "//input[@name='email']")
  WebElement txtEmail;
 @FindBy(xpath = "//input[@name='telephone']")
 WebElement txtTelephone;
 @FindBy(xpath = "//input[@name='password']")
 WebElement txtPassword;
 @FindBy(xpath = "//input[@name='confirm']")
 
 WebElement txtConfirmPassword;
 @FindBy(xpath = "//input[@name='agree']")
  WebElement clickPrivacy;
 @FindBy(xpath = "//input[@value='Continue']")
  WebElement btnContinue;
 @FindBy(xpath = "//div[@class='col-sm-9']/h1[text()='Your Account Has Been Created!']")
 
 WebElement msgConfirmation;
 
 public void setFirstName(String fname) {
	 txtFirstName.sendKeys(fname);
 }
 public void setLastName(String lname) {
	 txtLastName.sendKeys(lname);
 }
public void setEmail(String email) {
	txtEmail.sendKeys(email);
	
}
public void setTelephone(String tel) {
	txtTelephone.sendKeys(tel);
	
}
public void setPassword(String pwd) {
	txtPassword.sendKeys(pwd);
}
public void setConfirmPassword(String pwd) {
	txtConfirmPassword.sendKeys(pwd);
}
 public void setPrivacyPolicy() {
	 clickPrivacy.click();
 }
 public void clickContinue() {
	 btnContinue.click();
 }
 
 
 
 public String getConfirmationMsg()
 {
	 try {
		 return (msgConfirmation.getText());
	 }
	 catch (Exception e) {
		 return(e.getMessage());
	 }
 }
 
 
}
 
 
 
	
	
	
	
	
	
	
	
	
	

