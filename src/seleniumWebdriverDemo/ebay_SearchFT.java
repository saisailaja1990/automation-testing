package seleniumWebdriverDemo;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class ebay_SearchFT
{

	public static void main(String[] args) throws Exception
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		
		WebElement cat=driver.findElement(By.id("gh-cat")); 
		Select s=new Select(cat);
//		s.selectByIndex(6);
//		s.selectByValue("625");
		s.selectByVisibleText("Cameras & Photo");
		
		
		
		
		driver.findElement(By.id("gh-ac")).sendKeys("Sony");
		driver.findElement(By.id("gh-btn")).click();
		
		driver.findElement(By.xpath("(//*[@calss='s-item__title'])[2]")).click();
		driver.findElement(By.id("MaxBidId")).sendKeys("60sek");
		driver.findElement(By.id("bidBtn_btn")).click();
		
		//File fsource=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);     
		
		//which format we need to take the screen shot specify it ie..,jpg,png
		//File fdestination=new File("C:\\Users\\sunee\\Desktop\\software testing\\Selenium material\\ebaysearchscreen.png");
		
		//FileHandler.copy(fsource, fdestination);
	
	}

}
