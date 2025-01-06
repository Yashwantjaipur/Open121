/**
 * 
 */
package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * 
 */
public class HomePage  extends BasePage{
	//WebDriver driver;
	public HomePage ( WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//span[text()='My Account']")
    WebElement linkMyaccount;
	@FindBy(xpath = "//ul [@class='dropdown-menu dropdown-menu-right']/li/a[contains(text(),'Register')]")
	WebElement linkRegister;
	@FindBy(xpath = "//a[text()='Login']")
	WebElement linklogin;
	
	public void clickMyAccount() {
		linkMyaccount.click();
	}
	public void clickRegister() {
		linkRegister.click();
	}
	public void clickLogin() {
		linklogin.click();
	}
	
	
	
	
	
	
	
	
	
}
