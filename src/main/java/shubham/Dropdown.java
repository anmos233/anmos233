package shubham;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("divpaxinfo")).click();

		   Thread.sleep(2000L);
		  String str=driver.findElement(By.id("divpaxinfo")).getText();
		  System.out.println(str);

		   int i=1;

		while(i<5)

		{

		driver.findElement(By.id("hrefIncAdt")).click();

		i++;

		}


		

		driver.findElement(By.id("btnclosepaxoption")).click();

		  String str2=driver.findElement(By.id("divpaxinfo")).getText();

	      Assert.assertEquals(str2, "5 Adult");
	

		System.out.println(str2);
		
		Thread.sleep(3000);
		driver.close();



	}

}
