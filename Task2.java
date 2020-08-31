package Project_LMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Task2 {
  
	
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
	  System.out.println("Activity 2");	
	    String heading=driver.findElement(By.className("uagb-ifb-title")).getText();
		System.out.println(heading);
		Assert.assertTrue(heading.equals("Learn from Industry Experts"), "Heading doesn't macthes");
	}

	@AfterClass
	public void afterClass() {
//	  System.out.println("After class");
		driver.close();
	}
}
