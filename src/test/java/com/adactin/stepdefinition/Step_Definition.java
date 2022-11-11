package com.adactin.stepdefinition;

import com.baseclass.Base;
import com.pom.BookConfirm;
import com.pom.Hotelsearch;
import com.pom.Loginpage;
import com.pom.Payment;
import com.pom.selecthotel;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends Base
{
	@Given("^Url to open the adactin website$")
	public void url_to_open_the_adactin_website() throws Throwable 
	{
		maximize();
		url("https://adactinhotelapp.com/");
	}

	@When("^user can enter the username in username field$")
	public void user_can_enter_the_username_in_username_field() throws Throwable 
	{
		Loginpage l = new Loginpage(driver);
		pass(l.getUsername(), "MariShan");
	}

	@When("^user can enter the password in password field$")
	public void user_can_enter_the_password_in_password_field() throws Throwable 
	{
		Loginpage l = new Loginpage(driver);
		pass(l.getPassword(),"Gopikrish10");
	}

	@Then("^login button direct to the hotel booking page$")
	public void login_button_direct_to_the_hotel_booking_page() throws Throwable 
	{
		Loginpage l = new Loginpage(driver);
		click(l.getLogin());
	}
	
/* -------------------------------------------------------------------------------------- */
	@When("^user can  select the location$")
	public void user_can_select_the_location() throws Throwable
	{
		Hotelsearch h = new Hotelsearch(driver);
		DropDown(h.getLocation(),"value", "Sydney", 0);
	}

	@When("^user can select the hotel$")
	public void user_can_select_the_hotel() throws Throwable 
	{
		Hotelsearch h = new Hotelsearch(driver);
		DropDown(h.getHotels(),"text","Hotel Sunshine", 0);
	}

	@When("^user can select the room type in the hotel$")
	public void user_can_select_the_room_type_in_the_hotel() throws Throwable 
	{
		Hotelsearch h = new Hotelsearch(driver);
		DropDown(h.getRoomtype(),"value","Standard", 0);
	}

	@When("^user can select the number of room for booking$")
	public void user_can_select_the_number_of_room_for_booking() throws Throwable 
	{
		Hotelsearch h = new Hotelsearch(driver);
		DropDown(h.getNofrooms(),"index", null, 1);
	}

	@When("^user can enter the check in date$")
	public void user_can_enter_the_check_in_date() throws Throwable 
	{
		Hotelsearch h = new Hotelsearch(driver);
		pass(h.getCheckin(),"10/2/2023");
	}

	@When("^user can enter the check out date$")
	public void user_can_enter_the_check_out_date() throws Throwable 
	{
		Hotelsearch h = new Hotelsearch(driver);
		pass(h.getCheckout(),"12/2/2023");
	}

	@When("^user can select the number of adults per room$")
	public void user_can_select_the_number_of_adults_per_room() throws Throwable
	{
		Hotelsearch h = new Hotelsearch(driver);
		DropDown(h.getAdults(), "index", null, 1);
	}

	@When("^user can select the number of children per room$")
	public void user_can_select_the_number_of_children_per_room() throws Throwable
	{
		Hotelsearch h = new Hotelsearch(driver);
		DropDown(h.getChildrens(), "index", null, 1);
	}

	@Then("^search button will lead to the select hotel page$")
	public void seach_button_will_lead_to_the_select_hotel_page() throws Throwable 
	{
		Hotelsearch h = new Hotelsearch(driver);
		click(h.getSubmit());
	}
/* -------------------------------------------------------------------------------------- */
	@When("^user can select the hotel recommended$")
	public void user_can_select_the_hotel_recommended() throws Throwable 
	{
		selecthotel s = new selecthotel(driver);
		click(s.getSelect());
	}

	@Then("^continue button will lead to the payment page$")
	public void continue_button_will_lead_to_the_payment_page() throws Throwable 
	{
		selecthotel s = new selecthotel(driver);
		click(s.getContinu());
	}
	/* -------------------------------------------------------------------------------------- */
	@When("^user can enter the firstname in the field$")
	public void user_can_enter_the_firstname_in_the_field() throws Throwable 
	{
		Payment p = new Payment(driver);
		javascript("scrolltoview",p.getBook(), null);
		pass(p.getFirstname(),"Luffy");
	}

	@When("^user can enter the lastname in the field$")
	public void user_can_enter_the_lastname_in_the_field() throws Throwable 
	{
		Payment p = new Payment(driver);
		pass(p.getLastname(),"taro");
	}

	@When("^user can enter thier address in the field$")
	public void user_can_enter_thier_address_in_the_field() throws Throwable 
	{
		Payment p = new Payment(driver);
		pass(p.getAddress(),"123,Abc street,downtown,Newyork");
	}

	@When("^user can enter the (16) digit card number in the field$")
	public void user_can_enter_the_16digit_card_number_in_the_field(int arg1) throws Throwable 
	{
		Payment p = new Payment(driver);
		pass(p.getCcnumber(),"1234567893214569");
	}

	@When("^user can select the type of thier of card in the field$")
	public void user_can_select_the_type_of_thier_of_card_in_the_field() throws Throwable 
	{
		Payment p = new Payment(driver);
		DropDown(p.getCardtype(),"index", null, 0);
	}

	@When("^user can select the expiry of month and year of the card$")
	public void user_can_select_the_expiry_of_month_and_year_of_the_card() throws Throwable 
	{
		Payment p = new Payment(driver);
		DropDown(p.getExpiryMonth(),"value","12", 0);
		DropDown(p.getExpiryYear(),"value","2022", 0);
	}

	@When("^user can enter the CVV number of the card$")
	public void user_can_enter_the_CVV_number_of_the_card() throws Throwable 
	{
		Payment p = new Payment(driver);
		pass(p.getCvvnumber(), "258");
	}

	@Then("^Book now button will lead to the booking confirmation page$")
	public void book_now_button_will_lead_to_the_booking_confirmation_page() throws Throwable 
	{
		Payment p = new Payment(driver);
		click(p.getBook());
	}
	/* -------------------------------------------------------------------------------------- */
	@When("^user can confirm the details of they entered$")
	public void user_can_confirm_the_details_of_they_entered() throws Throwable 
	{
		wait("implicit", 10);
		BookConfirm b = new BookConfirm(driver);
		javascript("scrolltoview",b.getLogout(), null);
	}

	@Then("^Logout button will lead back to the login page$")
	public void logout_button_will_lead_back_to_the_login_page() throws Throwable 
	{
		BookConfirm b = new BookConfirm(driver);
		click(b.getLogout());
		
	}
}
