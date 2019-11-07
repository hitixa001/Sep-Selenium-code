package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Custom_Xpath {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//but this is absolute xPath and its always risky to use so in real life its always ideal to use custom/relative xPath.
//		String s = driver.findElement(By.xpath("//input[@id='username']/../../../../..")).getAttribute("id");
//		System.out.println(s);
		
		WebElement email = driver.findElement(By.xpath("//input[@id='username']"));
		WebElement pwd = driver.findElement(By.xpath("//input[@id='password']"));
		WebElement loginBTN = driver.findElement(By.xpath("(//i18n-string[contains(text(),'Log in')])[1]"));
		
		Actions action = new Actions(driver);
		action.sendKeys(email,"naveenanimation20@gmail.com").build().perform();
		action.sendKeys(pwd,"Test@12345").build().perform();
		action.click(loginBTN).build().perform();
		
		Thread.sleep(2000);
		
		String header = driver.findElement(By.xpath("//h1[text()='Sales Dashboard']")).getText();
		System.out.println(header);
		
		
		
		driver.findElement(By.linkText("Contacts")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='nav-secondary-contacts']//div[contains(text(),'Contacts')][1]")).click();
		Thread.sleep(4000);
		selectContact(driver, action, "naveen k");
		selectContact(driver, action, "richi mohapatra");
		selectContact(driver, action, "L");
		
	}
	
	
	
	public static void selectContact(WebDriver driver, Actions action, String ContactName) {
		action.click(driver.findElement(By.xpath("//span[text()='"+ContactName+"']//ancestor::td//"
				+ "preceding-sibling::td//span[@class='private-checkbox__inner']"))).build().perform();
		
	}

}

//input[@id='username']/../../../../..	 backward traversing  or concept of reversing xPath
//to get the value of id .getAttribute

