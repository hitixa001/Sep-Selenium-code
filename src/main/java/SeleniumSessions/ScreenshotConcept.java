package SeleniumSessions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotConcept {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);

		takePageScreenshot(driver, "loginPage");

//		WebElement username = driver.findElement(By.id("username"));
//		WebElement pwd = driver.findElement(By.id("password"));
//		WebElement loginBTN = driver.findElement(By.id("loginBtn"));
//		username.sendKeys("teast@gmail.com");
//		pwd.sendKeys("test123");

//		takeElementScreenshot(username, "userName");
//		takeElementScreenshot(pwd, "pwd");
//		takeElementScreenshot(loginBTN, "loginBTN");

		driver.quit();

	}

	public static void takePageScreenshot(WebDriver driver, String fileName) {

		File SrcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(SrcFile, new File("./target/ScreenShots/" + fileName + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	
	//this is only available in Selenium4.
	public static void takeElementScreenshot(WebElement element, String fileName) {

		File SrcFile = ((TakesScreenshot) element).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(SrcFile, new File("./target/ScreenShots/" + fileName + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
