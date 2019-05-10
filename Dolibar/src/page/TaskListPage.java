package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
	private final String xp="(//div[@class='img'])[1]";
	@FindBy(xpath=xp)
	private WebElement tasks;
	
	private  final String xp1="(//div[@class='addNewButton'])[2]";
	@FindBy(xpath=xp1)
	private WebElement addNewTask;
	
	private final String xp2="//div[@class='item createNewCustomer ellipsis']";
	@FindBy(xpath=xp2)
	private WebElement createNewUser;
	
	@FindBy(id="customerLightBox_nameField")
	private WebElement enterCustomerName;
	
	@FindBy(id="customerLightBox_descriptionField")
	private WebElement addDescription;
	
	
	@FindBy(id="customerLightBox_commitBtn")
	private WebElement creeateBTN;
	
	
	public TaskListPage(WebDriver driver ) {
		PageFactory.initElements(driver,this);
				
	}
	
	public void clickOnTasks() {
		tasks.click();
	}
	
	public void clickOnAddNew() {
		addNewTask.click();
	}
	
	public void clickOnNewCustomer() {
		createNewUser.click();
	}
	
	public void setCustomerName(String cn) {
		enterCustomerName.sendKeys(cn);
	}
	
	 public void setDescription(String des) {
		 addDescription.sendKeys(des);
	 }
	
	 public void clickOnCreateBTN() {
		 creeateBTN.click();
		 
	 }
	

	
	
	
	
	
	
	
	
	
	
	
	
	

}
