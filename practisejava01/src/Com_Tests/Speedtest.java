package Com_Tests;

import Base.Baseclass2;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
public class Speedtest extends Baseclass2{
	
	public void TC1() {
		driver.get("https://www.speedtest.net/");
		WebElement GoBttn = driver.findelement(By.xpath("//div[contain(test(),'RUN SPEED TEST')]"));
				GoBttn.click();
		
		wait.until(ExpectedConditions.visibilityofElementLocated(By.xpath("/html/body/div[7]/div/div[10]/div/div[2]/div[2]/div/div/div[1]/div/block-component/div/div[1]/div/div/div/div[1]/div/div/div/div/div[2]/div/div/g-raised-button/div")));
		WebElement ResultIDdata
		System.out.println(resultdata);
		
		
	
	}
	

}
