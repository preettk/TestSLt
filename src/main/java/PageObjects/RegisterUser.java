package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterUser  {
	
	public WebDriver driver;
	By name = By.id("name");
	By email = By.name("email");
	By password = By.xpath("//input[@id='password']");
	By contact = By.id("contact");
	By register= By.xpath("//button[contains(text(),'Register')]");
   

	public RegisterUser(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement getName() {
		return driver.findElement(name);
	}
	
	public WebElement getEmail() {
		return driver.findElement(email);
	}
	
	public WebElement getPassword() {
		return driver.findElement(password);
	}
	
	public WebElement getContact() {
		return driver.findElement(contact);	
	}
	
	public WebElement getRegister() {
		return driver.findElement(register);
	}
	
	
}
