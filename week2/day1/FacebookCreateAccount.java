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
		driver.findElement(By.name("reg_email__")).sendKeys("9003254315");
		driver.findElement(By.name("reg_passwd__")).sendKeys("achu@2406");
		
		
		WebElement Element1 = driver.findElement(By.id("day"));
		Select obj1 = new Select(Element1);
	    obj1.selectByIndex(23);
		
		WebElement Element2 = driver.findElement(By.id("month"));
		Select obj2 = new Select(Element2);
		obj2.selectByVisibleText("Apr");
		
		WebElement Element3 = driver.findElement(By.id("year"));
		Select obj3=new Select(Element3);
		obj3.selectByValue("1999");
		
		driver.findElement(By.className("_58mt")).click();
		Thread.sleep(5000);
		driver.close();

	}

}
