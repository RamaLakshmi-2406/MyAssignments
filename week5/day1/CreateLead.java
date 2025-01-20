package week5.day1;




	import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

	public class CreateLead extends Psm {
	//indices index value start from 0. 
    //for printing 1 value alone, we can use without bracket.For printing 2 values , we will use {2,3}.
		@DataProvider(name="SetValues",indices=1)
		
        public String[][] fetchData(){
			String[][] data=new String[3][3];
			data[0][0]="TestLeaf";
			data[0][1]="Dilip";
			data[0][2]="Kumar";
			
			data[1][0]="TestLeaf";
			data[1][1]="Rama";
			data[1][2]="Lakshmi";
			
			data[2][0]="TestLeaf";
			data[2][1]="Manoj";
			data[2][2]="R";
		
			
	
		   return data;
			
		}
		
		@Test(dataProvider="SetValues")
		public void CrLead(String companyName,String firstName,String lastName) throws InterruptedException {
			
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
			driver.findElement(By.name("submitButton")).click();

		}

	}



