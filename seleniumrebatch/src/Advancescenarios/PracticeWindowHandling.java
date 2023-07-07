package Advancescenarios;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PracticeWindowHandling {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.get("www.google.com");
		driver.get("https://www.naukri.com/mnjuser/homepage");
		driver.findElement(By.xpath("//div[text()='Services']")).click();
		Set<String> wind1 = driver.getWindowHandles();
		for(String handling:wind1)
		{
			driver.switchTo().window(handling);
			String title = driver.getTitle();
			System.out.println(title);
			if(title.contains("Resume Writing Services - CV - Bio data | Naukri Fastforward"))
			{
				
				break;
			}
			
		}
		Set<String> wind2 = driver.getWindowHandles();
		for(String handling:wind2) 
		{
			driver.switchTo().window(handling);
			String title = driver.getTitle();
			System.out.println(title);
			if(title.contains("Jobseeker's Login: Search the Best Jobs available in India & Abroad - Naukri.com"))
			{
				break;
			}
			
		}

	}

}
