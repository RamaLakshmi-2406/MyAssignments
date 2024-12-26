package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAdvancedXpath {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.xpath("//div[@id='username_container']//input")).sendKeys("dilip@testleaf.com");
		driver.findElement(By.xpath("//label[text()='Password']//following-sibling::input[1]")).sendKeys("leaf@2024");
		driver.findElement(By.xpath("//div[@id='pwcaps']//following-sibling::input")).click();

		Thread.sleep(5000);
		driver.close();
	}

}
