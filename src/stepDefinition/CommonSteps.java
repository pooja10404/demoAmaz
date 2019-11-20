package stepDefinition;

import common.BrowserInstance;
import common.Sync;
import io.cucumber.java.en.Given;

public class CommonSteps extends Sync {

	/**
	 * This step is to open the main application "https://www.amazon.in/"
	 */
	@Given("Open Application")
	public void open_Application() {
		BrowserInstance.driver.get("https://www.amazon.in/");
	}
}
