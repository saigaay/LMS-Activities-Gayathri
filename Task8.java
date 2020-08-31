package Project_LMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Task8 {
	WebDriver driver;
	@BeforeClass
	public void beforeClass() {
//		System.out.println("Before Class");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\GaminiNagaSaiGayathr\\Desktop\\software\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://alchemy.hguy.co/lms");
	}

	@Test
	public void testMethod() {
	  System.out.println("Activity 8");	
	 driver.findElement(By.xpath("//li[@id='menu-item-1506']/a")).click();
	driver.findElement(By.xpath("//*[@id='wpforms-8-field_0']")).sendKeys("G N S Gayathri");
	driver.findElement(By.xpath("//*[@id='wpforms-8-field_1']")).sendKeys("test@gmail.com");
	driver.findElement(By.xpath("//*[@id='wpforms-8-field_3']")).sendKeys("Test Activity-Subject");
	driver.findElement(By.xpath("//*[@id='wpforms-8-field_2']")).sendKeys("Test Activity-Message");
	driver.findElement(By.xpath("//*[@id='wpforms-submit-8']")).click();
	String msg=driver.findElement(By.xpath("//*[@id='wpforms-confirmation-8']/p")).getText();
	System.out.println("Confirmation msg is '"+msg+"'"); 
	}

	@AfterClass
	public void afterClass() {
//	  System.out.println("After class");
		driver.close();
	}
}
