package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.XL;
import page.EnterTimeTrackPage;
import page.LicensePage;
import page.LoginPage;

public class CheckIssueDate extends BaseTest{
	@Test(priority=3)
	public void testIssueDate() throws InterruptedException {
		String un = XL.getData(XL_PATH, "CheckIssueDate", 1, 0);
		String pw = XL.getData(XL_PATH, "CheckIssueDate", 1, 1);
		String iDate = XL.getData(XL_PATH, "CheckIssueDate", 1, 2);
		// Enter valid user name 
		LoginPage l= new LoginPage(driver);
		l.setUsername(un);
		// Enter valid password 
		l.setPassword(pw);
		// click on Loginbutton
		l.clickLogin();
		// click on seetings
		Thread.sleep(2000);
		
		EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
		
	
		Thread.sleep(1000);
		e.clickSettings();
		// click on licenses tab
		Thread.sleep(1000);
		e.clickLicense();
		//varify the IssueDate 
		Thread.sleep(2000);
		LicensePage lc=new LicensePage(driver);
		lc.varifyIssueDate(iDate);
	    
	    

}
}
