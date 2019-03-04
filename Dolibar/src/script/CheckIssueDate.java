package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.XL;
import page.EnterTimeTrackPage;
import page.LicensePage;
import page.LoginPage;

public class CheckIssueDate extends BaseTest{
	@Test(priority=1)
	public void testValidLogin() {
		String un = XL.getData(XL_PATH, "ValidLogin", 1, 0);
		String pw = XL.getData(XL_PATH, "ValidLogin", 1, 1);
		String title = XL.getData(XL_PATH, "ValidLogin", 1, 2);
		String Expected = "Jul 14, 2017";
		// Enter valid user name 
		LoginPage l= new LoginPage(driver);
		l.setUsername(un);
		// Enter valid password
		l.setPassword(pw);
		// click on Loginbutton
		l.clickLogin();
	   
		EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
		// varify Enter time track page is displayed or not
		e.varifyPageIsDisplayed(driver,ETO, title);
		// click on seetings tab
		e.clickSettings();
		// click on licenses tab
		e.clickLicense();
		//varify the issue date 
		
		LicensePage lc=new LicensePage(driver);
		lc.varifyIssueDate(Expected);
	    
	    

}
}
