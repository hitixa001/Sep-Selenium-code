package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SpiceJetLoginPage {

	static WebDriver driver;

	public static void main(String[] args) {

		Util util = new Util(driver);
		util.openBrowser();
		util.getURL("https://www.spicejet.com/");

		By Menu = By.cssSelector("#highlight-addons > span.burger-bread");
		By travelInfo = By.cssSelector("#menu-list-addons > li:nth-child(1) > a");
		By flightSchedule = By.xpath("//ul/li/a[contains(text(),'Flight Schedules ')]");

		util.getElements(Menu);

		util.waitForTheElementToPresents(travelInfo, 3);
		util.getElements(travelInfo);

		util.waitForTheElementToPresents(flightSchedule, 5);
		util.doClick(flightSchedule);

	}

}
