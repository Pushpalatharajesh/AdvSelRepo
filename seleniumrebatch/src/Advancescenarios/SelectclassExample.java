package Advancescenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectclassExample {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new EdgeDriver();
		Thread.sleep(1000);
driver.get("https://www.facebook.com/login/");
driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
WebElement daylist = driver.findElement(By.id("day"));
Thread.sleep(1000);


//selectByIndex()---> index starts from 0
Select sel=new Select(daylist);
sel.selectByIndex(5);

WebElement monthlist = driver.findElement(By.id("month"));
Select sele=new Select(monthlist);
sele.selectByValue("4");

WebElement yearlist = driver.findElement(By.id("year"));
Select selec=new Select(yearlist);
selec.selectByVisibleText("2023");


	}

}
