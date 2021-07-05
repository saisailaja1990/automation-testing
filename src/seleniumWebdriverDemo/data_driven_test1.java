package seleniumWebdriverDemo;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class data_driven_test1 
{

	public static void main(String[] args)throws IOException
	
	{
		XSSFWorkbook wb=new XSSFWorkbook("C:\\Users\\sunee\\Desktop\\software testing\\Teknisktestare\\ebaysearch.xlsx");
		XSSFSheet ws=wb.getSheet("search_product");
		
		int rows=ws.getPhysicalNumberOfRows();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		
		for(int i=1;i<rows;i++)
		{
			String search=ws.getRow(i).getCell(0).getStringCellValue();
			String cate=ws.getRow(i).getCell(1).getStringCellValue();
			
			WebElement cat=driver.findElement(By.id("gh-cat")); 
			Select s=new Select(cat);
//			s.selectByIndex(6);
//			s.selectByValue("625");
			s.selectByVisibleText(cate);
			
			
			
			
			WebElement txt=driver.findElement(By.id("gh-ac"));
			txt.clear();
			txt.sendKeys(search);
			driver.findElement(By.id("gh-btn")).click();
			
		}
	}

}
