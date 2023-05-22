package pack1;

import org.openqa.selenium.By;

import bind.Hook;

public class bird extends Hook {

	public static void click() {
		driver.findElement(By.xpath("//img[@src='../images/birds_icon.gif']")).click();
	}
	public static void  select() {
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")).click();
	}
	public static void selctest() {
		driver.findElement(By.xpath("//a[@class='Button']")).click();
	}
	public static void proceed() {
		driver.findElement(By.xpath("//*[@id=\"Cart\"]/a")).click();
	}
	public static void cont() {
		driver.findElement(By.xpath("//input[@name='newOrder']")).click();
	}
	public static void confirm() {
		driver.findElement(By.xpath("//a[@class='Button']")).click();
	}
}
