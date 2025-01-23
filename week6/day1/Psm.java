package week6.day1;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Psm {
	
	//Global declare
		public RemoteWebDriver driver;
		
	//you can change the order from xml
		@Parameters({"password","username","url"})

		@BeforeMethod
	//while creating input args you should follow the order @Parameters
		public void precondition(String password,String username,String url) {
			
		
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://leaftaps.com/opentaps/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			
		}
		
		
		
	@AfterMethod

	public void postCondition() {
	
		driver.quit();
		}
	}




