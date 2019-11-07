package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownWithoutSelect {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://facebook.com/");
		
//		List<WebElement> dayList = driver.findElements(By.xpath("//select[@id = 'day']/option"));
//		System.out.println(dayList.size());
//		for(int i = 0; i<dayList.size(); i++) {
//			String text = dayList.get(i).getText();
//			System.out.println(text);
//				if(text.equals("25")) {
//					dayList.get(i).click();
//					break;
//				}
		
		String day = "//select[@id='day']/option";
		String month = "//select[@id='month']/option";
		String year = "//select[@id='year']/option";
		DropDownUtil.selectDropDownWithoutSelect(driver, day, "25");
		DropDownUtil.selectDropDownWithoutSelect(driver, month, "May");
		DropDownUtil.selectDropDownWithoutSelect(driver, year, "2000");
		

	}

}
