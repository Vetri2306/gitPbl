package Pbl_questions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ebay {
	public static String URL = "https://ebay.com";

		public static WebDriver driver;
		
		public static void main(String[] args) throws InterruptedException  {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get(URL);
			driver.manage().window().maximize();
			
			
			WebElement searchbox=driver.findElement(By.id("gh-ac"));
			searchbox.sendKeys("Apple");
			
		
			
			
			
		
		
		driver.close();
}
