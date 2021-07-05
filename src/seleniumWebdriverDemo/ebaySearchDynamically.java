package seleniumWebdriverDemo;


import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ebaySearchDynamically
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		
		System.out.print("Enter category to select from the dropdown:");
		String cat=sc.nextLine();
		
		
		System.out.print("Enter product to search:");
		String product= sc.nextLine();

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		
		WebElement category =driver.findElement(By.id("gh-cat"));
		Select s=new Select(category);
		s.selectByVisibleText(cat);
		
		driver.findElement(By.id("gh-ac")).sendKeys(product);
		driver.findElement(By.id("gh-btn")).click();
		//driver.quit();

	}

}
