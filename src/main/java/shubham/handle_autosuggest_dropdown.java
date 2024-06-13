package shubham;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handle_autosuggest_dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.MILLISECONDS);
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(4000);
		
		List<WebElement>options =driver.findElements(By.cssSelector("li.ui-menu-item a"));
		
		for(WebElement option:options)
		{
			if(option.getText().equals("India"))
			{
				option.click();
				break;
			}
			
		}

	}

}
