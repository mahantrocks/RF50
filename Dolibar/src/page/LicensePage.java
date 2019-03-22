package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;



public class LicensePage {
	private final String xp="//nobr[text()='Issue Date:']/../../td[2]";
 @FindBy(xpath=xp)
 private WebElement issueDate;
 
 public LicensePage(WebDriver driver) {
	 PageFactory.initElements(driver, this);
 }
 public void varifyIssueDate(String iDate) {
	String actual= issueDate.getText();
	//System.out.println(actual+"date");
	Assert.assertEquals( actual,iDate );
 }
}
