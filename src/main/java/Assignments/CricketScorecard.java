package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CricketScorecard {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.espncricinfo.com/series/19430/scorecard/1187009/"
				+ "india-vs-south-africa-3rd-test-icc-world-test-championship-2019-2021");
		
//		List<WebElement> score = driver.findElements(By.xpath("//a[text()='RG Sharma']//parent::div//"
//				+ "following-sibling::div[@class='cell runs']"));
//		//System.out.println(score.size());
//		
//		for(int i=0; i<score.size(); i++) {
//			
//			System.out.println(score.get(i).getText());
//		}
		
		getPlayerScorcard(driver, "RG Sharma");

	}
	
	public static void getPlayerScorcard(WebDriver driver, String playerName) {
		List<WebElement> score = driver.findElements(By.xpath("//a[text()='"+playerName+"']//parent::div//"
				+ "following-sibling::div[@class='cell runs']"));
		for(int i=0; i<score.size(); i++) {
			System.out.println(score.get(i).getText());
		}
		
		
		
		
	}

}
