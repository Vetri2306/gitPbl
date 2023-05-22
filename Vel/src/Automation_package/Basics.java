package Automation_package;

import org.openga.selenium.WebDriver;
import org.openga.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.onlinegdb.com/online_java_compiler");
	}

}
