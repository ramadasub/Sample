package common;

import org.openqa.selenium.WebDriver;

public class BasePage {

	public static WebDriver driver;

	public void setUp() {
		BrowserFactory factory = new BrowserFactory();
		driver = factory.launchBrowser();
	}

	public void tearDown() {
		driver.quit();
	}
}
