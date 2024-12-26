package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		
		//title of the page
		String title = driver.getTitle();
		System.out.println("Title -"+title);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("book",Keys.ENTER);
	
		
		String price = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
		System.out.println("Price of the book - "+price);
	
		
		
		String replaceAll = price.replaceAll(",","");
		System.out.println("Replace value - "+replaceAll);
		
		//string value into integer
		int parseInt = Integer.parseInt(replaceAll);
		System.out.println("Price of the book - "+parseInt);
		
		//get current url
		String currentUrl = driver.getCurrentUrl();
	    System.out.println("Print current URL -"+currentUrl);	
	    
	    Thread.sleep(3000);
	    driver.close();
	}

}
