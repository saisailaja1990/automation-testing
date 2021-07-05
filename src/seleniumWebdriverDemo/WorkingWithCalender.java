package seleniumWebdriverDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithCalender 
{

	public static void main(String[] args)
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.xpath("//*[@id='search']/div/div[3]/div/label")).click();
		
		List<WebElement> rows=driver.findElements(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr"));
		
		for(int i=3;i<=rows.size();i++)
		{
			//corresponding rows and column data
			List<WebElement> col=driver.findElements(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr["+  i  +"]/td"));
			
			for(int j=1;j<=col.size();j++)
			{
				WebElement cell=driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr["+  i  +"]/td["+ j +"]"));
				if(cell.getText().equals("24"))
				{
					cell.click();
					break;
				}
			}
			
			
		}

	}

}
