package TestNGSessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePageTest {
	
	
	@BeforeSuite
	public void launchBrowser() {
		System.out.println("launch the browser");
	}
	
	@BeforeTest
	public void launchURL() {
		System.out.println("launch the URL");
	}
	
	@BeforeClass
	public void loginToApp() {
		System.out.println("login to the app");
	}
	
	@BeforeMethod
	public void gotoHomePage() {
		System.out.println("go to the homePage");
	}
	
	@Test(priority = 1)
	public void homePageTitleTest() {
		System.out.println("homePage title test____");
	}
	@Test(priority = 2)
	public void homepageLinkTest() {
		System.out.println("homePage link test____");
	}
	
	@AfterMethod
	public void logOut() {
		System.out.println("logOut");
	}
	
	@AfterClass
	public void gotoLoginPage() {
		System.out.println("go to the loginPage");
	}
	
	@AfterTest
	public void disconnectwithDB() {
		System.out.println("disconnectwithDB");
	}
	
	
	@AfterSuite
	public void closeBrowser() {
		System.out.println("close the browser");
	}
	
	

}
