package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import page.LoginPage;
import page.TaskListPage;

public class CreateNewCustomer extends BaseTest {
	@Test(priority=4)
	public void TestCreateNewCustomer() {
		// enter the username and password
		LoginPage l= new LoginPage(driver);
		l.setUsername("admin");
		l.setPassword("manager");
		l.clickLogin();
		
		TaskListPage tpage = new  TaskListPage(driver) ;
		tpage.clickOnTasks();
		tpage.clickOnAddNew();
		tpage.setCustomerName("matashree");
		tpage.setDescription("there is no such Description");
		tpage.clickOnCreateBTN();
		
		
	}

}
