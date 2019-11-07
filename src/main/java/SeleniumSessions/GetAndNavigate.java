package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAndNavigate {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhavin\\SeleniumServer\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.get() & driver.navigate().to() both are use to launch the url but there is one main difference between these 2.
		//1.driver.get() will always wait for the page to be fully loaded then only Selenium will perform further actions.
		//2.driver.navigate().to() will not wait till page is fully loaded as soon is it see the title it will perform the actions.
		
		//this is the recommended method for real time project.
		//driver.get("https://www.amazon.co.uk/");	
		//System.out.println(driver.getTitle());
		
		driver.navigate().to("https://www.amazon.co.uk/");	
		System.out.println(driver.getTitle());
	}

}
