package com.learnselenium;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Simpleprogram2 {

	
	static HashMap<String,String> connectlogin()
	{
		HashMap<String,String> hm=new HashMap<String,String>();
		hm.put("talent", "agreen,Mbo.2011");
		hm.put("Manager","jpiazza,Mbo.2015");
		return hm;
	}
	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://connect-release.mbopartners.com");
		
		WebElement username=driver.findElement(By.id("username"));
		WebElement password=driver.findElement(By.id("password"));
		WebElement Login=driver.findElement(By.id("loginButton"));
		
		String cre=connectlogin().get("talent");
		String ar[]=cre.split(",");
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		
		username.sendKeys(ar[0]);
		password.sendKeys(ar[1]);
		Login.click();

	}

}
