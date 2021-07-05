package seleniumWebdriverDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UsingKeyboardActions
{

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/webhp?authuser=1");
		
		driver.findElement(By.name("q")).sendKeys("Selenium Webdriver");
		Actions a=new Actions(driver);
		a.sendKeys(Keys.ENTER).perform();

	}

}
