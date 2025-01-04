package week3.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ListAssign5 {
public static void main(String[] args) throws InterruptedException {
	
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
	driver.get("https://www.ajio.com/");

	driver.findElement(By.name("searchVal")).sendKeys("Bags",Keys.ENTER);
	driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men'][1]")).click();

	String text = driver.findElement(By.xpath("//div[@class='length']")).getText();
	System.out.println("Total number of bags:"+text);
	   
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
    
    Thread.sleep(3000);
    driver.close();	   
	   
	   
	
	
	
	
}
}
