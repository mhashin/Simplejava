package com.learnselenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Simpleprogram {
	
public static void main(String[] args) {

		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		WebElement click=driver.findElement(By.xpath("//*[@name='btnK' OR @value='Google Search']"));
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("India");
		click.click();
		
		

	}


}
