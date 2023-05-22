package pack1;

import org.openqa.selenium.By;

import bind.Hook;

public class fishproduct extends Hook{

	public static void click() throws InterruptedException {
		driver.findElement(By.xpath("//img[@src='../images/fish_icon.gif']")).click();
		Thread.sleep(3000);
	}
	public static void  select() throws InterruptedException {
		driver.findElement(By.xpath("//a[normalize-space()='FI-SW-01']")).click();
		Thread.sleep(3000);
	}
	public static void selctest() {
		driver.findElement(By.xpath("//tbody/tr[2]/td[5]/a[1]")).click();
	}
	public static void proceed() {
		driver.findElement(By.xpath("//a[normalize-space()='Proceed to Checkout']")).click();
	
	}
	public static void cont() {
		driver.findElement(By.xpath("//input[@name='newOrder']")).click();
	}
	public static void confirm() {
		driver.findElement(By.xpath("//a[@class='Button']")).click();
	}
}
