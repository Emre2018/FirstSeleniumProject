package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class EdgeDriverDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver",
				"C:/Users/Emre/Documents/selenium dependencies/drivers/MicrosoftWebDriver.exe");

		WebDriver driver = new EdgeDriver();

		driver.get("http://www.cybertekschool.com");

	}

}
