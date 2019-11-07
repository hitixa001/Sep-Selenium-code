package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhavin\\SeleniumServer\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");		
		Thread.sleep(5000);
		
		//total 8 Locators are there:
		//1----> By.id----- 1st priority is always given to by.id
		//this is the most suitable approach for the real time project point of view.
//		WebElement email = driver.findElement(By.id("username"));
//		email.sendKeys("test@gmail.com");
//		
//		WebElement pwd = driver.findElement(By.id("password"));
//		pwd.sendKeys("test123");
		
		//for the practice point of view this is fine.
//		driver.findElement(By.id("username")).sendKeys("test@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("test123");
		
		//2----> by.name (if name attribute property is there)	----- if id is not available 2nd preference will be given to by.name
		//driver.findElement(By.name("email")).sendKeys("test@gmail.com");
		
		//3----> by.xpath (xpath is a locator its not attribute property)
		//if id and name both are not available then 3rd preference will be given to by.xpath/dynamic xpath
		//driver.findElement(By.xpath("//*[@id='username']")).sendKeys("test@gmail.com");
		
		//4----> by.cssSelector (this is also a special css selector locator)
		//depends on the situation this will go to 3rd preference as well
		//driver.findElement(By.cssSelector("#username")).sendKeys("test@gmail.com");
		
		//5----> by.className --className should be unique. ----- least priority to this one because its not unique always
		//("form-control private-form__control login-email") this is a wrong syntax all three classes with space in between we can not use it
		//only unique class can be used. so we can use("login-email")		
		//driver.findElement(By.className("login-email")).sendKeys("test@gmail.com");
		
		//6----> by.linkText--- can be used only for links.
		//all the links are represented by <a tag (anchor tag)
		//driver.findElement(By.linkText("Sign up")).click();
		
		//7----> by.partialLinkText
		//in the partialLinkText we just need to pass the partial part of the link.
		driver.findElement(By.partialLinkText("Sign")).click();
		
		//8----> by.tagName
		
	}

}
