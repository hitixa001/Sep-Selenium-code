package Assignments;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class GenericMethod {
	
	
	/**
	 * this is the generic method to get all the text from the right-click element from the web-page.
	 * @param driver
	 * @param element
	 * @param locator
	 * @return
	 */

public static ArrayList<String> getRightClickText(WebDriver driver,WebElement element, String locator) {
		
		Actions action = new Actions(driver);
		action.contextClick(element).build().perform();
		List<WebElement> allText = driver.findElements(By.xpath(locator));
		
		ArrayList<String> ar = new ArrayList<String>();
		for (int i = 0; i < allText.size(); i++) {
			String Text = allText.get(i).getText();
			 System.out.println(Text);
			// ar.add(Text);
			 
			}

		return ar;
		
	}

}
