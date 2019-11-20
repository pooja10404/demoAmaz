package common;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserInstance {
	public static WebDriver driver = null;
	public static String browserName = "";
	static String hubURL = "";
	static File directory = new File("");
	static String absolutepath = directory.getAbsolutePath();

	/**
	 * constructor to initialize browser.
	 *
	 * @param browserNameParam
	 *            - type of browser like CHROME, FIREFOX, EDGE, IE
	 */
	public BrowserInstance(String browserNameParam) {
		try {
			DesiredCapabilities capabilities = null;
			if (browserNameParam.equalsIgnoreCase("NoBrowser")) {
				browserNameParam = browserName;
			}
			System.out.println(absolutepath);
			System.setProperty("webdriver.chrome.driver", absolutepath + "\\tools\\chromedriver.exe");
			switch (browserNameParam.toUpperCase()) {
			case "CHROME":
				Map<String, Object> prefs = new HashMap<String, Object>();
				prefs.put("profile.default_content_setting_values.notifications", 2);
				prefs.put("download.default_directory", absolutepath + File.separator + "WebDriverDownloads");
				ChromeOptions options = new ChromeOptions();
				options.setExperimentalOption("prefs", prefs);
				options.addArguments("chrome.switches", "--disable-extensions");
				capabilities = DesiredCapabilities.chrome();
				capabilities.setCapability(ChromeOptions.CAPABILITY, options);
				break;

			}
			driver = new ChromeDriver(capabilities);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
