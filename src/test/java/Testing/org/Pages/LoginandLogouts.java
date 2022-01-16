package Testing.org.Pages;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginandLogouts  {

public 	ChromeDriver d;
public	Properties pr ; 
	
	
	public LoginandLogouts(ChromeDriver d , Properties pr )

	{
		
	this.d = d; 
	
	this.pr = pr ;	
	
	}
	
	public void signup(String username , String pass ,String Emailid)
	{
		d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		d.findElement(By.xpath(pr.getProperty("Clickonwebsite"))).click();
		
		

		d.findElement(By.xpath(pr.getProperty("EmailId"))).sendKeys(Emailid);
		d.findElement(By.xpath(pr.getProperty("Username"))).sendKeys(username);
		
		d.findElement(By.xpath(pr.getProperty("Password"))).sendKeys(username);

		d.findElement(By.xpath(pr.getProperty("Submit"))).click();
		
		
		
		
		
		
	
		
	}
	
		
	}

