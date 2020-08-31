package Project_LMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Task7 {
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
	  System.out.println("Activity 7");	
	 driver.findElement(By.xpath("//li[@id='menu-item-1508']/a")).click();
	 System.out.println("Total number of courses are  "+driver.findElements(By.xpath("//*[@id='ld_course_list']/div/div/div")).size());
	 
	
	}

	@AfterClass
	public void afterClass() {
//	  System.out.println("After class");
		driver.close();
	}
}
