package seleniumWebdriverDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class workin_withFrames1
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.qhmit.com/html/html_editors/scratchpad/?example=/javascript/examples/javascript_alert_box_onclick");
		driver.switchTo().frame("preview");
		driver.findElement(By.xpath("/html/body/input")).click();
		
		

	}

}
