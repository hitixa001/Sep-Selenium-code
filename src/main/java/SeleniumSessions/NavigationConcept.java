package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationConcept {

	public static void main(String[] args) {
		
		//back and forward simulation on the browser
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhavin\\SeleniumServer\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://google.com");	
	System.out.println(driver.getTitle());
	
	driver.navigate().to("https://www.amazon.co.uk/");	
	System.out.println(driver.getTitle());
	
	driver.navigate().back();
	System.out.println(driver.getTitle());
	
	driver.navigate().forward();
	System.out.println(driver.getTitle());
	
	driver.navigate().back();
	System.out.println(driver.getTitle());
		
	//simple refresh the browser
	driver.navigate().refresh();

	}

}
