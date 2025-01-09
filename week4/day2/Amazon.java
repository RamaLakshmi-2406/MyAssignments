package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung s23",Keys.ENTER);

		 String firstprod = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
		 System.out.println("Price of the first product:"+firstprod);
		 Thread.sleep(3000);
		 
		 WebElement rr = driver.findElement(By.xpath("//span[@class='a-size-base s-underline-text']"));
		 String ratings = rr.getText();
		 System.out.println("Customer Ratings:"+ratings);
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//span[text()='Samsung Galaxy S23 FE 5G (Graphite 128 GB Storage) (8 GB RAM)']")).click();
		 Thread.sleep(3000);
		 
		 
		 // Take a screenshot
	        File srcFile=driver.getScreenshotAs(OutputType.FILE);
	        File dstFile=new File("./Snapshot/image1.png");
	        FileUtils.copyFile(srcFile, dstFile);
	        
	        
	    //Add to cart
	        driver.findElement(By.id("a-autoid-1-announce")).click();
	        
	    //Cart Total
	        WebElement ct = driver.findElement(By.xpath("//h2[@class='a-size-base a-color-price a-text-bold']"));
	        String CartTotal = ct.getText();
	        System.out.println("Cart Total:"+CartTotal);
	        
	     // Verify if the carttotal matches the product price
            if (CartTotal.contains(firstprod)) {
                System.out.println("Subtotal is correct.");
            } else {
                System.out.println("Subtotal is incorrect.");
            }
            
          //Close the browser
            Thread.sleep(5000);
            driver.quit();
		 
	}

}
