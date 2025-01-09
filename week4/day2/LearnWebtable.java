package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebtable {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://finance.yahoo.com/?guccounter=1");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//span[text()='More']")).click();
		Thread.sleep(5000);
		
		// Click on "Crypto" tab
        WebElement cryptoTab = driver.findElement(By.linkText("Crypto"));
        cryptoTab.click();
        Thread.sleep(3000);

     // Locate the table containing cryptocurrencies
        WebElement table = driver.findElement(By.xpath("//table"));

        // Locate all rows of the table (excluding the header)
        List<WebElement> rows = table.findElements(By.xpath(".//tr[td]"));

        // Loop through each row and print the first column (cryptocurrency name)
        for (WebElement row : rows) {
            // Find the first column (td) in the row
            WebElement firstColumn = row.findElement(By.xpath(".//td[1]"));
            System.out.println(firstColumn.getText());
        }
        }
        
    } 

        

	


