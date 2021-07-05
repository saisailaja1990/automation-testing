package seleniumWebdriverDemo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Takingscreenshot {

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		//convert web driver in to TakeScreenshot type
		//getScreenshotAs() -method
		//output in the form of file
		File fsource=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//which format we need to take the screen shot specify it ie..,jpg,png
		File fdestination=new File("C:\\Users\\sunee\\Desktop\\software testing\\Selenium material\\errorpic.png");
		
		FileHandler.copy(fsource, fdestination);
	}

}
