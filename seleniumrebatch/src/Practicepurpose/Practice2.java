package Practicepurpose;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Practice2 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		Thread.sleep(1000);
		driver.get("https://www.makemytrip.com/");
		//driver.findElement(By.xpath("//span[@class='ic_circularclose_grey']")).click();
		//driver.findElement(By.xpath("//div[@class='fsw_inputBox searchCity inactiveWidget ']")).click();
		 //driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		 
		WebElement click = driver.findElement(By.xpath("//span[text()='Cabs ']"));
		
		
		Actions act=new Actions(driver);
		Thread.sleep(1000);
		act.moveToElement(click).perform();
		act.contextClick(click);
		 

		
		
	}

}
