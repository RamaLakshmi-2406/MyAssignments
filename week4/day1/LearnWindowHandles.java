package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandles {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.id("username")).sendKeys("dilip@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("leaf@2024");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//span[text()='Learn More']")).click();
	   
		
		//get WindowHandles
	   Set<String> allWindow=driver.getWindowHandles();
	   System.out.println("All Windows:"+allWindow);
	   
	   
       List<String> childWindow=new ArrayList<String>(allWindow);
	   driver.switchTo().window(childWindow.get(1));
	   driver.findElement(By.xpath("//button[text()='Confirm']")).click();
	   System.out.println("ChildWindow:"+driver.getTitle());
	   driver.close();
	   
	   
	   driver.switchTo().window(childWindow.get(0));
	   System.out.println("ParentWindow:"+driver.getTitle());
	   driver.quit();
	 

		
	}

}
