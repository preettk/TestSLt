package ShypTest;

import java.io.IOException;

import org.apache.logging.log4j.Logger;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import PageObjects.loginPage;
import Resources.base;

public class LoginTest extends base{

public static Logger log = org.apache.logging.log4j.LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void launchBr() throws IOException {
		driver=initializeDriver();
		log.info("driver initialized");
		driver.get(prop.getProperty("url_login"));
		log.info("url working");
		driver.manage().window().maximize();
	}
	
	@Test(dataProvider="getData")
	public void LoginPageTest(String email,String password) throws IOException {
		loginPage lp =new loginPage(driver);
		lp.getEmail().sendKeys(email);
		lp.getpassword().sendKeys(password);
		lp.getlogin().click();
		log.info("Login successful");
		
	}
	
	@AfterTest
	public void closebr() {
		driver.close(); 
	}

	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[1][2];
		data[0][0] ="validemailaddr@email.com"; //first set of valid data
		data[0][1]="123244thisispwd";
		/*data[1][0]="notvalidemailaddr@email.com"; // invalid data
		data[1][1]="pwdd12323";*/
		return data;
	}
	
}
