package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookConfirm 
{
	static WebDriver driver;
	
	public BookConfirm(WebDriver driver2) {
		BookConfirm.driver = driver2;
		PageFactory.initElements(driver,this);
	}
	@FindBy(name="logout")
	private WebElement logout;
	public WebElement getLogout() 
	{
		return logout;
	}
	
	

}
