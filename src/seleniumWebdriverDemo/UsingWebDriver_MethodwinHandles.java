package seleniumWebdriverDemo;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingWebDriver_MethodwinHandles 
{

	public static void main(String[] args) 
	{
WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get( "https://www.naukri.com/");
//		driver.get( "https://www.shein.se/");
		
	String title=driver.getTitle();
		
		System.out.println(title);

	String winId=driver.getWindowHandle();
	System.out.println(winId + "==>"+ title);
	Set<String> winIds=driver.getWindowHandles();
	for(String ID:winIds)
	{
		driver.switchTo().window(ID );
		System.out.println(ID+"-->"+driver.getTitle());
	}
		
//	driver.close();
	driver.quit();
	

	}
	}

