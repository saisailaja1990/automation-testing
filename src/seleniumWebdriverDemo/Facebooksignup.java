package seleniumWebdriverDemo;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Facebooksignup 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions chromeOptions = new ChromeOptions();

		Map<String, Object> prefs = new HashMap<String, Object>();

		prefs.put("intl.accept_languages", "ja-jp,ja");

		chromeOptions.setExperimentalOption("prefs", prefs);

		WebDriver driver = new ChromeDriver(chromeOptions);
		
         driver.manage().window().maximize();
         driver.get("https://www.facebook.com");
//         driver.findElement(By.id("u_0_j_ij")).click(); 
         driver.findElement(By.id("email")).sendKeys("pattipatisaisailaja7@gmail.com");
         driver.findElement(By.id("pass")).sendKeys("ajith!143");
        
         
       
    }

}
