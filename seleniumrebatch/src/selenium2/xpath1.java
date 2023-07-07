package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//div[text()='Electronics']")).click();
		driver.findElement(By.xpath("//div[text()='Fashion']")).click();

		

	}

}
