package com.virtusa.skillrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launching {
	static {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	}
	public static void main (String []args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com");
		String title = driver.getTitle();
		System.out.println(title);
		 String url=driver.getCurrentUrl();
		 System.out.println(url);
		 driver.close();
	}

}
