package org.test.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DayFour {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement textFaceBook = driver.findElement(By.xpath("//h2[contains(text(),'Fac')]"));
		String text = textFaceBook.getText();
		System.out.println(text);
		
		WebElement textEmail = driver.findElement(By.xpath("//input [@id='email']"));
		textEmail.sendKeys("Welcome");
		String attribute = textEmail.getAttribute("value");
		System.out.println(attribute);
	
		WebElement textPassWord = driver.findElement(By.xpath("//input[@id='pass']"));
		textPassWord.sendKeys("testing");
		String attribute2 = textPassWord.getAttribute("value");
		System.out.println(attribute2);
		
		
	}
	
}
