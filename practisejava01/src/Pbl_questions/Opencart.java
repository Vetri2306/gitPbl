package Pbl_questions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Opencart {


	
	public static String URL = "http://demo.opencart.com/";
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		
		System.out.println("Title :"+driver.getTitle());
		
		System.out.println("URL :"+driver.getCurrentUrl());
		Thread.sleep(3000);
		driver.close();
	     
          
	     
	}

}


