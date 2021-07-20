package org.test.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DayThree3 {

public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Dell\\\\eclipse-workspace\\\\Selenium1\\\\Driver\\\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	driver.get("http://toolsqa.com/automation-practice-form/");
	driver.manage().window().maximize();
	
	WebElement txtName = driver.findElement(By.xpath("//input[@id='firstName']"));
	txtName.sendKeys("Mugesh");
	
	WebElement txtLastName = driver.findElement(By.xpath("//input[@id='lastName']"));
	txtLastName.sendKeys("Guru");
	
	WebElement txtEmail = driver.findElement(By.xpath("//input[@id='userEmail']"));
	txtEmail.sendKeys("MugeshGuru29@gmail.com");
	
	WebElement txtMobileNum = driver.findElement(By.xpath("//input[@id='userNumber']"));
	txtMobileNum.sendKeys("9655993579");
	
	WebElement txtAddress = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
	txtAddress.sendKeys("Thuraipakkam, Chennai");
	
	WebElement btnGender = driver.findElement(By.xpath("//label[@class='custom-control-label'][1]"));
	btnGender.click();
	
	
	}
}
