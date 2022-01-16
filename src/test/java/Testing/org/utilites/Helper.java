package Testing.org.utilites;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;


public class Helper {
	
	 public static ChromeDriver d; 
	 
	 public static Properties pr; 
	 
	 @BeforeClass
	
	 public   static ChromeDriver startBrowser() throws IOException
	 {

	
				
			
			{
		    	System.setProperty("webdriver.chrome.driver", "../Seleniume2e/chromedriver.exe");
				
		    	 d = new ChromeDriver();
				
			}
			
		
	
	
		
		
	
		
		{

			File f = new File ("../Seleniume2e/src/test/java/Objects.properties"); 
			
			FileReader fr = new FileReader(f);
			
			pr = new Properties();
			
		pr.load(fr);
			
			
		}
		return d;
		
	
			
	}
	}


