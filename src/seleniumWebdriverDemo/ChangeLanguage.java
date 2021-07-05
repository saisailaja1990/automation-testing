package seleniumWebdriverDemo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChangeLanguage 
{

	public static void main(String[] args)
	
	
	{
		ChromeOptions chromeOptions = new ChromeOptions();
		 chromeOptions.addArguments("--lang=en");  
		 WebDriver driver = new ChromeDriver(chromeOptions);
		 driver.get("http://google.com");

		
//		System.setProperty("webdriver.chrome.driver"," C:\\\\Program Files\\\\selenium\\\\chromedriver.exe");
//		ChromeOptions chromeoptions = new ChromeOptions();
		// for japanese language
//		chromeoptions.addArguments("–lang= en");
//		WebDriver driver = new ChromeDriver(chromeoptions);
	
	//	driver.get("https://www.facebook.com");
		
		
//		WebDriver driver = new ChromeDriver();

	}

}
