package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JQueryDropDownHandle {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.id("justAnInputBox")).click();

		// selectChoiceValues(driver, "choice 2", "choice 2 3", "choice 6 2 2");
		// selectChoiceValues(driver, "choice 6");

		selectChoiceValues(driver, "all");

	}

	
	
	/**
	 * 
	 * @param driver
	 * @param value
	 */
	public static void selectChoiceValues(WebDriver driver, String... value) {

		List<WebElement> choiceBox = driver.findElements(
				By.xpath("//div[@class='comboTreeDropDownContainer']//ul//li//span[@class='comboTreeItemTitle']"));

		//here '!'(not) will make condition true if its false and false if its true.
		if (!value[0].equalsIgnoreCase("all")) {

			for (int i = 0; i < choiceBox.size(); i++) {
				System.out.println(choiceBox.get(i).getText());
				String text = choiceBox.get(i).getText();

				for (int j = 0; j < value.length; j++) {
					if (text.equals(value[j])) {
						choiceBox.get(i).click();
						break;
					}

				}
			}
		}

		// logic for selecting all the values from the drop-down.
		else {
			try {
			for (int all = 0; all < choiceBox.size(); all++) {
				choiceBox.get(all).click();
			}
			}catch(Exception e) {
				
			}
		}

	}

}
