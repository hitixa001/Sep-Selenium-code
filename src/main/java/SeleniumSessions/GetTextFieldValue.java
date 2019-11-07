package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTextFieldValue {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();	//instead of .exe file 
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.id("login1")).sendKeys("test123");
		
		//for text field in HTML "value" attribute is there always.
		String value = driver.findElement(By.id("login1")).getAttribute("value");	//test123
		System.out.println(value);
		
	}

}
