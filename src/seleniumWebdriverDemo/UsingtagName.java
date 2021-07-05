package seleniumWebdriverDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingtagName 
{

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		
		List<WebElement> items=driver.findElements(By.tagName("a"));
		System.out.print("no of links in the page:"+items.size());
	
		for(WebElement link:items)
		{
			System.out.println(link.getText());
		}

	}

}
