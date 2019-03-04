package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.XL;
import page.LoginPage;

public class InValidLogin extends BaseTest {
	@Test(priority=1)
	public void testInValidLogin() {
		String un = XL.getData(XL_PATH, "ValidLogin", 1, 0);
		String pw = XL.getData(XL_PATH, "ValidLogin", 1, 1);
		String title = XL.getData(XL_PATH, "ValidLogin", 1, 2);
		// Enter valid user name 
		LoginPage l= new LoginPage(driver);
		l.setUsername(un);
		// Enter valid password
		l.setPassword(pw);
		// click on Loginbutton
		l.clickLogin();
		// varify errorMessage is displayed or not
	    l.varifyErrMsgDisplayed();
		
		
}
}
