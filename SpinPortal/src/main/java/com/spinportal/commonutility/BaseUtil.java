/**
 * 
 */
package com.spinportal.commonutility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * BaseUtil class for environment setting, and all common util methods which are
 * used by across all modules.
 * 
 * @author Rohit
 */
public class BaseUtil {

	/**
	 * Object to hold RemoteWebDriver value.
	 */
	public static WebDriver driver;

	public static String filePath = "./testdata.properties";

	/**
	 * Method to set browser for execution for local machine. While calling this
	 * method either pass friefox or chrome browser to execute scripts.
	 * 
	 * @param desiredBrowser
	 * @param url
	 */
	public static void setDesiredBrowser(String desiredBrowser, String url) {

		if (desiredBrowser.equalsIgnoreCase("firefox")) {
			System.setProperty(SeleniumConstant.FIREFOX_DRIVER_KEY,
					System.getProperty("user.dir") + SeleniumConstant.FIREFOX_DRIVER_LOCATION);
			driver = new FirefoxDriver();
		} else if (desiredBrowser.equalsIgnoreCase("chrome")) {
			System.setProperty(SeleniumConstant.CHROME_DRIVER_KEY,
					System.getProperty("user.dir") + SeleniumConstant.CHROME_DRIVER_LOCATION);
			driver = new ChromeDriver();
		} else if (desiredBrowser.equalsIgnoreCase("ie")) {
			System.setProperty(SeleniumConstant.IE_DRIVER_KEY,
					System.getProperty("user.dir") + SeleniumConstant.IE_DRIVER_LOCATION);
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(SeleniumConstant.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(SeleniumConstant.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(SeleniumConstant.SETSCRIPT_TIMEOUT, TimeUnit.SECONDS);
		driver.get(url);
	}

	public static String getPropertyData(String key) throws Exception {
		File file = new File(filePath);
		FileInputStream fis = new FileInputStream(file);
		Properties pro = new Properties();
		pro.load(fis);
		return pro.getProperty(key);
	}

	public int getRandomNumber() {

		Random random = new Random();
		int a = random.nextInt(9999);
		return a;
	}

	public static void selectOption(WebElement elementLoc, int index) {

		Select sel = new Select(elementLoc);
		sel.selectByIndex(index);
	}

	/**
	 * Method to get the title of current page
	 */
	public String getTitle() {
		return driver.getTitle();
	}

	/**
	 * Method th get the current url of the application
	 */
	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}

	/**
	 * Method to get the text of the element
	 */
	public String getText(WebElement elementLoc) {
		return elementLoc.getText();
	}

	/**
	 * Method to click on element
	 */
	public void clickElement(WebElement elementLoc) {
		elementLoc.click();
	}
}
