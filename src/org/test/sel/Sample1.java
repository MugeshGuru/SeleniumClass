package org.test.sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Dell\\\\eclipse-workspace\\\\Selenium1\\\\Driver\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		
		
		
	
	}
}
