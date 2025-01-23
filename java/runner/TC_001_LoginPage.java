package runner;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class TC_001_LoginPage extends ProjectSpecificMethod {
	
	@Test
	public void runLogin() {
		
		LoginPage lp=new LoginPage();
		
		
		lp.EnterUserName()
		.EnterPassword()
		.ClickLoginButton()
		.ClickonCRMSFA()
		.ClickonAccounts()
		.ClickonCreateAccount()
		.AccountName()
		.Submitbutton();
		
		
		
	}
	
}
