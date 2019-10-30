package com.virtusa.skillrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Skillrary {

	
		static {
			System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		}
		public static void main (String []args) {
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.skillrary.com/");
			driver.findElement(By.xpath("//a[.='Sign In']")).click();
			driver.findElement(By.id("email")).sendKeys("ommallah@virtusa.com");
			driver.findElement(By.name("password")).sendKeys("");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			String t = driver.getTitle();
			System.out.println(t);
			
			
		}
	}


