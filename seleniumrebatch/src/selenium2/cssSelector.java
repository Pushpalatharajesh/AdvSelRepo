package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelector {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
	
		//cssSelector using id()---> [Attributename='attribute value']
		
driver.findElement(By.cssSelector("[id='username']")).sendKeys("admin");

//cssSelector using htmltag[Attributename='attributevalue']

driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");

//cssSelector using class()-----> [Attributename='attribute value']

driver.findElement(By.cssSelector("[class='initial']")).click();
}
}