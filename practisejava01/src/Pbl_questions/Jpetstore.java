package Pbl_questions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Jpetstore {

	public static String URL = "https://jpetstore.aspectran.com/catalog/";

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(URL);
		

		WebElement fish=driver.findElement(By.xpath("/html/body/section/div[2]/div[2]/div[2]/div[1]/div/a[1]"));
		fish.click();
	
		WebElement fi=driver.findElement(By.xpath("/html/body/section/div[2]/div[2]/div[2]/table/tbody/tr[5]/td[1]/a"));
		fi.click();
		
		WebElement Es=driver.findElement(By.xpath("/html/body/section/div[2]/div[2]/div[2]/table/tbody/tr[3]/td[1]/a"));
         Es.click();

        WebElement Atc=driver.findElement(By.xpath("//html/body/section/div[2]/div[2]/div[2]/div/a"));
        Atc.click();
        
        //get sum total value
        String Sum=driver.findElement(By.xpath("/html/body/section/div[2]/div[2]/div[2]/div[1]/form/table/tbody/tr[3]/td[4]/strong")).getText();
        System.out.println(Sum);
        
        
        
        
	}
}
