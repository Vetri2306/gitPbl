package Com_Tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Base.Baseclass3;
public class Exception_Handling_JS extends Baseclass3 {

	@Test
	public void Js() {
		driver.get("https://demoqa.com/books");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollheight);");
		
		WebElement selectionMenu = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[2]/span[2]/select"));
		nil.until(ExpectedConditions.visibilityOf(selectionMenu));
		
		Select select = new Select(selectionMenu);
		select.selectByVisibleText("5 rows");
		
		assertEquals(select.getFirstSelectedOption().getText(), "5 rows");
		driver.quit();
	}
	
	
}
