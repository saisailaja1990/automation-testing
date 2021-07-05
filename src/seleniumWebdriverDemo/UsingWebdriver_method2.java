package seleniumWebdriverDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingWebdriver_method2
{

	public static void main(String[] args)
	{
WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		String tittle=driver.getTitle();
		String Url=driver.getCurrentUrl();
		
		System.out.println(Url +"->"+tittle);
		driver.close();
		//driver.quit();

	}

}
