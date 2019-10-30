package com.virtusa.skillrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehover {

	static {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		WebElement ele =driver.findElement(By.xpath("//span[.='Hello, Sign in']"));
 	
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		act.moveToElement(ele).perform();
		driver.findElement(By.xpath("//span[.='Create a List']")).click();
		
	}

}
