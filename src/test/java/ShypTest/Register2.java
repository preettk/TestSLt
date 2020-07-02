package ShypTest;

import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.RegisterUser;
import PageObjects.loginPage;
import Resources.base;

public class Register2 {

	@Test
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "//Users//harpreetkaur//Desktop//auto//chromedriver");
	 WebDriver driver = new ChromeDriver();
		
	driver.get("https://pitneybowes.shyplite.com/register");	
	driver.manage().window().maximize();	
	driver.findElement(By.id("name")).sendKeys("helloo User");
	driver.findElement(By.id("email")).sendKeys("helloo@test.com");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("hello43422o");
	driver.findElement(By.id("contact")).sendKeys("10000000");
	driver.findElement(By.xpath("//button[contains(text(),'Register')]")).click();
	System.out.println("Registered successfully");
	driver.close();
	}

	
}