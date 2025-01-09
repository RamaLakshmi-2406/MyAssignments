package week4.day4;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class tc1 extends ProjectSpecificMethod1 {

	
	@Test
	public void testcase1() throws InterruptedException {
		
		
	
        driver.findElement(By.xpath("//div[@class='slds-form-element__control slds-grow']")).sendKeys("Salesforce Automation by Rama");
        driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();

        WebElement legalEntityName = driver.findElement(By.xpath("//lightning-formatted-text[text()='Salesforce Automation by Rama'][1]"));
        if (legalEntityName.isDisplayed()) {
            System.out.println("Test Passed: Legal Entity Name verified successfully.");
        } else {
            System.out.println("Test Failed: Legal Entity Name not verified.");
        }

	
		
	}

}
