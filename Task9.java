package Project_LMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Task9 {
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
	  System.out.println("Activity 9");	
	 driver.findElement(By.xpath("//li[@id='menu-item-1508']/a")).click();
	 driver.findElement(By.xpath("//*[@id='post-69']//*[@class='ld_course_grid_button']/a")).click();
	 String title=driver.getTitle();
	 System.out.println(title);
	 Assert.assertTrue(title.equals("Social Media Marketing – Alchemy LMS"), "Title doesn't matches");
	
	}

	@AfterClass
	public void afterClass() {
//	  System.out.println("After class");
		driver.close();
	}
}
