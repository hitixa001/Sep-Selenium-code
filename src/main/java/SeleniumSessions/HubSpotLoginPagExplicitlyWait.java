package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HubSpotLoginPagExplicitlyWait {

	static WebDriver driver;

	public static void main(String[] args) {

		Util util = new Util(driver);

		util.openBrowser();
		util.getURL("https://app.hubspot.com/login");

		By username = By.id("username");
		By pwd = By.id("password");
		By loginBTN = By.id("loginBtn");

		String title = util.waitForTitlePresent("HubSpot", 5);
		System.out.println(title);

		util.waitForElementPresent(username, 15);
		util.doSendKeys(username, "test@gmail.com");
		util.doSendKeys(pwd, "test123");
		util.doClick(loginBTN);
		util.doQuit();

	}
}

//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://app.hubspot.com/login");
//
//		WebDriverWait wait = new WebDriverWait(driver, 20);
//		wait.until(ExpectedConditions.titleContains("HubSpot"));
//
//		System.out.println(driver.getTitle());
//
//		By username = By.id("username");
//
//		// excplicitlyWait is not global wait
//		// most preferable wait in terms of real-time project
//		WebDriverWait wait1 = new WebDriverWait(driver, 20);
//		wait1.until(ExpectedConditions.presenceOfElementLocated(username));
//
//		WebElement element = driver.findElement(username);
//		element.sendKeys("test@gmail.com");
