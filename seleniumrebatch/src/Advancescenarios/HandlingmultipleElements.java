package Advancescenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HandlingmultipleElements {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new EdgeDriver();
		Thread.sleep(1000);
/*		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
		 
		int count=0;
		
		for(WebElement wb:alllinks)
		{
			System.out.println(wb.getText());
			count++;
		}
		System.out.println("total number of links:"+count);				*/
		
		driver.get("https://www.amazon.com/");
		List<WebElement> AllLinks = driver.findElements(By.xpath("//a"));
		int countt=0;
		
		for(WebElement wb1:AllLinks)
		{
			System.out.println(wb1.getText());
			countt++;
		}
		System.out.println("total number of links:"+countt);
		}

	}


