package Resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class base {

	
	public WebDriver driver;
	public Properties prop = new Properties();
	public WebDriver initializeDriver() throws IOException  {
		
		FileInputStream fis = new FileInputStream("//Users//harpreetkaur//Desktop//Eclipse_Workspace//ShypliteA//src//main//java//Resources//data.properties");

		prop.load(fis);   
		String browserName=prop.getProperty("browser"); 
	    
		System.out.println(browserName);
	
	try {	
	if(browserName.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "//Users//harpreetkaur//Desktop//auto//chromedriver");
		 driver = new ChromeDriver();     
	}
	else if(browserName.equalsIgnoreCase("firefox"))
	{
		// for firefox browser
		driver = new FirefoxDriver();
	}
	else if(browserName.equalsIgnoreCase("IE") ){
		//IE browser
		System.setProperty("webdriver.ie.driver","//Users//harpreetkaur//Desktop//auto//IEDriverServer.exe");

        driver = new InternetExplorerDriver();
	}}
	catch  (WebDriverException e)

    {

           System.out.println("Browser not found" +e.getMessage());

    }
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
	}
	
	
	
	
}
