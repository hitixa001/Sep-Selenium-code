package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		//Intermediator server driver executables --> chromeDriver.exe, gecoDriver.exe, safariDriver.exe etc
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhavin\\SeleniumServer\\chromedriver_win32\\chromedriver.exe");
		
		//WebDriver is an Interface
		//reference--> driver   		//object--> new ChromeDriver();
		//this concept is called--> Top-Casting .
		WebDriver driver = new ChromeDriver();	//launch/open the browser
		driver.get("https://google.com");	//"www" will be taken automatically so it does not matter whether you write it or not but 
		//"http: or https: is must to write"
		String s = driver.getTitle();	//getTitle method is define in WebDriver interface but method body is given under the chromeDriver
		System.out.println(s);
//		System.out.println(driver.getTitle());
		
		//validation point--- to verify the page title is correct or not-- most important part of automation testing.
		if(s.equals("Google")) {
			System.out.println("page title is correct");
		}else
			
		{
			System.out.println("Wrong page title");
		}
		
		System.out.println(driver.getCurrentUrl());	//to get the current URL.
		//System.out.println(driver.getPageSource());	//generally we don't use it in real life
		
		driver.quit();	//sessionID will be null
		//driver.close();		//sessionID will be expired/invalid
		//System.out.println(driver.getTitle());	//--this msg is coming from server NOT coming from browser--- 
										//org.openqa.selenium.NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
		
		
	}

}
