package shubham;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class following_sibling {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.MILLISECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		String str=driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText();
   System.out.println(str);
   
  String str1= driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText();
  System.out.println(str1);
	}

}
