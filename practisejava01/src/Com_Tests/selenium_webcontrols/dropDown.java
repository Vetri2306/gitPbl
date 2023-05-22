package Com_Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.Baseclass3;

public class dropDown extends Baseclass3 {
	@Test
	public void TC () throws InterruptedException {
		driver.get("https://mcqquestions.net/practice/ic-engines-nuclear-power-plants");
		WebElement firstques = driver.findElement(By.xpath("//*[@id='opt2_1445']"));
		firstques.click();
		
		System.out.println("Answer is correct");
		
}

}
