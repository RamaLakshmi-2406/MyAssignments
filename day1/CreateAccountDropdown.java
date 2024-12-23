package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountDropdown {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.partialLinkText("Account")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Rama");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		WebElement element1 = driver.findElement(By.name("industryEnumId"));
	
		Select obj1 = new Select(element1);
		obj1.selectByIndex(3);
		
		WebElement element2 = driver.findElement(By.name("ownershipEnumId"));
		Select obj2 = new Select(element2);
		obj2.selectByVisibleText("S-Corporation");
		
		WebElement element3 = driver.findElement(By.id("dataSourceId"));
		Select obj3 = new Select(element3);
		obj3.selectByValue("Employee");
		
		WebElement element4 = driver.findElement(By.id("marketingCampaignId"));
		Select obj4 = new Select(element4);
		obj4.selectByIndex(6);
		
		WebElement element5 = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select obj5 = new Select(element5);
		obj5.selectByValue("Texas");
		
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(5000);
		driver.close();
		
		

	}

}
