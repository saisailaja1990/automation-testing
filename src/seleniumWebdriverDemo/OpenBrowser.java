package seleniumWebdriverDemo;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser 
{

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		String title=driver.getTitle();
		System.out.println(title);
		String URL=driver.getCurrentUrl();
		System.out.println(URL);
		System.out.println(URL+"-->"+title);
		
	String winId=driver.getWindowHandle();
	System.out.println(winId+"-->"+title);
		Set<String> WindowID=driver.getWindowHandles();
	for(String ID:WindowID)
	{
		driver.switchTo().window(ID);
	System.out.println(ID+"--->"+driver.getTitle());

	}	
		
	driver.close();// It is used to close the popup windows
	driver.quit();// It is used to quit the entire program
		
		

	}

}
