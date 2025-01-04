package week3.day3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		
		WebElement frameElement = driver.findElement(By.id("iframeResult"));
        driver.switchTo().frame(frameElement);
        
        
		//click on try it
		driver.findElement(By.xpath("(//button[text()='Try it'])")).click();
		
		// Handle the alert
        Alert alert = driver.switchTo().alert();
        alert.accept();
        
        //Get the text
        String message = driver.findElement(By.id("demo")).getText();
		System.out.println(message);
        
		//Verify
		if(message.contains("You pressed OK")) {
            System.out.println("Message is verified.");
        } 
		else 
		{
            System.out.println("Message is not verified.");
        } 
        
		driver.close();
    }  
}

		
		
	


