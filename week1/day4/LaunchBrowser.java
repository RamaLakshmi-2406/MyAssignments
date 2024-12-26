package week1.day4;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		//open the browser
		ChromeDriver driver = new ChromeDriver();
		
		//Load the URL
		driver.get("https://www.facebook.com");
		
		//Maximize the screen
		driver.manage().window().maximize();
		
		//wait time
		Thread.sleep(5000);
		
		//close browser
		driver.close();

	}

}
