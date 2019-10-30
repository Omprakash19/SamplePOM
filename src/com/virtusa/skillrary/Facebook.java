package com.virtusa.skillrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	static {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	}
	public static void main (String []args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("skillrary");
		driver.findElement(By.name("pass")).sendKeys("abc123");
		driver.findElement(By.linkText("Forgotten account?")).click();
}}
