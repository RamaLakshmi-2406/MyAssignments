package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;

public class CreateAccountPage extends ProjectSpecificMethod{
	public CreateAccountPage AccountName() {
		driver.findElement(By.id("accountName")).sendKeys("TCS1");
		return this;
	}

	
	public ViewAccountPage Submitbutton() {
	driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	return new ViewAccountPage();
}
	
	
}
