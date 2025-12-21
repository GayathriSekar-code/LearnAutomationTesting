package week2.day1.BasicLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocators{
	
	public static void main(String[] args) {
		/**
		 * steps to interact with the web element
		 * 
		 */
		
		ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		
		//load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//maximize the web page
		driver.manage().window().maximize();
		
		//enter username
		driver.findElement(By.id("username")).sendKeys("democsr2");
		
		//enter password
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		
		//click login
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//click crm/sfa
		driver.findElement(By.partialLinkText("CRM")).click();
	}
	
}