package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		//locators by id()
		
		driver.findElement(By.id("username")).sendKeys("admin");
		
		//locators by name()
		
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		//locators by className()
		
		driver.findElement(By.className("initial")).click();
		Thread.sleep(1000);
		
		//locators by linkText()
		
		driver.findElement(By.linkText("View Time-Track")).click();
		
		//locators by PartialLinktext()
		
		driver.findElement(By.partialLinkText("View Time")).click();

	}

}
