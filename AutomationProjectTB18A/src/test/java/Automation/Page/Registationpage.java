package Automation.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Registationpage {
  static WebDriver driver;
   
   public Registationpage(WebDriver dr)
   {
	   this.driver=dr;
   }
   public void signin() throws InterruptedException
   {
	   driver.findElement(By.id("btn2")).click();
	   Thread.sleep(2000);
   }
   public void register(String fName,String lName,String add,String email,String pn,String langauge,String skill,String country, String pass,String confirmPass) throws InterruptedException {
		
	   
		 driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys(fName);
	
		 driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys(lName);
	
		 driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys(add);
		 
		 driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys(email);
		 
		
		 driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys(pn);
		
		 driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]/input")).click();
		
		 driver.findElement(By.xpath("//input[@id='checkbox2']")).click();
		 Thread.sleep(2000);
		
		 WebElement we = driver.findElement(By.xpath("//*[@id=\"msdd\"]"));
		 we.click();
		 driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[8]/a")).click();
		 driver.findElement(By.xpath("//*[@id=\"section\"]/div/div")).click();
		
		
		 driver.findElement(By.xpath("//*[@id=\"Skills\"]")).sendKeys(skill);
		Thread.sleep(2000);
       driver.findElement(By.id("countries")).click();
       
		 driver.findElement(By.cssSelector("span[role='combobox']")).click();
		 WebElement input = driver.findElement(By.cssSelector("input[role='textbox']"));
		 input.sendKeys("india");
		 input.sendKeys(Keys.ENTER);
		
		 WebElement year = driver.findElement(By.id("yearbox"));
		Select s = new Select(year);
		s.selectByValue("1998");
		
		WebElement month = driver.findElement(By.cssSelector("select[placeholder='Month']"));
		Select s1 = new Select(month);
		s1.selectByValue("October");

		WebElement day = driver.findElement(By.cssSelector("select[ng-model='daybox']"));
		Select s2 = new Select(day);
		s2.selectByIndex(10);
		
		driver.findElement(By.id("firstpassword")).sendKeys(pass);
		
		 driver.findElement(By.id("secondpassword")).sendKeys(confirmPass);
		
		 driver.findElement(By.id("submitbtn")).click();
		 
	}

}
