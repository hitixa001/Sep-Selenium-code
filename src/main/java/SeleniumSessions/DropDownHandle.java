package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandle {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://facebook.com/");

		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));

		Select select = new Select(day);
//		select.selectByVisibleText("15");
//		select.selectByIndex(10);	//this is less preferable approach.(because indexing values might change in the future if new values are
		// added or deleted)
//		
//		Select select1 = new Select(month);
//		select1.selectByVisibleText("May");
//		
//		Select select2 = new Select(year);
//		select2.selectByVisibleText("2015");

//		selectValue(day, "20");
//		selectValue(month, "Jul");
//		selectValue(year, "2011");

	}

	// generic method for selecting elements from the drop-down
	public static void selectValue(WebElement element, String value) {

		Select select = new Select(element);
		select.selectByVisibleText(value);

	}

}
