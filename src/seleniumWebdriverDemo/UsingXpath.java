package seleniumWebdriverDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsingXpath
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		
		WebElement cat=driver.findElement(By.id("gh-cat")); 
		Select s=new Select(cat);
//		s.selectByIndex(6);
//		s.selectByValue("625");
		s.selectByVisibleText("Cameras & Photo");
		
		
		
		
		//ABSOLUTE XPATH
		driver.findElement(By.xpath("/html/body/header/table/tbody/tr/td[3]/form/table/tbody/tr/td[1]/div[1]/div/input[1]")).sendKeys("Sony");
		
		
		//RELETIVE XPATH
		driver.findElement(By.xpath("//*[@id='gh-btn']")).click();
		
		
//if one or more elements having same name and attribute name then user defined his own xpath to locate an element:
		//driver.findElement(By.xpath("//*[@id=\"srp-river-results\"]/ul/li[3]/div/div[2]/a/h3")).click();
		driver.findElement(By.xpath("(//*[@ class='s-item__title'])[2]")).click();
	}

}
