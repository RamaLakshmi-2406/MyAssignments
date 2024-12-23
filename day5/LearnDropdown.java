package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropdown {


	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.telerik.com/contact");
		
		WebElement dd1 = driver.findElement(By.name("DropdownListFieldController_0"));
		Select op1=new Select(dd1);
		op1.selectByIndex(4);
		Thread.sleep(3000);
		
		WebElement dd2 = driver.findElement(By.name("DropdownListFieldController"));
		Select op2=new Select(dd2);
		op2.selectByValue("UI for WinForms");
		Thread.sleep(3000);
		
		WebElement dd3 = driver.findElement(By.name("DynamicListFieldController"));
		Select op3=new Select(dd3);
		op3.selectByVisibleText("India");
		Thread.sleep(3000);
		
		driver.close();
		
		
		
		
		
		

	}

}
