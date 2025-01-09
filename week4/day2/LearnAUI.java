package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class LearnAUI {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// Mouse hover on Men's Fashion
        WebElement mensFashion  = driver.findElement(By.xpath("//span[contains(text(),'Men')]"));
        Actions act = new Actions(driver);
        act.moveToElement(mensFashion).perform();
        Thread.sleep(5000);
        
        // Click on Shirts
        driver.findElement(By.xpath("//span[text()='Shirts']")).click();
        Thread.sleep(5000);

        // Mouse hover on the first product
        WebElement firstProduct = driver.findElement(By.xpath("//img[contains(@class,'image')]"));
        act.moveToElement(firstProduct).perform();
        Thread.sleep(5000);
        
        // Click on Quick View
        driver.findElement(By.xpath("//div[contains(text(),'Quick View')]")).click();
        Thread.sleep(5000);

        // Take a screenshot
        File srcFile=driver.getScreenshotAs(OutputType.FILE);
        File dstFile=new File("./Snapshot/image.png");
        FileUtils.copyFile(srcFile, dstFile);
        
        //close
        driver.quit();
    } 

}
