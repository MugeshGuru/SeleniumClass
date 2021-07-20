package org.test.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DayFour2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Dell\\\\eclipse-workspace\\\\Selenium1\\\\Driver\\\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement textSearch = driver.findElement(By.xpath("//input[@name='q']"));
		textSearch.sendKeys("Greens velmurugan");
		String attribute = textSearch.getAttribute("value");
		System.out.println(attribute);
		
		WebElement btnClick = driver.findElement(By.xpath("//input[@class='gNO89b']"));
		btnClick.click();
		WebElement btnClick2 = driver.findElement(By.xpath("//h3[@class='LC20lb DKV0Md']"));
		btnClick2.click();
		
	}
}
