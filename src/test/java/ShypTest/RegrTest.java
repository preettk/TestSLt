package ShypTest;

import java.io.IOException;

import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.RegisterUser;
import Resources.base;

public class RegrTest  extends base{
public static Logger log = org.apache.logging.log4j.LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void launchBr() throws IOException { 
		driver=initializeDriver(); 
		log.info("driver initialized");
		driver.get(prop.getProperty("url_reg"));   //launching browser with url
		log.info("url working");
		driver.manage().window().maximize();
	}
	
	@Test(dataProvider="getData")
	public void RegisterPageTest(String name,String email,String password,CharSequence[] contact) throws IOException, InterruptedException {
		RegisterUser Ru =new RegisterUser(driver);
		Ru.getName().sendKeys(name);
		Ru.getEmail().sendKeys(email);
		Ru.getPassword().sendKeys(password);
		Ru.getContact().sendKeys(contact);
		Thread.sleep(3000);
		Ru.getRegister().click();
		log.info("Register successful");
	}
	
	@AfterTest
	public void closebr() {
		driver.close(); 
	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[1][4];
		data[0][0] ="user1 test";  //first set of valid data
		data[0][1]="validemailaddr@email.com";
		data[0][2]="password241";
		data[0][3]="10000099";
		
		return data;
	}
}
