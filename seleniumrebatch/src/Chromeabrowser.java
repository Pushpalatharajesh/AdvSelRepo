import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chromeabrowser {

	public static void main(String[] args) {
	WebDriver driver;
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver(); 
	
	driver.get("https://demo.actitime.com/login.do");
	

	}

}
