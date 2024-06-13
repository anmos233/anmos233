package shubham;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		List<WebElement> lists=driver.findElements(By.cssSelector("_2puWtW _3a3qyb"));
		
		
		for(WebElement list:lists)
		{
			String st=list.getText();
			
			System.out.println(st);
		}

	}

}
