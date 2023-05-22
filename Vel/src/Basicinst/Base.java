package Basicinst;
import org.openga.selenium.WebDriver;
import org.openga.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Base {

	public static String URL = "https://www.amazon.com";
		public staticWebDriver driver;	


	public static void start() {
		WebDriverManager.chromedriver().setup();
		driver = new WebDriver();
		driver.get(URL);
		

	}

public static void end() {
	driver.close();
}
}

