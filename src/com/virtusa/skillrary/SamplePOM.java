package com.virtusa.skillrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SamplePOM {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		WebElement ele =driver.findElement(By.id("username"));
		driver.navigate().refresh();
		ele.sendKeys("admin");
	}

}
