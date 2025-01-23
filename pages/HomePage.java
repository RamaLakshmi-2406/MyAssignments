package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;

public class HomePage extends ProjectSpecificMethod{

	public MyHomePage ClickonCRMSFA() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage();
	}
	
	public LoginPage ClickonLogout() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new LoginPage();
	}
	
	
}
