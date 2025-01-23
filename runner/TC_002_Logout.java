package runner;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class TC_002_Logout extends ProjectSpecificMethod {
	
	@Test
	public void LogoutPage() {
		
		LoginPage lp=new LoginPage();
		
		lp.EnterUserName()
		.EnterPassword()
		.ClickLoginButton()
		.ClickonLogout();
		
	}
}
