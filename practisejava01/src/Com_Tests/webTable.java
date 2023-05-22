package Com_Tests;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Base.Baseclass3;

public class webTable extends Baseclass3 {
	
	public void TC1(){
	driver.get("https://letscode.in/advancedtable");

	ArrayList<String[]> resArr = new ArrayList<String[]>();

	int page = 2;


	WebElement table = driver.findElement(By.id("advancedtable"));
	WebElement tbody = table.findElement(By.xpath("//tbody"));

	while(true){
		
 List<WebElement> trList = tbody.findElements(By.tagName("tr"));
for (WebElement ele : trList) {

 String[] trData = new String[4];

int idx = 0;

List<WebElement> tdList = ele.findElements(By.tagName("td"));

	for (WebElement eleTd : tdList) {
		

trData[idx] = eleTd.getText();

	idx++;
 }
resArr.add(trData);

}

if (resArr.size() == 47) {

break;

} else {

	driver.findElement(By.xpath("//a[normalize-space()='" + page + "']")).click();

	page++;

	 }
 }
	assertEquals(resArr.size(), 47);
	driver.quit();
	
	}
}

