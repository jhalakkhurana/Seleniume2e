package Testing.org.TestScripts;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Testing.org.utilites.Helper;
public class Tc1 extends Helper  {
@Test 

public  void abc() throws IOException
{
	
ChromeDriver d = Helper.startBrowser();

}
	@Test
	
	public void login() throws InterruptedException, IOException
	{
	


	
   String url = "https://wordpress.com/" ;
		
		d.get(url);
		Testing.org.Pages.LoginandLogouts l = new Testing.org.Pages.LoginandLogouts(d, pr);
		l.signup("Jhalakkhurana1991@gmail.com", "Jhalak", "wueroiw");
		
	
	
		Thread.sleep(3000);
	String PageTitle = d.getTitle();
	d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	System.out.println("Page Title is --"+PageTitle);
}

}