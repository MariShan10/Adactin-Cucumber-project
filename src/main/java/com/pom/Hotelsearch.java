package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotelsearch 
{
	static WebDriver driver;
	public Hotelsearch(WebDriver driver1) 
	{
		Hotelsearch.driver=driver1;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="location")
	private WebElement location;
	public WebElement getLocation() 
	{
		return location;
	}
	@FindBy(id="hotels")
	private WebElement hotels;
	public WebElement getHotels() 
	{
		return hotels;
	}
	@FindBy(id="room_type")
	private WebElement Roomtype;
	public WebElement getRoomtype() 
	{
		return Roomtype;
	}
	@FindBy(id="room_nos")
	private WebElement nofrooms;
	public WebElement getNofrooms() 
	{
		return nofrooms;
	}
	@FindBy(name="datepick_in")
	private WebElement checkin;
	public WebElement getCheckin() 
	{
		return checkin;
	}
	@FindBy(name="datepick_out")
	private WebElement checkout;
	public WebElement getCheckout() 
	{
		return checkout;
	}
	@FindBy(id="adult_room")
	private WebElement adults;
	public WebElement getAdults() 
	{
		return adults;
	}
	@FindBy(id="child_room")
	private WebElement childrens;
	public WebElement getChildrens() 
	{
		return childrens;
	}
	@FindBy(name="Submit")
	private WebElement submit;
	public WebElement getSubmit() 
	{
		return submit;
	}
	
}
