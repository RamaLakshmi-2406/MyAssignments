package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.partialLinkText("Leads")).click();
		driver.findElement(By.partialLinkText("Create Lea")).click();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Rama");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Lakshmi");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Tester");
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(5000);
		driver.close();

	}

}
