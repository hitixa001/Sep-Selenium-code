package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Assignments.GenericMethod;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RightclickConcept {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement rightClickElement = driver.findElement(By.className("context-menu-one"));
		
//		Actions action = new Actions(driver);
//		action.contextClick(rightClickElement).build().perform();
//		String text = driver.findElement(By.xpath("//ul/li[contains(@class,'context-menu-icon-copy')]/span")).getText();
//		System.out.println(text);
		
		String edit = "//ul/li[contains(@class,'context-menu-icon-edit')]/span";
		String cut = "//ul/li[contains(@class,'context-menu-icon-cut')]/span";
		String copy = "//ul/li[contains(@class,'context-menu-icon-copy')]/span";
		String paste = "//ul/li[contains(@class,'context-menu-icon-paste')]/span";
		String delete= "//ul/li[contains(@class,'context-menu-icon-delete')]/span";
		String quit= "//ul/li[contains(@class,'context-menu-icon-quit')]/span";
		
		GenericMethod.getRightClickText(driver, rightClickElement, edit);
		GenericMethod.getRightClickText(driver, rightClickElement, cut);
		GenericMethod.getRightClickText(driver, rightClickElement, paste);
		GenericMethod.getRightClickText(driver, rightClickElement, copy);
		GenericMethod.getRightClickText(driver, rightClickElement, delete);
		GenericMethod.getRightClickText(driver, rightClickElement, cut);
		
		
	}
	
	

}
