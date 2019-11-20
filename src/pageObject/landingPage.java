package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import common.BrowserInstance;
import common.Sync;
import cucumber.api.java.en.Then;

public class landingPage extends Sync {
	private WebDriver driver;

	public landingPage() {
		this.driver = BrowserInstance.driver;
	}

	private String amazonLogoLocator = "a.nav-logo-link";
	private String searchBoxLocator = "input#twotabsearchtextbox";
	private String cartLocator = "span.nav-cart-icon.nav-sprite";
	private String tryPrimeLocator = "a#nav-link-prime";
	private String returnAndOrderLocator = "a#nav-orders";
	private String signinOptionLocator = "a#nav-link-accountList";
	private String hamburgerLocator = "a#nav-hamburger-menu";

	/**
	 * Amazon logo of the top bar
	 */
	public WebElement amazonLogo() {
		return driver.findElement(By.cssSelector(amazonLogoLocator));
	}

	/**
	 * Search box in middle of the top bar
	 */
	public WebElement searchBox() {
		return driver.findElement(By.cssSelector(searchBoxLocator));
	}

	/**
	 * Cart on the left corner of the top bar.
	 */
	public WebElement cart() {
		return driver.findElement(By.cssSelector(cartLocator));
	}

	/**
	 * Try prime on the left of the top bar
	 */
	public WebElement tryPrime() {
		return driver.findElement(By.cssSelector(tryPrimeLocator));
	}

	/**
	 * Return and Order on the left of the top bar
	 */
	public WebElement returnAndOrder() {
		return driver.findElement(By.cssSelector(returnAndOrderLocator));
	}

	/**
	 * Sign in option on the left of the top bar
	 */
	public WebElement signinOption() {
		return driver.findElement(By.cssSelector(signinOptionLocator));
	}

	/**
	 * hamburger option on the right of the top bar
	 */
	public WebElement hamburger() {
		return driver.findElement(By.cssSelector(hamburgerLocator));
	}
}
