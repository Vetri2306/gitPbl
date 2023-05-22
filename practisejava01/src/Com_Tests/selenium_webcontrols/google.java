package Com_Tests;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Base.Baseclass3;

public class google extends Baseclass3{

	
	@Test
	public void go(String keyword) {
		driver.get("https://www.google.com/");
		////*[@aria-label='Got it, thanks']
		WebElement pops = driver.findElement(By.xpath("//*[@aria-label='Got it, thanks']"));
		act.sendKeys(pops, keyword).sendKeys(Keys.ENTER).build().perform();
		Reporter.log(keyword);
		
	}
	
}
