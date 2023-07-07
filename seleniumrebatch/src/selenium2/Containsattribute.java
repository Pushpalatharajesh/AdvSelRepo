package selenium2;

import java.awt.Checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Containsattribute {

	public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();

	driver.get("https://www.facebook.com/login/");
	
	//xpath by contains Attribute
	/*WebElement size = driver.findElement(By.xpath("//img[contains(@class,'vu img')]"));
	
    //cssValue(webelement) 
	Thread.sleep(1000);
	String data =  size.getCssValue("font-size");
      System.out.println(data);
      
      WebElement value1 = driver.findElement(By.xpath("//input[contains(@placeholder,'Email address or phone number')]"));
   String data1 = value1.getCssValue("color");
   System.out.println(data1);
      
      
      //getRect()
      
      WebElement rect = driver.findElement(By.xpath("//input[contains(@placeholder,'Email address or phone number')]"));
     Rectangle value = rect.getRect();
     System.out.println(value.getX());
     System.out.println(value.getY());
    System.out.println(value);*/
    
   
    /*driver.get("https://affiliate.flipkart.com/login");
	WebElement font = driver.findElement(By.xpath("//a[contains(@class,'navbar')]"));
	String data = font.getCssValue("font-size");
	System.out.println(data);*/
/*	WebElement val = driver.findElement(By.xpath("//input[@type='text']"));
	String access = val.getAccessibleName();
	System.out.println( access );		*/
    WebElement DOM = driver.findElement(By.xpath("//input[@type='text']"));
   String valu1 = DOM.getDomAttribute("id");
   System.out.println( valu1);
	}
	

}
