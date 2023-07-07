package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='ic_circularclose_grey']")).click();
		driver.findElement(By.xpath("(//a[@class='makeFlex hrtlCenter column'])[1]")).click();
		
/*		WebElement font = driver.findElement(By.xpath("//img[@alt='Make My Trip']"));
		String size = font.getCssValue("font-size");
		System.out.println(size);
		WebElement color = driver.findElement(By.xpath("//img[@alt='Make My Trip']"));
		String value = color.getCssValue("color");
		System.out.println(value);					*/
		
/*		WebElement loc = driver.findElement(By.xpath("//span[@class='chNavText darkGreyText reduceMenuSpacing']"));
		Point value1 = loc.getLocation();
		System.out.println( value1);
		System.out.println( value1.getX());
		System.out.println( value1.getY());				*/
		
		  
	}

}
