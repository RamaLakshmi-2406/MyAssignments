package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnExplicitWait {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		Boolean until = wait.until(ExpectedConditions.numberOfWindowsToBe(3));
		System.out.println("Is there a delay:"+until);
		driver.quit();
		

	}

}
