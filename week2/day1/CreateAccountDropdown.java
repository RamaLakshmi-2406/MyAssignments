package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountDropdown {

	private static final WebElement Element1 = null;

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
		
		WebElement Element1 = driver.findElement(By.name("industryEnumId"));
		Select obj = new Select(Element1);
		obj.selectByIndex(3);
		
		WebElement Element2 = driver.findElement(By.name("ownershipEnumId"));
		Select obj1 = new Select(Element2);
		obj1.selectByVisibleText("S-Corporation");
		
		WebElement Element3 = driver.findElement(By.id("dataSourceId"));
		Select obj2 = new Select(Element3);
		obj2.selectByValue("LEAD_EMPLOYEE");
		
		WebElement Element4 = driver.findElement(By.id("marketingCampaignId"));
		Select obj3 = new Select(Element4);
		obj3.selectByIndex(6);
		
		WebElement Element5 = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select obj4 = new Select(Element5);
		obj4.selectByValue("TX");
		
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(5000);
		driver.close();
		
		

	}

}
