package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalPageLinks {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup(); // instead of .exe file
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.co.uk/");

		// all the elements which are available on the webPage they are available in the form of <WebElements> thats why we'have to write
		// webElements not any other DataTypes(String/Integer etc).
		//List is order based so it will store the value on the basis of indexing.
		List<WebElement> linksList = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links: " +linksList.size());

		for (int i = 0; i < linksList.size(); i++) {
			String linksText = linksList.get(i).getText();
				System.out.println(linksText);
		
			

			}

	}

}
	

