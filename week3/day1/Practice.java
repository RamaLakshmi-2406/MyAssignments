package week3.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
public static void main(String[] args) {
	
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	driver.get("https://www.ajio.com");
	
	WebElement searchBox = driver.findElement(By.xpath("//input[@placeholder='Search Ajio']"));
    searchBox.sendKeys("bags");
    searchBox.submit();  // Press enter
    
    // Wait for search results to load
    try {
        Thread.sleep(3000); // Wait for 3 seconds
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    
    // Click on "Men" under the "Gender" filter using XPath
    WebElement menFilter = driver.findElement(By.xpath("//label[@for='Men']"));
    menFilter.click();
    
    // Wait for filter to apply
    try {
        Thread.sleep(2000); // Wait for 2 seconds
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    
    // Click on "Fashion Bags" under the "Category" filter using XPath
    WebElement fashionBagsFilter = driver.findElement(By.xpath("//label[text()='Fashion Bags']"));
    fashionBagsFilter.click();
    
    // Wait for filter to apply
    try {
        Thread.sleep(3000); // Wait for 3 seconds
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    
    // Get the count of items found (XPath is used to find the item count)
    WebElement itemCount = driver.findElement(By.xpath("//div[@class='filter-summary']//span"));
    System.out.println("Items found: " + itemCount.getText());
    
    // Get the list of brands using XPath
    List<WebElement> brandElements = driver.findElements(By.xpath("//div[@class='brand-name']"));
    System.out.print("Brands: ");
    for (WebElement brand : brandElements) {
        System.out.print(brand.getText() + " ");
    }
    System.out.println();
    
    // Get the list of product names (Bag Names) using XPath
    List<WebElement> productElements = driver.findElements(By.xpath("//a[@itemprop='url']//span"));
    System.out.println("Bag Names: ");
    for (WebElement product : productElements) {
        System.out.println(product.getText());
    }
    
    // Close the browser
    driver.quit();
}
}

