package seleniumWebdriverDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UsingMouseActions 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.in/");
		WebElement ddIcon=driver.findElement(By.xpath("//*[@id=\'nav-link-accountList-nav-line-1\']"));
		
		Actions a=new Actions(driver);
		a.moveToElement(ddIcon).perform();//in Actions class :- moveToElement()-method used to shift the focus of the mouse to ddIcon(Accountlisticon)
		driver.findElement(By.xpath("//*[@id=\'nav-al-wishlist\']/a[6]/span")).click();

	}

}
