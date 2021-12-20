package k_automationpractice_project;


import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class K_Practice_Automation {

	public static WebDriver driver;
	public static ChromeOptions options = new ChromeOptions();
	public static WebDriverWait wait;
	public static SoftAssert softassert = new SoftAssert();
	
	@BeforeTest
	public void initialize() {
	
			WebDriverManager.chromedriver().setup();
			options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
			options.addArguments("--start-maximized");
			options.addArguments("--incognito");
			driver = new ChromeDriver(options);
			driver.get("http://automationpractice.com/index.php");
	}
	
	@Test
	public void clickonSignInLink() {
		
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Sign in")));
		driver.findElement(By.linkText("Sig in")).click();

	}
	
	@AfterTest
		public void tearDown() {
//		driver.quit();
		
	}
			
}
