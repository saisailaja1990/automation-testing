package seleniumWebdriverDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Usingidlocator
{

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement txt=driver.findElement(By.id("twotabsearchtextbox") );
		txt.sendKeys("bangles");
		WebElement btn=driver.findElement(By.id("nav-search-submit-button"));
		btn.click();	
	}

}
