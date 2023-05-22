package Pbl_questions;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Readingdata {

	public static String URL = "http://demo.opencart.com/";
	public static WebDriver driver;
	
	public static void main(String[] args) throws IOException, InterruptedException  {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		//driver.findElement(By.xpath("/html/body/nav/div[2]/div[2]/ul/li[2]/div/a/span")).click();
	//	driver.findElements(By.xpath("/html/body/nav/div[2]/div[2]/ul/li[2]/div/ul/li[2]/a")).click();
		
		System.out.println("Title :"+driver.getTitle());
		
		System.out.println("URL :"+driver.getCurrentUrl());
		//Thread.sleep(3000);
		driver.close();
		System.out.println(GetdataFromPropFile("abc"));
	     
		
	}

public static String GetdataFromPropFile(String key) throws IOException{
	
	String proplocation="/Users/VE20463903/Desktop/eclipse-workspace/Victory/src/main/java/utilities/Testdata.xlsx";
	
	
//	File filecon = new File(locationFile);
	FileInputStream fi = new FileInputStream(proplocation);
	
	XSSFWorkbook workbook = new XSSFWorkbook(fi);
	
	XSSFSheet sheet = workbook.getSheet("Sheet 1");
	
String Vet = sheet.getRow(5).getCell(0).getStringCellValue();

return Vet;
}
	 	
	
}
