package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Bindingspet.Hooks;

public class jpethomepage extends Hooks {

	public static void home() {
		WebElement signin = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/a[2]"));
		signin.click();
	}

	public static void user() {
		WebElement username = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/a[2]"));
		username.sendKeys("j2ee");
	}

	public static void pass() {

		WebElement password = driver.findElement(By.xpath("/html/body/div[2]/div/form/p[2]/input[1]"));
		password.sendKeys("j2ee");

	}
	public static void login() {

		WebElement login = driver.findElement(By.xpath("(//form/input[@type='submit'])[2]"));
		login.click();

	}

	public static void Fish() {
		WebElement fish = driver.findElement(By.xpath("//img[@src='../images/fish_icon.gif']"));
		fish.click();

	}
	public static void F1() {
		WebElement F1 = driver.findElement(By.xpath("/html/body/div[2]/div[2]/table/tbody/tr[2]/td[1]/a"));
		F1.click();

	}
	public static void Est() {
		WebElement Est = driver.findElement(By.xpath("/html/body/div[2]/div[2]/table/tbody/tr[2]/td[1]/a"));
	   Est.click();

	}
	public static void adds() {
		WebElement adds = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a"));
		adds.click();

	}
	public static void Proceed() {
		WebElement proceed = driver.findElement(By.xpath("//a[text()='Proceed to Checkout']"));
		proceed.click();

	}
	
	public static void conti() {
		WebElement conti = driver.findElement(By.xpath("/html/body/div[2]/div/form/input"));
		conti.click();
	}

		public static void confirm() {
			WebElement confirm = driver.findElement(By.xpath("//a[text()='Confirm']"));
			confirm.click();

	}
		public static void Birds() {
			WebElement Birds = driver.findElement(By.xpath("/html/body/div[1]/div[4]/a[5]/img"));
			Birds.click();
		}
		public static void Av() {
			WebElement Av = driver.findElement(By.xpath("/html/body/div[2]/div[2]/table/tbody/tr[2]/td[1]/a"));
			Av.click();
		}
		public static void Add() {
			WebElement Add = driver.findElement(By.xpath("/html/body/div[2]/div[2]/table/tbody/tr[2]/td[5]/a"));
			Add.click();
		}
		public static void checkout() {
			WebElement checkout = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/a"));
			checkout.click();
		}
		
		public static void contin() {
			WebElement contin = driver.findElement(By.xpath("/html/body/div[2]/div/form/input"));
			contin.click();
		}
		
		public static void confirmtwo() {
			WebElement confirmtwo = driver.findElement(By.xpath("/html/body/div[2]/div[2]/a"));
			confirmtwo.click();
		}
}
