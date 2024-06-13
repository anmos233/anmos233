package shubham;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.script.Message;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {

	public static void main(String[] args) throws InterruptedException {
	//System.setProperty("webdriver.chrome.driver","./path of driver exectualbile ");
           WebDriver driver=  new ChromeDriver();
           driver.manage().timeouts().implicitlyWait(30,TimeUnit.MILLISECONDS);
           
           String text="Shubham";
           driver.get("https://rahulshettyacademy.com/AutomationPractice/");
          driver.findElement(By.id("name")).sendKeys(text);
		
		driver.findElement(By.id("alertbtn")).click();
		Alert al=driver.switchTo().alert();
	String	message=al.getText();
   System.out.println(message);
		al.accept();
		
		driver.findElement(By.id("name")).sendKeys(text);
		driver.findElement(By.id("confirmbtn")).click();
		Alert al1=driver.switchTo().alert();
		Thread.sleep(3000);
		al1.dismiss();
		
		
	}

}
