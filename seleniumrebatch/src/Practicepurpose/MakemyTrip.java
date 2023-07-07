package Practicepurpose;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class MakemyTrip {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.makemytrip.com/");
		/*driver.findElement(By.xpath("//span[text()='From']")).click();
		 driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("New Delhi");
		 List<WebElement> list = driver.findElements(By.xpath("//ul[@class='react-autosuggest__suggestions-list']"));
for(WebElement wb:list)
{
	
	if(wb.getText().contains("New Delhi"))
	{
		Thread.sleep(1000);
		wb.click();
		break;
	}
} */
		driver.findElement(By.xpath("//span[text()='To']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("New Delhi");
		List<WebElement> list1 = driver.findElements(By.xpath("//div[@role='listbox']"));
		for(WebElement wb1:list1)
		{
			if(wb1.getText().contains("New Delhi"))
			{
				wb1.click();
				break;
			}
		}
		
	}

}
