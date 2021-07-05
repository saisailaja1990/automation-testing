package seleniumWebdriverDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class namelocator
{

	public static void main(String[] args)
	{
		ChromeOptions chromeOptions = new ChromeOptions();
		 chromeOptions.addArguments("--lang=en");  
		 WebDriver driver = new ChromeDriver(chromeOptions);
//		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Selenium WebDriver");
		

	}

}
