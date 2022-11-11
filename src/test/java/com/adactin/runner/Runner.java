package com.adactin.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\adactin\\feature\\adactin.feature",
                  glue = "com.adactin.stepdefinition")

public class Runner 
{
	public static WebDriver driver;
	@BeforeClass
	public static void setup() 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Gopi\\eclipse-workspace\\com.cucumber\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	public static void teardown() 
	{
		driver.close();
	}

}
