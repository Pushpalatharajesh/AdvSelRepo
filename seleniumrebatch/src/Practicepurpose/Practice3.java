package Practicepurpose;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Practice3 {

	public static void main(String[] args) throws Throwable {
	
	Thread.sleep(1000);
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver(options);
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://www.google.com/");
	driver.findElement(By.name("q")).sendKeys("bangalore");
	List<WebElement> list = driver.findElements(By.tagName("span"));
	for(WebElement wb:list)
	{
		wb.getText();
		if(wb.getText().contains("Bangalore University"))
		{
			wb.getText();
			break;
		}
	}
	
	
	
/*	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	driver.findElement(By.name("q")).sendKeys("mobile");
	List<WebElement> suggestions = driver.findElements(By.xpath(" //ul[@class='col-12-12 _1MRYA1 _38UFBk']/child::span"));
        for(WebElement wb:suggestions)
        {
        	String text = wb.getText();
        	if(text.contains(" holder"))
        			{
        		      wb.click();
        		      break;
        			}
        }										
/*	driver.get("https://www.amazon.com/");
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("realme");
	List<WebElement> auto = driver.findElements(By.xpath("//div[@class='nav-issFlyout nav-flyout']/child::div"));
	
	
	
	for(WebElement wbe:auto)
	{
		String text1 = wbe.getText();
		Thread.sleep(1000);
		if(text1.contains(" 10 pro plus  "))
		{
		
			wbe.click();
			break;
		} 
	}     */
		
	}

}
