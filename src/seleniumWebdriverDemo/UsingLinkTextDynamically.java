package seleniumWebdriverDemo;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingLinkTextDynamically 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter link to select:");
		String LinkSelect =sc.nextLine();
		
		Boolean isExits=false;
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		for(WebElement link:links)
		{
			String Weblink=link.getText();
			if(Weblink.equalsIgnoreCase(LinkSelect))
			{
			isExits=true;
			driver.findElement(By.partialLinkText(LinkSelect)).click();
			break;
			}
			
		}
		isExits=false;
		System.out.println("The specified link is not avaliable:");	
		//driver.findElement(By.linkText(LinkSelect)).click();

	}

}
