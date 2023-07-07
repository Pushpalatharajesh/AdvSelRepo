package Advancescenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keysclass {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//driver.get("https://demo.actitime.com/login.do");
		
/*		driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
		
		driver.findElement(By.id("username")).sendKeys("admin");
		WebElement password = driver.findElement(By.name("pwd"));
		password.sendKeys("manager");
		password.sendKeys(Keys.ENTER);			
		
		driver.findElement(By.id("username")).sendKeys("admin");
		 driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);						*/
		
		driver.get("https://affiliate.flipkart.com/login");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("pushpa@gmail.com",Keys.TAB,"pushpa");
		
	

	}

}
