package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cust_cssSelector {

	public static void main(String[] args) throws InterruptedException {
	
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		
		Thread.sleep(5000);
		
		
		//cssSelector are slightly faster in performance in compare to xpath.
		
		//ID:
		//input#username
		//#username
		//input[id='username']
		//input[id='username'][type='email']
		//button[id='loginBtn']
		
		
		//CLASS:
		//.form-control.private-form__control.login-email
		//.login-email
		//input.form-control.private-form__control.login-email
		//input.login-email
		//button.login-submit
		//button.uiButton private-button--primary m-bottom-4 login-submit private-button private-button--default disabled private-button--disabled private-button--non-link
		
		//TEXT:
		//input[id^='username']	//^means starting with
		//input[id^='user']
		//input[id$='username']	//$ means ending with
		//input[id$='name']
		//input[id*='username']	//* means contains value
		//input[id*='name']
		
		//div>input[id='username']	//> is for parent tag
		//div.private-form__input-wrapper>input#username
		
		
		
		
		
		

	}

}
