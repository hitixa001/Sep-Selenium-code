package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalImageCount {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();	//instead of .exe file 
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.co.uk/");
		
		List<WebElement> imgTags = driver.findElements(By.tagName("img"));
		System.out.println(imgTags.size());
		
		for(int i =0; i<imgTags.size(); i++) {
			String imgURL = imgTags.get(i).getAttribute("src");
			System.out.println(imgURL);
		}

	}

}
