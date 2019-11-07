package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopUpHandling {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();	
		WebDriver driver = new ChromeDriver();
		driver.get("https://mypage.rediff.com/login/dologin");
		driver.findElement(By.id("btn_go")).click();
		
		//Alert is only and only responsible for JS PopUp not for any there random PopUp i.e... advertisements, window PopUp
		Alert alert = driver.switchTo().alert();	//switch to the alert page
		
		String msg = alert.getText();
		System.out.println(msg);
		if(msg.equals("Please enter a valid email")) {
			System.out.println("correct error msg");
		}else {
			System.out.println("wrong error msg");
		}
		
		alert.accept();	//to click on OK button
		alert.dismiss();//to cancel the alert 
		
	}

}
