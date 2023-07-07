package Popups;

import java.time.Duration;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FileuploadPopups {

	public static void main(String[] args) throws Throwable {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.monsterindia.com//");
		driver.findElement(By.xpath("//div[@class='heroSection-buttonContainer_secondaryBtn__text']")).click();
		//WebElement data = driver.findElement(By.xpath("//input[@type='file']"));
		Thread.sleep(1000);
		WebElement data = driver.findElement(By.xpath("//button[@class='line-btn']"));
		//WebElement data = driver.findElement(By.id("file-upload"));
		data.sendKeys("C:\\Users\\Lenovo\\Downloads.txt");
		System.out.println("uploaded successfully");

	}

}
