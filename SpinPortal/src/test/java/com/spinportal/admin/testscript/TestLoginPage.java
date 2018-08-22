/**
 * 
 */
package com.spinportal.admin.testscript;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.spinportal.commonutility.BaseUtil;
import com.spinportal.commonutility.CustomerPageUI;

/**
 * @author Rohit
 *
 */
public class TestLoginPage extends BaseUtil {
	CustomerPageUI customer;
	@BeforeClass
	@Parameters("browser")
	public void startProcess(String browser) {
		setDesiredBrowser(browser,"http://automationpractice.com/index.php");
	}
	
	@Test(priority=0)
	public void launchBrowser() throws Exception {
		customer = new CustomerPageUI(driver);
		customer.customerRegisteration();
		
	}
	
	@Test(priority=1)
	public void demo() {
		
		System.out.println("Demo...");
	}
	
	@Test(priority=2)
	public void test() {
		System.out.println("Test...");
	}
	
	@AfterClass
	public void endProcess() {
		
	}

}
