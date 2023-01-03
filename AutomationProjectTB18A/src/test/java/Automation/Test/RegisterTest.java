package Automation.Test;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Automation.Page.Registationpage;
import Automation.Page.Registerdata;
import Automation.utility.Commons;

public class RegisterTest {
	static Properties pro;
	static Registationpage lp;
	
	
		@BeforeSuite
	 public void dataRegister() throws InterruptedException, IOException {
			
			Commons.openChrome();
			
			Commons.url();
		 lp = new Registationpage(Commons.driver);
			
	 }
		
		
		@Test(dataProvider = "getData")
		public void registerdata(String fName,String lName,String add,String email,String pn,String langauge,String skill,String country, String pass,String confirmPass) throws InterruptedException 
			{
		//	lp.signin();
			lp.register(fName, lName, add, email, pn, langauge, skill, country, pass, confirmPass);
			
			}
		
		@DataProvider
		public Object[][] getData() throws IOException
		{
			return Registerdata.data();
		}
	

	
}
