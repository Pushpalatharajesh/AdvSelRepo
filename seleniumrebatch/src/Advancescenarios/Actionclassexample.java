package Advancescenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclassexample {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
/*	    driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement data = driver.findElement(By.xpath("//div[text()='Home']"));
		
		
		// moveToElement--> cursor will move to particular web element
		Actions act=new Actions(driver);
		act.moveToElement(data).perform();
		Thread.sleep(1000);
		
		// contextClick()-->To right click on particular webelement
		act.contextClick(data).perform();														*/
		
		
/*		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement click = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	
		//for doubleclick action on element
		Actions act=new Actions(driver);
		act.doubleClick(click).perform();									*/										
		
/*		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop= driver.findElement(By.id("droppable"));
		
		//dragAndDrop --> used to perform drag n drop action on webelement
		
		Actions act=new Actions(driver);
		Thread.sleep(1000);
		act.dragAndDrop(drag, drop).perform();				*/
		
		//sendKeys() method in Actions class
		
		driver.get("https://demo.actitime.com/login.do");
		WebElement data = driver.findElement(By.id("username"));
		WebElement pass = driver.findElement(By.name("pwd"));
		Thread.sleep(1000);
		Actions act=new Actions(driver);
		//act.sendKeys(data, "admin").perform();
		//act.sendKeys(pass, "manager").perform();
		
		// build() function of Actions class used to perform more than one action n executing it in a sequence
		act.sendKeys(data, "admin").sendKeys(pass, "manager").build().perform();
									
		
	}

}
