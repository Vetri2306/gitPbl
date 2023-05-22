package Pbl_questions;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	public static String URL = "https://letcode.in/table/";
	public static WebDriver driver;
	
	public static void main(String[] args) throws IOException, InterruptedException  {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		
		WebElement Table = driver.findElement(By.id("simpletable"));
		
		int Tableheader=Table.findElements(By.tagName("th")).size();
		System.out.println(Tableheader);
		
	List <WebElement> headercollection = Table.findElements(By.tagName("th"));
	
	
	for(WebElement   :headercollection) {
		
		System.out.println(currentrow.getText());
		
			tablerow =Table.findElement(By.tagName("tr")).getSize();
		System.out.println();
	}
		
		
	}

}
