package com.learnselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.selenium.utils.JavascriptUtil;

public class JavaScriptExamples {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://classic.freecrm.com/register/");
	    WebElement tabPricing=driver.findElement(By.xpath("//a[contains(text(),'Pricing')]"));
	    
	    //javascript for click element
		JavascriptUtil.javaScriptclickElement(tabPricing, driver);
		
		//javascript for refresh the page
		
		JavascriptUtil.javaScriptrefreshPage(driver);
	}

}
