package script;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.XL;
import page.LoginPage;

public class InValidLogin extends BaseTest {
	@Test(priority=1)
	public void testInValidLogin() throws InterruptedException {
		 int rc=XL.getRowCount(XL_PATH, "InvalidLogin");
		 Reporter.log("RowCount"+rc,true);
		for (int i=1;i<=rc;i++) {
		String un = XL.getData(XL_PATH, "InvalidLogin", i, 0);
		String pw = XL.getData(XL_PATH, "InvalidLogin", i, 1);
		Reporter.log("UN:"+un,true);
		Reporter.log("PW:"+pw,true);
		//String title = XL.getData(XL_PATH, "ValidLogin", i, 2);
		// Enter valid user name 
		LoginPage l= new LoginPage(driver);
		l.setUsername(un);
		// Enter valid password
		l.setPassword(pw);
		// click on Loginbutton
		l.clickLogin();
		Thread.sleep(1000);
		// varify errorMessage is displayed 
		 
	    l.varifyErrMsgDisplayed();
	    Thread.sleep(1000);
	    
		
		
}
}
}
