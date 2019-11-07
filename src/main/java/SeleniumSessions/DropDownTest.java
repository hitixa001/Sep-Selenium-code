package SeleniumSessions;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownTest {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://facebook.com/");
		
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		String date = "10-Dec-2010";
		String[]  dateValue = date.split("-");	
		DropDownUtil.selectValue(day, dateValue[0]);
		DropDownUtil.selectValue(month, dateValue[1]);
		DropDownUtil.selectValue(year, dateValue[2]);
		
		ArrayList<String> dayList = 	DropDownUtil.getDropdownValues(day);
		System.out.println(dayList);
		
		ArrayList<String> monthList = 	DropDownUtil.getDropdownValues(month);
		System.out.println(monthList);
		
		ArrayList<String> yearList = 	DropDownUtil.getDropdownValues(year);
		System.out.println(yearList);
		
		
		

	}

}
