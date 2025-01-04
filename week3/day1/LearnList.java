package week3.day1;

import java.time.Duration;


import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnList {

 
    	public static void main(String[] args) {
    		ChromeDriver driver=new ChromeDriver();
    		driver.manage().window().maximize();
    		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    		driver.get("https://www.facebook.com");
    	
    		//find total a tag
    		List<WebElement> totalValue=driver.findElements(By.tagName("a"));
            
    		int size=totalValue.size();
            System.out.println("Total <a> tag:"+size);
            
            for(int i=0;i<totalValue.size();i++)
            System.out.println(totalValue.get(i).getText());
            
    	
            
      
    	}

    	
    	}