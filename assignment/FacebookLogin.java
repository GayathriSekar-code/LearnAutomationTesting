package week2.day1.assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class FacebookLogin{
		public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		//load the url
		driver.get("http://www.facebook.com");
		//maximize the web page
		driver.manage().window().maximize();
		//print name
		String title = driver.getTitle();
		System.out.println(title);
		//enter username
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		//enter password
		driver.findElement(By.name("pass")).sendKeys("Tuna@321");
		//click login
		driver.findElement(By.name("login")).click();
		//click check
		driver.findElement(By.partialLinkText("recaptcha-anchor")).click();

	}
}