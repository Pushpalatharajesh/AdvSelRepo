package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		driver.findElement(By.xpath("//img[@alt='Headsets']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//img[@alt='Make every day your softest']")).click(); 
	}

}
