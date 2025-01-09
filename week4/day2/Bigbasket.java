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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Bigbasket {

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bigbasket.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// Step 2: Click on "Shop by Category"
        driver.findElement(By.xpath("//button[@id='headlessui-menu-button-:R5bab6:']")).click();
        Thread.sleep(3000);

        // Step 3: Mouse over "Foodgrains, Oil & Masala"
        WebElement foodgrainsOilMasala = driver.findElement(By.linkText("Foodgrains, Oil & Masala"));
        Actions actions = new Actions(driver);
        actions.moveToElement(foodgrainsOilMasala).perform();
        Thread.sleep(3000);

        // Step 4: Mouse over "Rice & Rice Products"
        WebElement riceRiceProducts = driver.findElement(By.xpath("//a[text()='Rice & Rice Products']"));
        actions.moveToElement(riceRiceProducts).perform();
        Thread.sleep(3000);

        // Step 5: Click on "Boiled & Steam Rice"
        driver.findElement(By.xpath("//a[text()='Boiled & Steam Rice']")).click();
        Thread.sleep(3000);
        

        // Step 6: Filter the results by selecting the brand "bb Royal"
      
        
        
        // Step 7: Click on "Tamil Ponni Boiled Rice"
       driver.findElement(By.xpath("//h3[text()='Tamil Ponni Boiled Rice - 12 - 17 Months Old']")).click();
       Thread.sleep(3000);
      

        // Step 8: Select the 5 Kg bag
       driver.findElement(By.xpath("//span[text()='5 Kg']")).click();
       Thread.sleep(3000);
       

        // Step 9: Check and note the price of the rice
        WebElement price = driver.findElement(By.xpath("//div[text()='MRP ₹375']"));
        System.out.println("Price of the rice: " + price.getText());
        Thread.sleep(3000);

        // Step 10: Click "Add" to add the bag to your cart
        driver.findElement(By.xpath("//button[text()='Add']")).click();
        Thread.sleep(3000);

        // Step 11: Verify the success message confirming the item was added to the cart
        WebElement element = driver.findElement((By.xpath("//div[@class='toast-message']")));
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement successMessage = wait1.until(ExpectedConditions.visibilityOf(element));
        System.out.println("Success message: " + successMessage.getText());
        Thread.sleep(3000);

        // Step 12: Take a snapshot of the current page
        File srcFile=driver.getScreenshotAs(OutputType.FILE);
        File dstFile=new File("./Snapshot/image2.png");
        FileUtils.copyFile(srcFile, dstFile);
        Thread.sleep(3000);

        // Step 13: Close the current window
        driver.quit();
	}
        

	}


