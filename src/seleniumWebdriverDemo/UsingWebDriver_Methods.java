package seleniumWebdriverDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class UsingWebDriver_Methods
{

	public static void main(String[] args) 
	{
//		ChromeOptions options = new ChromeOptions();

//		options.addArguments("-lang= zh");

//		ChromeDriver driver = new ChromeDriver(options);



//		Read more: https://softwaretestingboard.com/q2a/2347/how-to-change-the-language-of-the-browser-selenium-webdriver#ixzz6xQOBDZqH
		
	WebDriver drivers=new ChromeDriver();
		
		drivers.manage().window().maximize();
//		drivers.get("https://www.facebook.com/");
		drivers.navigate().to("https://mail.google.com/mail/");
		drivers.navigate().back();
		drivers.navigate().forward();
		drivers.navigate().refresh();
		drivers.close();
		
	}

}
