package Project_LMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Task6 {
	WebDriver driver;
	@BeforeClass
	public void beforeClass() {
//		System.out.println("Before Class");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\GaminiNagaSaiGayathr\\Desktop\\software\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://alchemy.hguy.co/lms");
	}

	@Test
	@Parameters({ "sUsername", "sPassword" })
	public void testMethod(String sUsername, String sPassword) {
	  System.out.println("Activity 6");	
	 driver.findElement(By.xpath("//li[@id='menu-item-1507']/a")).click();
		String myacc=driver.getTitle();
		System.out.println(myacc);
		Assert.assertTrue(myacc.equals("My Account – Alchemy LMS"), "title doesn't macthes");
		driver.findElement(By.className("learndash-wrapper")).click();
		driver.findElement(By.id("user_login")).sendKeys(sUsername);
		driver.findElement(By.id("user_pass")).sendKeys(sPassword);
		driver.findElement(By.id("wp-submit")).click();
		driver.findElement(By.xpath("//*[@id='uagb-infobox-d9258720-3455-443e-b618-b57211636d84']//h1")).isDisplayed();	//verify MyAccount name exists
		driver.findElement(By.xpath("//*[@id='wp-admin-bar-my-account']//a")).isDisplayed();//Verify user name exists ontop right corner
		System.out.println("Successfully Logged In");
	}

	@AfterClass
	public void afterClass() {
//	  System.out.println("After class");
		driver.close();
	}
}
