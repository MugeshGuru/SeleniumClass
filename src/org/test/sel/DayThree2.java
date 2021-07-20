package org.test.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DayThree2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Dell\\\\eclipse-workspace\\\\Selenium1\\\\Driver\\\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement txtEmail = driver.findElement(By.xpath("//input[@id='email']"));
		txtEmail.sendKeys("Welcome");
		
		WebElement txtPassWord = driver.findElement(By.xpath("//input[@id='pass']"));
		txtPassWord.sendKeys("testing");
		
		WebElement btnClick = driver.findElement(By.xpath("//button[@name='login']"));
		btnClick.click();
		
	}
}
