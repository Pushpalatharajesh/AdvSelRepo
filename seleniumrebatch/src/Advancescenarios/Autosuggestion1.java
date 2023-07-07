package Advancescenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion1 {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		
	driver.get("https://www.amazon.com/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("realme");
		List<WebElement> list = driver.findElements(By.tagName("div"));
		Thread.sleep(1000);
		for( WebElement wb: list)
		{
			if(wb.getText().contains(" 10 pro"))
			{
				Thread.sleep(1000);
				wb.click();
				break;
			}
		}							
/*		driver.get("https://www.google.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("selenium ");
		List<WebElement> list1 = driver.findElements(By.tagName("div"));
		for(WebElement wb: list1)
		{
			if(wb.getText().contains(" python"))
			{
				Thread.sleep(1000); 
				wb.click();
				break;
			}    
		}																		*/
		
		
		
	}

}
