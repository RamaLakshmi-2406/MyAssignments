package week5.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DynamicParameterization extends Psm1 {
	
	
	//indices index value start from 0. 
    //for printing 1 value alone, we can use without bracket.For printing 2 values , we will use {2,3}.
		@DataProvider(name="SetValues")
		
        public String[][] fetchData(){
			String[][] data=new String[1][3];
			data[0][0]="Rama";
			data[1][1]="Dilip";
			data[2][2]="Kumar";

		   return data;
			
		}
		
		@Test(dataProvider="SetValues")
		public void dp(String Name) throws InterruptedException {
		

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
