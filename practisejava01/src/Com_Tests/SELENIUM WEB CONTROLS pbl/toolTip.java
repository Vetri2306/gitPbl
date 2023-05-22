package Com_Tests;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import Base.Baseclass3;


public class toolTip extends Baseclass3 {
	
	@Test
	public void TC(){
		driver.get("https://demoqa.com/tool-tips");
		WebElement toolTip = driver.findElement(By.xpath("//*[@id='toolTipButton']"));
		act.moveToElement(toolTip).build().perform();
		
		nil.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='toolTipButton']")));
		WebElement hoverEle = driver.findElement(By.xpath("//*[@id='toolTipButton']"));
		
		assertEquals(hoverEle.getText(), "you hover over the button");
		driver.quit();
			
		
	}
	
}
////*[@id='toolTipButton']
//*[@class='tooltip-inner']