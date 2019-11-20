/*************************************** PURPOSE **********************************
 - This class contains all synchronization methods
*/
package common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import common.ConfigManager;
//import com.thoughtworks.selenium.Selenium;
//import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;
import org.testng.Assert;

public class Sync implements TimeOuts {
	private WebDriver driver;

	public Sync() {
		this.driver = BrowserInstance.driver;
	}

	/**
	 * Sets implicitWait to ZERO. This helps in making explicitWait work...
	 * 
	 * @param driver
	 *            (WebDriver) The driver object to be used
	 * @return void
	 */
	public void nullifyImplicitWait() {
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
	}

	/**
	 * Set driver's implicitlyWait() time according given waitTime.
	 * 
	 * @param driver
	 *            (WebDriver) The driver object to be used
	 * @param waitTimeInSeconds
	 *            (int) The time in seconds to specify implicit wait
	 * @return void
	 */
	public void setImplicitWait(int waitTimeInSeconds) {
		driver.manage().timeouts().implicitlyWait(waitTimeInSeconds, TimeUnit.SECONDS);
	}

	public boolean isElementPresent(WebElement element, int waitTime) {
		boolean bFlag = false;
		nullifyImplicitWait();
		try {
			WebDriverWait wait = new WebDriverWait(driver, waitTime);
			if (element.isDisplayed() || element.isEnabled()) {
				bFlag = true;
			}
		} catch (NoSuchElementException e) {
		} catch (TimeoutException e) {
		} catch (Exception e) {
			Assert.fail("Element " + element + " is not displayed" + e.getStackTrace());
		}
		setImplicitWait(30);
		return bFlag;
	}

	/**
	 * Waits until page is loaded.
	 *
	 * @param driver
	 *            - The driver object to use to perform this element search
	 * @param int
	 *            - timeout in seconds
	 * @return True (boolean)
	 */
	public boolean waitForPageToLoad(int timeOutInSeconds) {
		boolean isPageLoadComplete = false;
		nullifyImplicitWait();
		try {
			new WebDriverWait(driver, timeOutInSeconds).until(new ExpectedCondition<Boolean>() {
				@Override
				public Boolean apply(WebDriver driverObject) {
					return (Boolean) ((String) ((JavascriptExecutor) driver)
							.executeScript("return document.readyState")).equals("complete");
				}
			});
			isPageLoadComplete = (Boolean) ((String) ((JavascriptExecutor) driver)
					.executeScript("return document.readyState")).equals("complete");
		} catch (Exception e) {
			Assert.fail("unable to load webpage" + "\n" + e.getStackTrace());
		}
		setImplicitWait(IMPLICITWAIT);
		return isPageLoadComplete;
	}

}
