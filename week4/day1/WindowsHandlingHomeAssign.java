package week4.day1;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandlingHomeAssign {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Merge Contacts")).click();
		
		
		// Click widget for "From Contact"
        driver.findElement(By.xpath("//img[@alt='Lookup']")).click();

        // Switch to new window
        String parentWindow = driver.getWindowHandle();
        for (String windowHandle : driver.getWindowHandles()) {
            driver.switchTo().window(windowHandle);
        }

        // Click on the first resulting contact
        driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();

        // Switch back to parent window
        driver.switchTo().window(parentWindow);

        // Click widget for "To Contacts
        driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();

        // Switch to new window
        for (String windowHandle : driver.getWindowHandles()) {
            driver.switchTo().window(windowHandle);
        }

        // Click on the second resulting contact
        driver.findElement(By.xpath("(//a[@class='linktext'])[6]")).click();

        // Switch back to parent window
        driver.switchTo().window(parentWindow);
		
		
		// Merge contacts
        driver.findElement(By.linkText("Merge")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();

        // Verify title
        if (driver.getTitle().equals("View Contacts")) {
            System.out.println("Title verified: " + driver.getTitle());
        } else {
            System.out.println("Title verification failed.");
        }
        driver.quit();
    }
		
	}  
        

	


