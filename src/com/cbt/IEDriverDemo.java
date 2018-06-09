package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class IEDriverDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.ie.driver",
				"C:/Users/Emre/Documents/selenium dependencies/drivers/IEDriverServer.exe");

		WebDriver driver = new InternetExplorerDriver();

		driver.get("http://www.amazon.com");

	}

}
