package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookCreateAccount {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Rama");
		driver.findElement(By.name("lastname")).sendKeys("Lakshmi");
		driver.findElement(By.name("register_email__")).sendKeys("9003254315");
		driver.findElement(By.id("password_step_input")).sendKeys("Tuna@123");
		
		WebElement element1=driver.findElement(By.id("day"));
		Select obj1=new Select(element1);
		obj1.selectByIndex(24);
		
		WebElement element2=driver.findElement(By.id("month"));
		Select obj2=new Select(element2);
		obj2.selectByVisibleText("April");
		
		WebElement element3=driver.findElement(By.id("year"));
		Select obj3=new Select(element3);
		obj3.selectByValue("1999");
		
		
		
		driver.findElement(By.className("_58mt")).click();
		Thread.sleep(5000);
		driver.close();

	}

}
