package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;

public class LoginPage extends ProjectSpecificMethod{
	
	
	public LoginPage EnterUserName() {
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		return this;
	}
	
	public LoginPage EnterPassword() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		return this;
		
	}
	
	public HomePage ClickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new HomePage();
	}

}
