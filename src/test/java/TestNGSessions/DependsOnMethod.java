package TestNGSessions;

import org.testng.annotations.Test;

public class DependsOnMethod {
	
	
	@Test
	public void login() {
		System.out.println("login test");
		int i = 9/0;
	}
	
	@Test(dependsOnMethods = "login")
	public void homepageTest() {
		System.out.println("home page test");
	}
	
	@Test(dependsOnMethods = "login")
	public void contactsPageTest() {
		System.out.println("contacts page Test");
	}

}
