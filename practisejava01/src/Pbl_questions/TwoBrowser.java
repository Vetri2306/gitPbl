package Pbl_questions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TwoBrowser {

	public static String URL = "http://demo.opencart.com/";
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get(URL);
		
	driver.quit();
	
	Thread.sleep(3000);

	
	
	WebDriverManager.safaridriver().setup();
	driver = new SafariDriver();
	
	
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.get(URL);
	
	driver.quit();
	
}
}

	