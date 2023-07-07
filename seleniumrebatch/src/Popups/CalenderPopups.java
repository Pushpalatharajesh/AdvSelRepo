package Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CalenderPopups {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.makemytrip.com/");
		//driver.findElement(By.xpath("//span[text()='Departure']")).click();
		//driver.findElement(By.xpath("//div[text()='March 2023']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='20']")).click();
	//	driver.findElement(By.xpath("//span[text()='Return']")).click();
//driver.findElement(By.xpath("//div[text()='March 2023']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='20']")).click();
driver.findElement(By.xpath("//span[.='Return']")).click();
driver.findElement(By.xpath("(//div[.='April 2023'])[2]/ancestor::div[@class='DayPicker-Month']/descendant::p[.='2']")).click();
	}

}
