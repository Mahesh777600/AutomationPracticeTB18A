package Automation.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Commons {

	public static WebDriver driver;
	
	
	public static void openChrome()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		   driver = new ChromeDriver();
		
	}
	public static void maximize()
	{
		driver.manage().window().maximize();
	}
	public static void url()
	{
		driver.get("https://demo.automationtesting.in/Register.html");
	}
	
}
