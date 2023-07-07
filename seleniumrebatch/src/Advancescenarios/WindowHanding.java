 package Advancescenarios;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHanding {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.findElement(By.linkText("Open New Seperate Windows")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		Set<String> windw = driver.getWindowHandles();
		for(String str:windw)
		{
			driver.switchTo().window(str);
			String title = driver.getTitle();
			System.out.println(title);
			if(title.contains("Selenium"))
			{
				break;
			}
		}
		driver.findElement(By.xpath("//a[text()='Get Tickets']")).click();
		Set<String> windw1 = driver.getWindowHandles();
		for(String str:windw1)
		{
			driver.switchTo().window(str);
			String title = driver.getTitle();
			System.out.println(title);
			if(title.contains("Frames & windows"))
			{
				break;
			}
		}
		
		

	}

}
