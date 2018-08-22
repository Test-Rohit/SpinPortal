/**
 * 
 */
package com.spinportal.commonutility;

/**
 * @author Rohit
 *
 */
public class SeleniumConstant {
	
	/*firefox driver executable environment*/
	public static final String FIREFOX_DRIVER_KEY = "webdriver.gecko.driver";
	public static final String FIREFOX_DRIVER_LOCATION = "/DriverExecutable/geckodriver.exe";
	
	/*chrome driver executable environment*/
	public static final String CHROME_DRIVER_KEY = "webdriver.chrome.driver";
	public static final String CHROME_DRIVER_LOCATION = "/DriverExecutable/chromedriver.exe";

	/*ie driver executable environment*/
	public static final String IE_DRIVER_KEY = "webdriver.ie.driver";
	public static final String IE_DRIVER_LOCATION = "/DriverExecutable/IEDriverServer.exe";
	
	/*time out*/
	public static final long PAGE_LOAD_TIMEOUT = 30;
	public static final long IMPLICIT_WAIT = 30;
	public static final long SETSCRIPT_TIMEOUT = 30;
}
