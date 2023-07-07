 package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelementmethaod1 {
	

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		//sendKeys() and clear() 
		
		//WebElement UN = driver.findElement(By.id("username"));
		//UN.sendKeys("admin");
		Thread.sleep(1000);
		//UN.clear();
		
		
		//getCssValue()
	/*	WebElement font = driver.findElement(By.xpath("//div[@class='atProductName']"));
		String size = font.getCssValue("font-size");
		System.out.println( size);
		
		WebElement color = driver.findElement(By.id("username"));
		String data = color.getCssValue("color");
		System.out.println(data);
		
		//getLocation()
		WebElement log = driver.findElement(By.xpath("//div[text()='Login ']"));
		Point loc = log.getLocation();
		System.out.println(loc);*/
		
		//getSize()
	/*	WebElement size = driver.findElement(By.xpath("//div[text()='Login ']"));
		Dimension value = size.getSize();
		System.out.println( value);
		 
		 
		//isDisplayed
		/*WebElement data1 = driver.findElement(By.xpath("//div[@class='atLogoImg']"));
		if(data1.isDisplayed())
		{
			System.out.println("logo is displayed");
		}
		else
		{
			System.out.println("logo is not displayed");
		}*/
		
			
			//isEnabled
		
			/* WebElement data2 = driver.findElement(By.id("username"));
			 if(data2.isEnabled())
			 {
				 data2.sendKeys("admin");
			 }
			 else
			 {
				 System.out.println("not enabled");
			 }*/
		
			//isSelected()
		
			/*WebElement data3 = driver.findElement(By.id("keepLoggedInCheckBox"));
			data3.click();
			if(data3.isSelected())
			{
				System.out.println("checked");
			}
			else
			{
				System.out.println("unchecked");
			}*/
		
		//getAttribute(it gives attribute value when we write attributename)
		
		/*WebElement data4 = driver.findElement(By.xpath("//input[@placeholder='Username']"));
			String value = data4.getAttribute("placeholder");
			System.out.println( value);
			String value1 = data4.getAttribute("type");
			System.out.println(value1);
			
			WebElement data5 = driver.findElement(By.name("pwd"));
			String value2 = data5.getAttribute("name");
			System.out.println(value2);
			String value3 = data5.getAttribute("type");
			System.out.println(value3);*/
		
		//getTagName()----> it is nothing but htmltag
		
/*		WebElement ID = driver.findElement(By.id("username"));
		String idvalue = ID.getTagName();
		System.out.println(idvalue);
		
		WebElement IDValue = driver.findElement(By.id("keepLoggedInLabel"));
		 String idvalue2 = IDValue.getTagName();
		 System.out.println(idvalue2);  	*/
		
		//getAccessibleName()--> it shows text in the textbox field
/*		WebElement access = driver.findElement(By.name("username"));
		String val = access.getAccessibleName();
		System.out.println(val);
		WebElement pass = driver.findElement(By.name("pwd"));
		String val1 = pass.getAccessibleName();
		System.out.println(val1);			*/
		
		//getDomAttribute()-->used to capture attribute value from DOM and applicable only for textfield
		
 /*       WebElement DOM = driver.findElement(By.className("textField"));
		String domvalue = DOM.getAttribute("class");
		System.out.println( domvalue);
		String domvalue1 = DOM.getDomAttribute("placeholder");
		System.out.println(domvalue1);	
		
		//getDomProperty()--> used to capture attribute property value from DOM & applicable only for textfield
		
		WebElement DOM1 = driver.findElement(By.className("textField"));
		String domproperty = DOM1.getDomProperty("name");
		System.out.println(domproperty);	
			*/
		//getAriaRole()--> It shows the what type of textfield is? textbox or checkbox or button(link)
	/*	WebElement check = driver.findElement(By.id("keepLoggedInCheckBox"));
		System.out.println( check.getAriaRole());
		WebElement check1 = driver.findElement(By.name("username"));
		System.out.println( check1.getAriaRole());
		
		*/
		
		
		
			}

}
