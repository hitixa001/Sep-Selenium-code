package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HubSpotLoginPageImplicitlyWait {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		Util util = new Util(driver);

		util.openBrowser();
		util.getURL("https://app.hubspot.com/login");
	
		By username = By.id("username");
		By pwd = By.id("password");
		By loginBTN = By.id("loginBtn");

		util.doSendKeys(username, "test@gmail.com");
		util.doSendKeys(pwd, "test123");
		util.doClick(loginBTN);
		util.doQuit();

	}

}
