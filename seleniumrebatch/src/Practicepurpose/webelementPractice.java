package Practicepurpose;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class webelementPractice {
	public static void main(String args[]) {
		WebDriver driver=new EdgeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		
	/*	WebElement data1 = driver.findElement(By.id("username"));
		String value1 = data1.getAccessibleName();
		System.out.println(value1); 
		data1.clear();					
		WebElement data2 = driver.findElement(By.id("username"));
		Point value2 = data2.getLocation();
		System.out.println(value1);     
		WebElement data3 = driver.findElement(By.id("username"));
		String value3 = data3.getAriaRole();
		System.out.println(value3);          
		WebElement data4 = driver.findElement(By.id("username"));
		
		Rectangle value4 = data4.getRect();
		System.out.println(value4);
		System.out.println(value4.getX());
		System.out.println(value4.getY());      
		
		
		WebElement data5 = driver.findElement(By.id("username"));
		String value5 = data5.getAttribute("id");
		System.out.println(value5);    */
		
		
	}
	
	
	

}

