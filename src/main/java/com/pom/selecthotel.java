package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class selecthotel 
{
	static WebDriver driver;
	public selecthotel(WebDriver driver1) 
	{
		selecthotel.driver = driver1;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@type='radio']")
	private WebElement select;
	public WebElement getSelect() 
	{
		return select;
	}
	@FindBy(id="continue")
	private WebElement continu;
	public WebElement getContinu() {
		return continu;
	}
	

}
