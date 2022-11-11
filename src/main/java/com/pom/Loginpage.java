package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage 
{
	static WebDriver driver;
	public Loginpage(WebDriver driver1) 
	{
		Loginpage.driver = driver1;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement username;
	public WebElement getUsername() {
		return username;
	}
	@FindBy(id="password")
	private WebElement password;
	public WebElement getPassword() {
		return password;
	}
	@FindBy(id="login")
	private WebElement login;
	public WebElement getLogin() 
	{
		return login;
	}
}
