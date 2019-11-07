package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureTotalTextFields {

	public static void main(String[] args) {
			
		WebDriverManager.chromedriver().setup();	//instead of .exe file 
		WebDriver driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		//List<WebElement> inputTags = driver.findElements(By.tagName("input"));
	//	System.out.println(inputTags.size());

		List<WebElement> inputTags = driver.findElements(By.xpath("//input[@type = 'text']"));
		System.out.println(inputTags.size());
		for (int i = 0; i<inputTags.size(); i++) {
			inputTags.get(i).sendKeys("aaaa");
			
		}
	}

}
