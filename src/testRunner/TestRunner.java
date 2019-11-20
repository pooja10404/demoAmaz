package testRunner;

import java.io.File;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import common.BrowserInstance;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/feature/AmazonUICheck.feature" }, glue = { "stepDefinition" }, tags = {
		"~@ignored" }, plugin = { "pretty", "junit:target/cucumber-reports/Cucumber.xml",
				"html:target/cucumber-reports" }, monochrome = false)

public class TestRunner {
	static BrowserInstance browserInstance;
	public static WebDriver driver;

	@BeforeClass
	public static void InitializeClass() throws IOException {
		browserInstance = new BrowserInstance("CHROME");
	}

	@AfterClass
	public static void teardown() throws IOException {
		BrowserInstance.driver.close();
		BrowserInstance.driver.quit();
		BrowserInstance.driver = null;
	}

}
