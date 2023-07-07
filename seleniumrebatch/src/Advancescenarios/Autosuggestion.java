 package Advancescenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autosuggestion {

	public static void main(String[] args) throws Throwable {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		Thread.sleep(1000);
		driver.get("https://www.amazon.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		 driver.findElement(By.name("q")).sendKeys("mobile");
		  List<WebElement> list1 = driver.findElements(By.tagName("div"));
		 
		 for(WebElement wb:list1)
		 {
			 if(wb.getText().contains(" covers ")) 
			 { 
				// System.out.println(wb.getText());
				 Thread.sleep(1000);
				 wb.click();
				 break;
			 }
		 }	
	}
 
}
