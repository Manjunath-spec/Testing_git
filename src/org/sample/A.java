package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Test\\driver\\chromedriver.exe");
			WebDriver d =new ChromeDriver();
			
			d.get("https://www.facebook.com/");
			
			WebElement Email = d.findElement(By.id("email"));
			Email.sendKeys("manjunath.ranger@gmail.com");
			
			WebElement passwd = d.findElement(By.id("pass"));
			passwd.sendKeys("1234");
			
			WebElement login = d.findElement(By.id("loginbutton"));
			login.click();
		}
		
	}
