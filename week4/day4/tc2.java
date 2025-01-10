package week4.day4;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class tc2 extends ProjectSpecificMethod1{

	@Test
	public void testcase2() throws InterruptedException {
		
		

        driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("TestLeaf");
		Thread.sleep(3000);
		
		
        driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]")).sendKeys("Salesforces");
        Thread.sleep(3000);
        
		
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement comboboxButton = w.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='combobox-button-208']")));
		comboboxButton.click();
		
		 // Wait for the option with "Active" status to be visible and click it
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement activeStatusOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//lightning-base-combobox-item//span[text()='Active']")));
        activeStatusOption.click();
		
		
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();

		WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(10));
	    WebElement errorMessage = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Complete this field')]")));
	    
		
		
        if (errorMessage.isDisplayed()) {
            System.out.println("TestCase 2 Passed: Alert message verified successfully.");
        } else {
            System.out.println("TestCase 2 Failed: Alert message not displayed.");
            
        }
	}

}
