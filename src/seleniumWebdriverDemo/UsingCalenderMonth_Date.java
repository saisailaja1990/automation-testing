package seleniumWebdriverDemo;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingCalenderMonth_Date 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Date to select:");
		String Date=sc.next();
		System.out.println("Enter Month to select:");
		String Month=sc.next();
		Month =Month.substring(0,3);
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.xpath("//*[@id='search']/div/div[3]/div/label")).click();
		//Select month
		
		//Compare first three characters of calendermonth with user given mounth
		//if it is not equal click on > button
		
		while (!driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[1]/td[2]")).getText().substring(0,3).equalsIgnoreCase(Month))
		{
			//clicking on right arrow button
			driver .findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[1]/td[3]/button")).click();
			
			//Date selection
			List<WebElement> rows=driver.findElements(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr"));
			
			for(int i=3;i<=rows.size();i++)
			{
				//corresponding rows and column data
				List<WebElement> col=driver.findElements(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr["+  i  +"]/td"));
				
				for(int j=1;j<=col.size();j++)
				{
					WebElement cell=driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr["+  i  +"]/td["+ j +"]"));
					if(cell.getText().equals(Date))
					{
						cell.click();
						break;
					}
				}
				
				
			}
			
		}
		
		
		
		
		

	}

}
