package steps;

import common.BasePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	BasePage basePage = new BasePage();

	@Before
	public void setup() {
		basePage.setUp();
	}

	@After
	public void tearDownMethod() {
		basePage.tearDown();
	}
}
