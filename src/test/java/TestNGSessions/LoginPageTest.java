package TestNGSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageTest {

	WebDriver driver;
	SoftAssert softAssert;

	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://app.hubspot.com/login");
		softAssert = new SoftAssert();

	}

	@Test(priority = 1)
	public void loginPageTitleTest() {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.titleContains("HubSpot Login"));
		String title = driver.getTitle();
		System.out.println("Login Page title is: " + title);
		Assert.assertEquals(title, "HubSpot Login","login page title mis-matched...");
	}
	
	@Test(priority = 2)
	public void signUpLinkTest() {
		boolean flag = driver.findElement(By.linkText("Sign up")).isDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority = 3)
	public void loginTest() {
		driver.findElement(By.id("username")).sendKeys("naveenanimation20@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Test@12345");
		driver.findElement(By.id("loginBtn")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.className("private-page__title")));
		
		softAssert.assertTrue(driver.findElement(By.className("private-page__title")).isDisplayed(),"header is not present");
		String header =driver.findElement(By.className("private-page__title")).getText();
		System.out.println("home page header is: "+header);
		softAssert.assertEquals(header, "Sales dashboard","wrong header text...");
		
		String title = driver.getTitle();
		System.out.println("home page title is: "+title);
		softAssert.assertEquals(title, "Reports Dashboard","mis-matched header text...");
		
		softAssert.assertAll();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
