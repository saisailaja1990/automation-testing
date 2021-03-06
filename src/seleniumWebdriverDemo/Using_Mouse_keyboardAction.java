package seleniumWebdriverDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Using_Mouse_keyboardAction 
{

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/selectable/");
		
		
		driver.switchTo().frame(0);
		
		WebElement list=driver.findElement(By.id("selectable"));
		List<WebElement> items=list.findElements(By.tagName("li"));
		Actions a=new Actions(driver);
		a.keyDown(Keys.CONTROL).click(items.get(0)).click(items.get(2)).click(items.get(4)).click(items.get(6)).perform();
		
		
	
	}
	

}
