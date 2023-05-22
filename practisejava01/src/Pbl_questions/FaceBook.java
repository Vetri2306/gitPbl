package Pbl_questions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {
public static String URL = "https://demo.opencart.com";
public static String URL2 = "https://www.facebook.com";
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to(URL);
		
		String title = driver.getTitle();
		if(title.equals("Your Store")) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
	driver.navigate().to(URL2);
	driver.navigate().back();
	System.out.println(driver.getCurrentUrl());
	driver.navigate().forward();
	driver.navigate().refresh();
	driver.close();
}
}
