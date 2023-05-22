package Com_tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {

	public static String URL = "https://www.irctc.co.in/nget/train-search";
	public static WebDriver driver;
	
	@BeforeTest
public void start() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	
}
	
	
	@AfterTest
	public  void End() {
		driver.quit();
	}
	
	
	
	
}
