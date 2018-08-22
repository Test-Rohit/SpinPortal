package com.spinportal.commonutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CustomerPageUI extends BaseUtil {
	
	
	
	@FindBy(linkText="Sign in") public WebElement signIn;
	@FindBy(id="email_create") public WebElement emailIdInputField;
	@FindBy(id="SubmitCreate") public WebElement createAccountButton;
	
	@FindBy(id="id_gender1") public WebElement radioMr;
	@FindBy(id="customer_firstname") public WebElement firstname;
	@FindBy(id="customer_lastname") public WebElement lastName;
	@FindBy(id="passwd") public WebElement passwd;
	
	@FindBy(id="days") public WebElement day;
	@FindBy(id="months") public WebElement months;
	@FindBy(id="years") public WebElement years;
	
	
	@FindBy(id="address1") public WebElement address;
	
	@FindBy(id="city") public WebElement city;
	@FindBy(id="id_state") public WebElement state;
	@FindBy(id="postcode") public WebElement zipCode;
	@FindBy(id="id_country") public WebElement country;
	@FindBy(id="phone_mobile") public WebElement mobileNo;
	@FindBy(id="alias") public WebElement aliasEmail;
	
	@FindBy(id="submitAccount") public WebElement registerButton;
	
	
	public CustomerPageUI(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	public void customerRegisteration() throws Exception {
		signIn.click();
		
		emailIdInputField.sendKeys(getPropertyData("firstName")+getPropertyData("lastName")+getRandomNumber()+getPropertyData("dominName"));
		
		System.out.println(emailIdInputField.getAttribute("value"));
		
		createAccountButton.click();
		
		radioMr.click();
		
		firstname.sendKeys(getPropertyData("firstName"));
		lastName.sendKeys(getPropertyData("lastName"));
		passwd.sendKeys(getPropertyData("password"));
		
		
		selectOption(day, 5);
		selectOption(months, 5);
		selectOption(years, 5);
				
		address.sendKeys("Pune");
		
		city.sendKeys("Pune");
		state.sendKeys("Alaska");
		
		/*zipCode.sendKeys("41100");*/
		zipCode.sendKeys("9"+getRandomNumber());
				
		System.out.println(zipCode.getAttribute("value"));
	
		country.sendKeys("United States");
		
		/*mobileNo.sendKeys("1234567890");*/
		mobileNo.sendKeys("999999"+getRandomNumber());
		
		System.out.println(mobileNo.getAttribute("value"));
		
		aliasEmail.sendKeys("cdff@gmail.com");
		
		registerButton.click();
		
	}


	
	
	
	
	

}














