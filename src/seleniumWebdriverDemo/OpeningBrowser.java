package seleniumWebdriverDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpeningBrowser
{
	public static void main(String[] args) 
	{
		
			//System.setProperty("webdriver.gecko.driver","C:\\Program Files\\selenium\\geckodriver.exe");
		
		//WebDriver driver=new FirefoxDriver();
		
		//System.setProperty("webdriver.chrome.driver","C:\\Program Files\\selenium\\chromedriver.exe");
		
		WebDriver drivers=new ChromeDriver();
		drivers.manage().window().maximize();
		drivers.get("https://google.com/");
		 	}

}
