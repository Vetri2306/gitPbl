package bind;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hook {

	public static String URL = "https://petstore.octoperf.com/actions/Catalog.action";
	public static WebDriver driver;

	@Before
	public void setup() {
		System.setProperty("webdriver,chrome.driver", "/Users/TA20463982/Downloads/chromedriver_mac64 (1)/chromedriver");
		driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		
		
		driver.manage().window().maximize();
		driver.get(URL);
	}

	@After
	public void down() {
		//driver.quit();
	}
}
