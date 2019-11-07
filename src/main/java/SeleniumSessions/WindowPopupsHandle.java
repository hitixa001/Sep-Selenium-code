package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowPopupsHandle {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();	
		WebDriver driver = new ChromeDriver();
		driver.get("http://popuptest.com/goodpopups.html");
		
		driver.findElement(By.linkText("Good PopUp #1")).click();
		driver.findElement(By.linkText("Good PopUp #2")).click();
		
		//jump to PopUp window for this we need windowID -- and for that we need Set<String> and its divided in to 2 parts parent and child
		//but it will not store on the basis of index(does not maintain the order) and can not hold any duplicate values.
		//for that we need Iterator.
		Set<String> hadles =driver.getWindowHandles();
		
		Iterator<String> s = hadles.iterator();		//after this line of code one object reference will be created and that objref is pointing to just 
		//above the SetObj so to move that pointer we need .next();
		String PWI = s.next();
		System.out.println("Parent window ID is: "+ PWI);
		
		String CHID1 = s.next();
		System.out.println("Child window ID is: "+ CHID1);
		
		String CHID2 = s.next();
		System.out.println("Child window ID is: "+ CHID2);
		
		driver.switchTo().window(CHID1);
		System.out.println(driver.getTitle());
		driver.close();	//this will not give null session id it will give you expired session id.
		
		//after closing the child windows driver is lost/session is expired so we need to switch back to parent window.
		driver.switchTo().window(PWI);
		System.out.println(driver.getTitle());
		driver.quit();
		
		
	}

}
