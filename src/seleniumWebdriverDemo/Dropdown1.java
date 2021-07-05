package seleniumWebdriverDemo;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown1
{

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		Boolean isExist=false;
		
		
		System.out.println("Select the category:");
		String cat=sc.nextLine();
		
		System.out.println("Enter the category:");
		String pro=sc.nextLine();
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		
		WebElement category= driver.findElement(By.id("searchDropdownBox"));
		Select s=new Select(category);
		List<WebElement>items=s.getOptions();
		for(WebElement item :items)
		{
			String webcat=item.getText();
			if(webcat.equalsIgnoreCase(cat))
			{
				isExist=true;
				s.selectByVisibleText(webcat);
				driver.findElement(By.id("twotabsearchtextbox")).sendKeys(pro);
				driver.findElement(By.id("nav-search-submit-button")).click();
				break;
			}
		}
		
		if(isExist==false)
		{
			System.out.print("Specified category is not Available in the dropdown....");
		

		}
		
		

	}

}
