package week3.day2;

import java.time.Duration;
import java.util.ArrayList;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDeal {


	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
		driver.findElement(By.name("keyword")).sendKeys("Shoes",Keys.ENTER);
		
		// Locate all shoe elements
        List<WebElement> totalShoes = driver.findElements(By.xpath("//div[contains(@class, 'product-tuple-listing')]"));
        int listSize = totalShoes.size();
        System.out.println("Number of shoes displayed: " + listSize);

        // Empty list to store prices
        List<Integer> getPrice = new ArrayList<Integer>();

        for (WebElement shoe : totalShoes) {
        	String text=shoe.getText();
            
        	String replaceAll = text.replaceAll("[Rs]", "");
        	System.out.println(replaceAll);

        int price = Integer.parseInt(replaceAll);
        getPrice.add(price);
        }
        System.out.println("List the Prices:"+getPrice);

        // Remove duplicates using TreeSet
        Set<Integer> uniquePrice = new TreeSet<Integer>(getPrice);
        int set_size=uniquePrice.size();

        // Check for duplicates
        if (set_size == uniquePrice.size()) {
            System.out.println("No duplicate prices.");
        } else {
            System.out.println("Duplicate prices found.");
        }

        // Print the first price value
        
        List<Integer> List = new ArrayList<Integer>(uniquePrice);
        System.out.println("First amount: " + List.get(0));
        // Close the browser
        driver.close();
    }
}
