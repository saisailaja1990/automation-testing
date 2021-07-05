package seleniumWebdriverDemo;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup_closing
{

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		String mainwindow=driver.getTitle();
		String mainwinId=driver.getWindowHandle();
		Set<String> winId=driver.getWindowHandles();
		for(String Id:winId)
		{
			driver.switchTo().window(Id);
			if(!driver.getTitle().equalsIgnoreCase(mainwindow))
			driver.close();
		}

	
	driver.switchTo().window(mainwinId);
	System.out.println(mainwindow);
//	System.out.println(mainwinId);
	}
}
