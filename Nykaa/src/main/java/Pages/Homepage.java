package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Basefolder.Baseclasses;


public class Homepage extends Baseclasses{

	
	
	
	
  public static WebElement fromField =driver.findElement(By.xpath("//input[@role='searchbox']"));
	
  public static WebElement tofield=driver.findElement(By.xpath("//*[@aria-controls='pr_id_2_list']"));	
	
  public static WebElement dob =driver.findElement(By.xpath("//*[@class='ng-tns-c58-10 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']"));
	////*[@style='width: 100%;']
	
  public static WebElement allClasses =driver.findElement(By.xpath("//*[@class='ng-tns-c65-12 ui-dropdown ui-widget ui-state-default ui-corner-all']"));
  
  public static WebElement nex =driver.findElement(By.xpath("//*[@class='ng-tns-c65-12 ui-dropdown ui-widget ui-state-default ui-corner-all']"));
  
}
