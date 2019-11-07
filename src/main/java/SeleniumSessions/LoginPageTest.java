package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		
		
		//page objects:
		By username = By.id("username");
		By pwd = By.id("password");
		By loginBTN = By.id("loginBtn");
		
		
		Util util = new Util(driver);
		String title = util.waitForTitlePresent("HubSpot", 5);
		System.out.println(title);
		
		
		util.waitForElementPresent(username, 15);
		
//		util.getElement(username).sendKeys("test@gmail.com");
//		util.getElement(pwd).sendKeys("test123");
//		util.getElement(loginBTN).click();
	
		//using generic method that we've created
		util.doSendKeys(username, "test@gmail.com");
		util.doSendKeys(pwd, "test123");
		util.doClick(loginBTN);
		util.doQuit();
	
	}

}
