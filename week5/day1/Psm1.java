package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Psm1 {
	//Global declare
	public ChromeDriver driver;
	
	//you can change the order from xml
			@Parameters({"password","username","url",})
	
	
	
	
	@BeforeMethod
	public void precondition(String password,String username,String url) 
		 throws InterruptedException {
		
				
				
				ChromeOptions opt=new ChromeOptions();
				opt.addArguments("--disable-notifications");
				
			    ChromeDriver driver = new ChromeDriver(opt);
				driver.manage().window().maximize();
				driver.get("https://login.salesforce.com/");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				
				driver.findElement(By.className("username")).sendKeys("dilip@testleaf.com");
				driver.findElement(By.id("password")).sendKeys("Test@2025");
				driver.findElement(By.id("Login")).click();
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//button[contains(text(),'View All')]")).click();
				Thread.sleep(3000);
				
				WebElement se = driver.findElement(By.xpath("//p[text()='Legal Entities']"));
				Actions act=new Actions(driver);
				act.scrollToElement(se).perform();
				se.click();
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//div[contains(text(),'New')]")).click();
			    Thread.sleep(3000);
				
	}
		        
		        @AfterMethod
		        public void postCondition() {
					driver.close();
					}
		        
			}



				
			



