package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Snapdeal {

	public static void main(String[] args) throws InterruptedException, IOException {
		
	
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// Mouse hover on Men's Fashion
        WebElement mensFashion  = driver.findElement(By.xpath("//span[@class='catText'][1]"));
        Actions act = new Actions(driver);
        act.moveToElement(mensFashion).perform();
        Thread.sleep(5000);
        
        //Click Sports Shoe
        driver.findElement(By.xpath("//span[text()='Sports Shoes']")).click();
        Thread.sleep(5000);
        
        //Count of sports shoe
        String sc = driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
        System.out.println("Total count of sports shoe:"+sc);
        Thread.sleep(5000);
        
        //Click on Training Shoes
        driver.findElement(By.xpath("//div[contains(text(),'Training Shoes')]")).click();
        Thread.sleep(5000);
        
       //Sort the products by "Low to High"
        WebElement sortDropdown1 = driver.findElement(By.xpath("//div[@class='sort-label']"));
        Select obj=new Select(sortDropdown1);
		obj.selectByIndex(1);
		Thread.sleep(3000);
        
		//Verify if the items are sorted correctly
        List<WebElement> prices = driver.findElements(By.xpath("//span[@class='lfloat product-price']"));
        boolean isSorted = true;
        for (int i = 1; i < prices.size(); i++) {
            int price1 = Integer.parseInt(prices.get(i - 1).getText().replace("Rs. ", "").replace(",", ""));
            int price2 = Integer.parseInt(prices.get(i).getText().replace("Rs. ", "").replace(",", ""));
            if (price1 > price2) {
                isSorted = false;
                break;
            }
        }
        System.out.println("Items sorted by 'Low to High': " + isSorted);
        
        // Step 8: Select any price range (500-700)
        WebElement priceRangeFilter = driver.findElement(By.xpath("//div[@data-id='Price']//span[text()='500 - 700']"));
        priceRangeFilter.click();

        // Step 9: Filter by any colour (Example: Black)
        WebElement blackColorFilter = driver.findElement(By.xpath("//label[@for='Black']//span"));
        blackColorFilter.click();

        // Step 10: Verify all the applied filters
        WebElement appliedFilters = driver.findElement(By.xpath("//div[@class='filters']"));
        System.out.println("Applied filters: " + appliedFilters.getText());

        // Step 11: Mouse hover on the first resulting "Training Shoes"
        WebElement firstTrainingShoe = driver.findElement(By.xpath("//div[@class='product-tuple-listing'][1]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(firstTrainingShoe).perform();

        // Step 12: Click the "Quick View" button
        WebElement quickViewButton = driver.findElement(By.xpath("//a[text()='Quick View']"));
        quickViewButton.click();
        
        // Step 13: Print the cost and the discount percentage
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement cost = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='pdpPrice']")));
        WebElement discount = driver.findElement(By.xpath("//span[@class='discount']"));
        System.out.println("Cost: " + cost.getText());
        System.out.println("Discount: " + discount.getText());

        // Step 14: Take a snapshot of the shoes (screenshot)
        WebElement shoesImage = driver.findElement(By.xpath("//img[@class='pdp-product-image']"));
        File screenshot = shoesImage.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("shoes_screenshot.png"));
        
        //Close
		driver.quit();
		Thread.sleep(3000);
		

	}

}
