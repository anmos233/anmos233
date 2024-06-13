package shubham;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class launch {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.MILLISECONDS);


		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.id("inputUsername")).sendKeys("shubhammagar00@gmail.com");
		driver.findElement(By.cssSelector("input[name='inputPassword']")).sendKeys("Rahul");

		driver.findElement(By.cssSelector(".signInBtn")).click();
		Thread.sleep(5000);
		
		WebElement error=driver.findElement(By.cssSelector(".error"));
		               String errormsg=error.getText();
		               
		               System.out.println(errormsg);
		               
		               driver.findElement(By.linkText("Forgot your password?")).click();
		               
		            driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("Shubham");
		         driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("shyubhammagar00@gmail.com");
		         //driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
		         driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("9850660189");
		 		Thread.sleep(5000);

		         driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		        WebElement pass= driver.findElement(By.cssSelector("form p"));
		         String textofString =pass.getText();
		         System.out.println(textofString);
		         
		         
		         driver.findElement(By.cssSelector("button.go-to-login-btn")).click();
		         driver.findElement(By.id("inputUsername")).sendKeys("shubham");
		         driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		         
		         Thread.sleep(3000);
		         driver.findElement(By.id("chkboxTwo")).click();
		         
		         driver.findElement(By.cssSelector("button[class*='submit']")).click();
		         
		         
		         
	}

}
