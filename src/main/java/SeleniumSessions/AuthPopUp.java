package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthPopUp {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");		
		
		//this is the best practice to do.
		String userName = "admin";
		String pwd = "admin";	
		driver.get("https://"+userName+":"+pwd+"@the-internet.herokuapp.com/basic_auth");
		
		

	}

}
