package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerConcept {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();	//instead of .exe file 
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.co.uk/");
		
		
	}

}
