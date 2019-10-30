package com.virtusa.skillrary;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	
		static {
			System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		}
		public static void main (String []args) throws InterruptedException {
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			WebElement ele = driver.findElement(By.id("month"));
			Select s = new Select (ele);
			s.selectByIndex(3);
			Thread.sleep(3000);
			s.selectByValue("5");
			s.selectByVisibleText("Nov");
			List<WebElement> options=s.getOptions();
			int count =options.size();
			System.out.println(count);
			
			for( WebElement b : options) {
				String text = b.getText();
				System.out.println(text);
				
				
			}
			
		}
	}
