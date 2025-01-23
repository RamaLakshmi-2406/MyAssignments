package week6.day2;




import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SalesForceFullProgram {
	public static void main(String[] args) throws InterruptedException {
		
		
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
		
		
		//Toggle
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		Thread.sleep(3000);
		
		//View all
		driver.findElement(By.xpath("//button[contains(text(),'View All')]")).click();
		Thread.sleep(3000);
		
		//Sales
		WebElement se = driver.findElement(By.xpath("//p[text()='Sales']"));
		Actions act=new Actions(driver);
		act.scrollToElement(se).perform();
		se.click();
		Thread.sleep(3000);
	
		//Accounts
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement accountsTab = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Accounts']")));

		// Use Actions class to move to the element and click
		Actions actions = new Actions(driver);
		actions.moveToElement(accountsTab).click().perform();
		Thread.sleep(3000);
		
		//New
        driver.findElement(By.xpath("//div[@title='New']")).click();
        Thread.sleep(3000);
        
        //Name
        driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Rama");
        Thread.sleep(3000);
        
        
        //Select Ownership as Public (using Actions class)
        driver.findElement(By.id("combobox-button-300")).click();
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//span[text()='Public']")).click();
        Thread.sleep(3000);
       // WebElement ownershipDropdown = driver.findElement(By.xpath("//select[@name='Ownership']"));
        //Select select = new Select(ownershipDropdown);
        //select.selectByVisibleText("Public"); // Select the "Public" option
 
              
        //Save
        driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();
        Thread.sleep(3000);
        
      // Verify the account name
        WebDriverWait wait3=new WebDriverWait(driver,Duration.ofSeconds(30));
        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//lightning-formatted-text[text()='Rama']")));
        

        String accountName = "Rama";
		// Verify if account name is correct
        if(accountName.contains("Rama")) {
            System.out.println("Account creation successfull");
        } else {
            System.out.println("Account creation not successfull");
        }
       
        driver.quit();
        
	}



		
	}


