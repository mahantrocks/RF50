package page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id="username")
	private WebElement unTB;
	
	@FindBy(name="pwd")
	private WebElement pwTB;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement loginBTN;
	
	@FindBy(xpath="//span[contains(text(),'invalid')]")
	private WebElement errMSG;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	 public void setUsername(String un) {
		 unTB.sendKeys(un);
	 }
	 public void setPassword(String pw) {
		  pwTB.sendKeys(pw);
	  }
	 public void clickLogin() {
		loginBTN.click();  
	   }
	 public void varifyErrMsgDisplayed() {
		// boolean actual = errMSG.isDisplayed();
		// Assert.assertEquals(actual,true); in real time we use this last line of code instead of these two codes for comparison 
		 Assert.assertTrue(errMSG.isDisplayed());
		 
	 }
	 
	

}
