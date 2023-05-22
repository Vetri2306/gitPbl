package Com_Tests;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Base.Baseclass3;
public class practiseform  extends Baseclass3{

	@Test
	public void TC1 () throws InterruptedException {
		driver.get("https://demoqa.com/automation-practice-form");
		WebElement firstname = driver.findElement(By.xpath("(//div[@class='col-md-3 col-sm-12']/following-sibling::div)[1]/input"));
		firstname.sendKeys("vetri");
		WebElement Lastname = driver.findElement(By.xpath("(//div[@class='col-md-4 col-sm-6']/following-sibling::div)[2]/input"));
		Lastname.sendKeys("vel");
		////input[@placeholder='name@example.com']
		
		WebElement email = driver.findElement(By.xpath("(//div[@class='col-md-3 col-sm-12']/following-sibling::div)[4]/input"));
		email.sendKeys("vetrri0023@gmail.com");
		
		WebElement gender = driver.findElement(By.xpath("//label[@for='gender-radio-1']"));
		gender.click();
		//////input[@id="userNumber
		
		WebElement mobilenum = driver.findElement(By.xpath("//input[@id='userNumber']"));
		mobilenum.sendKeys("9090909090");
		
		WebElement dob = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
		dob.click();
		WebElement selectmonth = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		Select monthmenu= new Select(selectmonth);
		monthmenu.selectByVisibleText("June");
		
		WebElement selectyear = driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select"));
		Select yearmenu= new Select(selectyear);
		yearmenu.selectByVisibleText("2001");
		
		WebElement date = driver.findElement(By.xpath("((//*[contains(@aria-label,'2001-06')]/div)[4]/div)[7]"));
		date.click();
		
		WebElement subjects = driver.findElement(By.xpath("//*[@id=\"subjectsInput\"]"));
		subjects.sendKeys("Maths");
		subjects.sendKeys(Keys.ENTER);
				
		
		WebElement Hobbies = driver.findElement(By.xpath("//input[@id='hobbies-checkbox-1']"));
		Hobbies.click();
//                              //*[@id='currentAddress']
//		
//		
//		WebElement address = driver.findElement(By.xpath("//*[@id='currentAddress']"));
//		address.sendKeys("TRICHY-02");
	
		
	}
	
}
