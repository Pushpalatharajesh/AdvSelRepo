package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) throws Throwable  {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		//xpath by attribute--> //htmltag[@attriname='attrivalue']
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("manager");
		Thread.sleep(1000);
		 
		//xpath by visible_text--> //htmltag[text()='complete visible-text']
		
		//driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		//xpath by containsAttribute--> //htmltag[contains(@attrname,'attrivalue')]
		driver.findElement(By.xpath("//a[contains(@id,'loginButton')]")).click();
		Thread.sleep(1000);
		
		//xpath by contains visible(or partial)text()---> //htmltag[contains(text(),'visibletext')]
		
		driver.findElement(By.xpath("//a[contains(text(),'View Time-Track')]")).click();
		
		
		
			  
		
		

	}

}
