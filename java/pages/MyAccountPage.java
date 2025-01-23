package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;

public class MyAccountPage extends ProjectSpecificMethod{

	public CreateAccountPage ClickonCreateAccount() {
		driver.findElement(By.linkText("Create Account")).click();
		return new CreateAccountPage();
	}
	
	
	
}
