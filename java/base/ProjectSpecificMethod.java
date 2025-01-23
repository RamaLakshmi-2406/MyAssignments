package base;

import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificMethod {


	//Global declare
	public static ChromeDriver driver;

	@BeforeMethod
	public void precondition() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	}
	
	
	
@AfterMethod

public void postCondition() {
	driver.close();
}
}

