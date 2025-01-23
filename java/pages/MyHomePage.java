package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;

public class MyHomePage extends ProjectSpecificMethod{

	public void ClickonLeads() {
	
	driver.findElement(By.linkText("Leads")).click();
	}
	
	public void ClickonContacts() {
		
		driver.findElement(By.linkText("Contacts")).click();
		
		}
	
	public MyAccountPage ClickonAccounts() {
		
		driver.findElement(By.linkText("Accounts")).click();
		return new MyAccountPage();
		}
}
