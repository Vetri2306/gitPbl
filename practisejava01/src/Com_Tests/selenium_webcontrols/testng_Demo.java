package Com_Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import Base.Baseclass3;

public class testng_Demo extends Baseclass3 {
		
		
		@Test
		public void test()
		{
			
			
			driver.get("http://demo.guru99.com/test/newtours/index.php");
			WebElement username = driver.findElement(By.xpath("//*[@name='userName']"));
			username.sendKeys("tutorial");
			
			WebElement password = driver.findElement(By.xpath("//*[@name='password']"));
			password.sendKeys("tutorial");
			
		 // Write the automation login code with username = tutorial and password = tutorial
		}

	}