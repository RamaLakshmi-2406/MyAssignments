package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebtable1 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/table.xhtml");
		
		
		String text = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr/td")).getText();

		System.out.println("Print the 1st value :"+text);
		
		//print 2row 4col
		String particularValue = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr[2]/td[4]")).getText();
		System.out.println(" 2nd row and 4th col :"+particularValue);
		
		//total number of rows
		List<WebElement> rowValue = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr"));
		int rowCount = rowValue.size();
		System.out.println("row count : "+rowCount);
		
		//total number column 
		List<WebElement> colValue = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr[1]/td"));
		int colCount = colValue.size();
		System.out.println("Column count : "+colCount);
		
		
		
		//print all the value from the table
		
		for (int i = 1; i <=rowCount; i++) {
			
			for (int j = 1; j <=colCount; j++) {
				
				String allValue = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr["+i+"]/td["+j+"]")).getText();
		
			System.out.println(allValue);
			
			}
			
		}
		

	}

}
