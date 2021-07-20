package org.test.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DayThree {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//input[@id='twotabsearchtextbox']
		
		WebElement txtSearch = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		txtSearch.sendKeys("iphone");
		
		WebElement btnSearch = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		btnSearch.click();
		
		
		
		
		
	
	
	
	}

}
