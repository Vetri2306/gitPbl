package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import bind.Hook;


public class petstorelogin extends Hook {

	public static void signin() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='Sign In']")).click();
		Thread.sleep(3000);
		}
	
	public static void loginusername(String string) {
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(string);
	
	}
	public static void loginpassword(String string) {
		driver.findElement(By.xpath("//form/p[2]/input[2]")).sendKeys(string);
	}
	public static void loginbtn() {
		driver.findElement(By.xpath("//input[@name='signon']")).click();
	}
}
