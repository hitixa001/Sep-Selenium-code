package TestNGSessions;

import org.testng.annotations.Test;

public class TestPriority {

	//this will be executed first because -1 comes before 1/2
	@Test(priority = -1)
	public void homePageTitleTest() {
		System.out.println("homePage title test____");
	}
	
	//we give any integer but -1/0 etc... but its a wrong practice.
	//if you give the same priority number then it will pick on the basis of alphabetic order.
	@Test(priority = 0)
	public void homepageLinkTest() {
		System.out.println("homePage link test____");
	}
	
	//if you don't give any priority it will pick on the basis of alphabetic order.(non-priority ones will be executed first)
	@Test(priority = 1)
	public void homepageUserTest() {
		System.out.println("homepageUserTest");
	}
}
