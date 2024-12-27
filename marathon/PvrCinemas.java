package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PvrCinemas {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.pvrcinemas.com/");
		
		driver.findElement(By.xpath("(//span[@class='cities-placed'])[2]")).click();
		driver.findElement(By.xpath("//span[@id='city']/input")).sendKeys("Chennai");
		driver.findElement(By.xpath("//ul[@id='city_list']/li")).click();
		
		//Quick Book
		driver.findElement(By.xpath("//span[@class='cinemas-inactive']")).click();
		//Cinema
		driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
		driver.findElement(By.xpath("//span[text()='PVR VR Chennai Anna Nagar']")).click();
		//Date
		driver.findElement(By.xpath("//span[text()='Tomorrow']")).click();
		//Movie Name
        driver.findElement(By.xpath("(//span[text()='ALANGU'])[2]")).click();
		//Time
		driver.findElement(By.xpath("//span[text()='10:30 PM']")).click();
		//Book
		driver.findElement(By.xpath("//button[@class='p-button p-component sc-dIUfKc iRVxoq bgColor filter-btn']/span")).click();
		
		driver.findElement(By.xpath("//button[@class='sc-iBPTVF eafRB reject-terms']")).click();
		
		driver.findElement(By.xpath("//span[@id='CL.CLASSIC|A:5']")).click();
		
		String seat = driver.findElement(By.xpath("//div[@class='select-seat-number']")).getText();
		
		System.out.println("Seat Number:"+seat);
		
		String total = driver.findElement(By.xpath("//div[@class='grand-prices']/h6")).getText();
		
		System.out.println("Grand Total:"+total);
		
		driver.findElement(By.xpath("//button[@class='sc-kfzCjt dzvwYk btn-proceeded']")).click();
		
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		
		driver.findElement(By.xpath("(//i[@class='pi pi-times'])[2]")).click();
		
		String title = driver.getTitle();
		
		System.out.println("Title:"+title);
		
		//Current URL
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL:"+currentUrl);
				
		Thread.sleep(5000);
		driver.close();
		

	}

}