package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Psm {
	
	//Global declare
		public RemoteWebDriver driver;
		
	//you can change the order from xml
		@Parameters({"password","username","url","browser"})

		@BeforeMethod
	//while creating input args you should follow the order @Parameters
		public void precondition(String password,String username,String url,String browserVal) {
			
			if(browserVal.equalsIgnoreCase("chrome")) {
				driver = new ChromeDriver();		
			}
			else if(browserVal.equals("Edge")) {
				driver = new EdgeDriver();
			}
			
			
			driver.manage().window().maximize();
			driver.get("http://leaftaps.com/opentaps/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			
		}
		
		
		
	@AfterMethod

	public void postCondition() {
		driver.close();
	}
	}


