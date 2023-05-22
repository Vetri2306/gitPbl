package Com_Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.Baseclass3;

public class RightClick extends Baseclass3{
	@Test
	public void TC() {
		driver.get("https://the-internet.herokuapp.com/context_menu");
		WebElement context = driver.findElement(By.xpath("//*[@id='hot-spot']"));
		act.moveToElement(context).contextClick().build().perform();
		
	}
	
}
////*[@class='tooltip-inner']