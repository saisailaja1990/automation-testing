package seleniumWebdriverDemo;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsingGetOption_Dropdown
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter category to select from dropdown:");
		String cat=sc.next();
		
		System.out.println("Enter Name of the product:");
		String prod=sc.next();
		Boolean isExist=false;
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		
		WebElement dd=driver.findElement(By.id("gh-cat"));
		Select s=new Select(dd);
		List<WebElement> items=s.getOptions();
		for(WebElement item : items)
		{
			
			String Webcat=item.getText();
			if(Webcat.equalsIgnoreCase(cat))
			{
				isExist=true;
				s.selectByVisibleText(Webcat);
				driver.findElement(By.id("gh-ac")).sendKeys(prod);
				driver.findElement(By.id("gh-btn")).click();
				break;
			}
			
		}
		isExist=false;
		System.out.println("Specifed Category is not available:");
		driver.close();
		
	}

}
