package AutomationCore;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Utility.PageUtility;

public class BaseClass {

	public WebDriver driver;
	
	public WebDriver BrowserInitialization(String browsername)	{
		
		if(browsername.equalsIgnoreCase("Chrome"))
		{
		
			System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Selenium_Java\\Billing\\src\\main\\resources\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		else if(browsername.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "D:\\Automation\\Selenium_Java\\Billing\\src\\main\\resources\\Drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browsername.equalsIgnoreCase("Edge"))
		{
			System.setProperty("webdriver.msedge.driver", "D:\\Automation\\Selenium_Java\\Billing\\src\\main\\resources\\Drivers\\msedgedriver.exe");
			driver=new EdgeDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		return driver;
		
		}

		public  String  RandomNameCreation(String randomname) 
		{
		Random random = new Random();
		int num = random.nextInt(10000);
		String newname = randomname+num;
		return newname;
		}
		
	
	
}