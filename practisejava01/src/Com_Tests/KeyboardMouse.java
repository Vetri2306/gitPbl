package Com_Tests;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import Base.BaseClass;




public class KeyboardMouse extends BaseClass{
	@Test
	
	public void DragAndDrop() {
		Driver.get("https://demoqa.com/automation-practice-form");
		WebElement src = driver.findElement(By.id("draggable"));
	    WebElement dest = driver.findElement(By.id("droppable"));
	     act.dragAndDrop(src, dest).build().perform();
	    
	    WebElement DropMsgElement =driver.findElement(By.xpath("//div[@id='droppable']"));
	    String MsgAfterDrop =DropMsgElement.getText();
	    System.out.println(MsgAfterDrop);
	    act.dragAndDrop(src, dest).build().perform();
	    
	    
	    assertEquals(MsgAfterDrop,"Dropped!");
	    
		
	}
	
	@Test
	public void ReadToolTip() {
		driver.get("https://demoqa.com/automation-practice-form");
		WebElement ButtonHoverOnMe = driver.findElement(By.id("toolTipButton"));
		act
		.moveToElement(ButtonHoverOnMe)
		.pause(Duration.ofMillis(0))
		.build().perform();
		
		
		String ExpTextofTooltip = "You hovered over the Button";
		String text = driver.findElement(By.id("tooltip-timer")).getText();
		Assert.assertEquals(text,ExpTextofTooltip);
		
	}
	@Test
	@Ignore
	
	
	public void ScrollingPage() {
		
	}
	
	public void RightClick() {
		
		driver.get("https://demoqa.com/selectable");
		WebElement ContraryLink = driver.findElement(By.linkText())
				
				act
				
		
	}
	public void DoubleClick() {
		driver.get("https://demoqa.com/buttons");
		WebElement DoubleClickbttn = driver.findElement(By.id("doubleclickbttn"));
		
		act.DoubleClick(DoubleClickbttn).build().perform();
		
		String
		
	}
	public void SendingDataInCapsOn() {
		
	}
	public void HoldandRelease() {
		
		driver.get("https://demoqa.com/automation-practice-form");
		
		
		
		
	}
	
	

}
