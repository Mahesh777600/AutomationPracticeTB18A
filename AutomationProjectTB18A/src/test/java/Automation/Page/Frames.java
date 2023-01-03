package Automation.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Frames {
	WebDriver driver;
	public Frames(WebDriver driver)
	{
		this.driver=driver;
	}
	By sf=By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[1]/a");
	By frm1=By.xpath("/html/body/section/div/div/div/input");
	
	public void Frame1()
	{
		driver.findElement(sf).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"singleframe\"]")));
		driver.findElement(frm1).sendKeys("Aniket");
		driver.switchTo().defaultContent();
	}
    
	By mf=By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a");
	By frm2=By.xpath("/html/body/section/div/div/div/input");
	
	public void Frame2()
	{
		driver.findElement(mf).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe")));
		driver.switchTo().frame(driver.findElement(By.xpath("/html/body/section/div/div/iframe")));
		driver.findElement(frm2).sendKeys("CJC");
		driver.switchTo().defaultContent();
	}

}
