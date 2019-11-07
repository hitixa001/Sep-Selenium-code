package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandle {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		
//		WebElement frame = driver.findElement(By.name("main"));
//		driver.switchTo().frame(frame);	
		
//		driver.switchTo().frame("main");	//by passing name directly
		driver.switchTo().frame(2);		//by passing id directly
		
		
		String text = driver.findElement(By.cssSelector("body > h2")).getText();
		System.out.println(text);
		
		driver.switchTo().defaultContent();	//this will come back to main web page from frame.
		
		driver.switchTo().parentFrame();	//is used for nested frame on the web page.		
		
		//to get the total number of frames available on the web-page.
		List<WebElement> totalFrames= driver.findElements(By.tagName("frame"));
		System.out.println(totalFrames.size());
		

	}

}
