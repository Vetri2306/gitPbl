package demo;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Vetri1 {

	public static String URL = "https://www.amazon.com";
	public static WebDriver driver;
	
	
	public static void start() {
		WebDriverManager.chromedriver();
		driver = new ChromeDriver();
		driver.get(URL);
	}
	
	
	public static void end() {
		driver.close();
	}
	
	
}




