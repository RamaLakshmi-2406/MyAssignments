package week6.day1;


	

	import java.io.IOException;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



	public class EditLead extends Psm{
		
		
		@DataProvider(name="SetValues",indices= {1,2})
	public String[][] fetchData() throws IOException{
	
	//Step 5 
	//call the excel program
			return DataSheet.readExcel();
		}
		
	@Test(dataProvider="SetValues")
		public void EditL(String phNum,String updComName) throws InterruptedException {
			
			
		driver.findElement(By.linkText("CRM/SFA")).click();
	    driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phNum);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Edit")).click();
		WebElement update =driver.findElement(By.id("updateLeadForm_companyName"));
                update.clear();
                update.sendKeys(updComName);
		driver.findElement(By.name("submitButton")).click();
		driver.close();
	}
	}








