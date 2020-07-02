package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {

	public WebDriver driver;

	By email = By.name("emailID");
	By password = By.xpath("//input[@id='password']");
	By login= By.xpath("//button[contains(text(),'Log In')]");
	
	public loginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement getEmail() {
		return driver.findElement(email);
	}
	
	public WebElement getpassword() {
		return driver.findElement(password);
	}
	
	public WebElement getlogin() {
		return driver.findElement(login);
	}
	
	
	
}
