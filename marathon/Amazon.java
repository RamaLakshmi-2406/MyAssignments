package marathon;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//title of the page
				String title = driver.getTitle();
				System.out.println("Title:"+title);
				
	   driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for boys",Keys.ENTER);		
		
	//Total Results
	   String text = driver.findElement(By.xpath("//h2[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal']")).getText();
	   System.out.println(" total number of bags:"+text);
	   
    //Select 2 Brands
    
	driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[4]")).click();
	driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[5]")).click();

        
      //New Arrivals
	String pp=driver.findElement(By.xpath("//span[text()='Form Plus Compact Formal Office Laptop Bag 15.6\"-17\", 2 Compartments, Luggage Trolley Sleeve, Front Pocket, Premium PU Fabric, Bags, Backpack for Men and Women, College Bag for Boys and Girls']")).getText();
	System.out.println("Product Name:"+ pp);
        
        
      //Book Price
	String amount =driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
	System.out.println("Price: "+amount);
	
	
	//Current URL
	String currentUrl = driver.getCurrentUrl();
	System.out.println("Current URL:"+currentUrl);
	 	    
	 	    Thread.sleep(3000);
	 	    driver.close();
	 	    
	}

}
