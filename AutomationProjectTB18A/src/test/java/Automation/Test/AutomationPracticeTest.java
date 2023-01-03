package Automation.Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


import Automation.Page.Frames;

public class AutomationPracticeTest {
	WebDriver driver;
	Properties pro;

	@BeforeSuite
	public void openBrowser() throws IOException
	{
		System.out.println("Hello Selenium");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anike\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
	}
	
	@BeforeTest
	public void enterUrl() throws IOException
	{
		pro=new Properties();
		FileInputStream fil=new FileInputStream("C:\\Users\\anike\\git\\AutomationPracticeTB18A\\AutomationProjectTB18A\\src\\test\\resources\\Url.txt");
		pro.load(fil);
		driver.get(pro.getProperty("url"));
	}
	
	@BeforeClass
	public void maximize()
	{
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	}
	
	@BeforeMethod
	public void getCookies()
	{
		Set<Cookie> cok=driver.manage().getCookies();
		int ttlcok=cok.size();
		System.out.println(ttlcok);
	}
	
	@Test
	public void FramesTest()
	{
		driver.navigate().to("https://demo.automationtesting.in/Frames.html");
		Frames fr=new Frames(driver);
		fr.Frame1();
		fr.Frame2();
	}
	
	@AfterMethod
	public void captureScreenshot() throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\anike\\OneDrive\\Desktop\\Selenium\\Screenshot\\Ap.png"));	
		System.out.println("SS");
    }
	
	@AfterClass
	public void deleteCookies()
	{
		driver.manage().deleteAllCookies();
	}
	
	@AfterTest
	public void dbClose()
	{
		System.out.println("DB close");
	}
	
	@AfterSuite
	public void browserClose()
	{
		//driver.close();
	}
	

}
