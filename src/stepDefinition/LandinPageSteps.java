package stepDefinition;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import common.Sync;
import io.cucumber.java.en.Then;
import pageObject.landingPage;

public class LandinPageSteps extends Sync {

	private landingPage lPage = new landingPage();

	/**
	 * This step is for verification of the elements
	 */
	@Then("Verify {string} is present")
	public void verify_is_present(String uiElement) {
		WebElement element = null;
		try {
			switch (uiElement) {
			case "amazonLogo":
				element = lPage.amazonLogo();
				break;
			case "searchBox":
				element = lPage.searchBox();
				break;
			case "cart":
				element = lPage.cart();
				break;
			case "tryPrime":
				element = lPage.tryPrime();
				break;
			case "returnAndOrder":
				element = lPage.returnAndOrder();
				break;
			case "signinOption":
				element = lPage.signinOption();
				break;
			case "hamburger":
				element = lPage.hamburger();
				break;
			}
			Assert.assertTrue(isElementPresent(element, 30));
		} catch (Exception e) {
			Assert.fail("Unable to verify " + uiElement + " element, it is not on the page." + e.getMessage());
		}
	}
}
