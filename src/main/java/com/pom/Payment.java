package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment 
{
	static WebDriver driver;
	public Payment(WebDriver driver1) 
	{
		Payment.driver = driver1;
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="first_name")
	private WebElement firstname;
	public WebElement getFirstname() {
		return firstname;
	}
	@FindBy(name="last_name")
	private WebElement lastname;
	public WebElement getLastname() {
		return lastname;
	}
	@FindBy(name="address")
	private WebElement address;
	public WebElement getAddress() {
		return address;
	}
	@FindBy(name="cc_num")
	private WebElement ccnumber;
	public WebElement getCcnumber() {
		return ccnumber;
	}
	@FindBy(id="cc_type")
	private WebElement cardtype;
	public WebElement getCardtype() {
		return cardtype;
	}
	@FindBy(name="cc_exp_month")
	private WebElement cardexpirymonth;
	public WebElement getExpiryMonth() {
		return cardexpirymonth;
	}
	@FindBy(id="cc_exp_year")
	private WebElement cardexpiryyear;
	public WebElement getExpiryYear() {
		return cardexpiryyear;
	}
	@FindBy(name="cc_cvv")
	private WebElement cvvnumber;
	public WebElement getCvvnumber() {
		return cvvnumber;
	}
	@FindBy(id="book_now")
	private WebElement book;
	public WebElement getBook() {
		return book;
	}
	

}
