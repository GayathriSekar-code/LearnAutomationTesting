package week2.day1.assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	
	public static void main(String args[]){
		
		ChromeDriver driver = new ChromeDriver();
				
		//load the url
		driver.get("https:www.facebook.com/");
		
		//maximize the web page
		driver.manage().window().maximize();
	
		
			}

}
