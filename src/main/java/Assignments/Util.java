package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Util {
	WebDriver driver;

	public Util(WebDriver driver) {
		this.driver = driver;
	}

	public void openBrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public void getURL(String url) {

		driver.get(url);
		driver.manage().window().maximize();
	}

	public void getElements(By locator) {

		Actions action = new Actions(driver);
		WebElement element = driver.findElement(locator);
		action.moveToElement(element).build().perform();
	}

	public void doClick(By locator) {
		driver.findElement(locator).click();
	}

	public void waitForTheElementToPresents(By locator, int timeOut) {

		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
	}
}