package Com_Tests;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import  Base.BaseClass;

public class HandleWindow extends BaseClass{
	
	
	public void TC1() {
		 driver.get("https://demoqa.com/selectable");
		 WebElement NewTab = driver.findElement(By.xpath(""));
		 NewTab.click();
		 
		 
		 Set<String> namesofwindows = driver.getWindowHandle();
		 for(String currentwin : namesOfAtWindows) {
			 
			 driver.switchTo().window(currentwindow);
			 System.out.println("window Handle :" + currentwindow);
			 Thread.sleep(2000);
			 System.out.println("window handle : " + currentwindow);
			 System.out.println("window title : " + driver.getCurrentUrl());
			 
			 
		 }
	}
	@Test
	public void test2() {
		driver.get("https://demoqa.com/selectable");
		
		WebElement normalalert = driver.findElement(By.id("alertButton"));
		WebElement timealert = driver.findElement(By.id("timealertButton"));
		WebElement YesorNoalert = driver.findElement(By.id("YesorNoalert"));
		WebElement promptalert = driver.findElement(By.id("promptalert"));
		
		
		
		normalalert.click();
		timealert.click();
	    YesorNoalert.click();
	    promptalert.click();
	    
	   	
	}
	
	
}
