package shubham;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;

public class logined {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.MILLISECONDS);
            String passwordmain=getPassword(driver);  
            
            
            
         String name="shubham";
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		 
         driver.findElement(By.id("inputUsername")).sendKeys(name);
         driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys(passwordmain);
         
         Thread.sleep(3000);
         driver.findElement(By.id("chkboxTwo")).click();
         
         driver.findElement(By.cssSelector("button[class*='submit']")).click();
         Thread.sleep(3000);
        WebElement msg= driver.findElement(By.xpath("//p[.='You are successfully logged in.']"));
         
        String smsg= msg.getText();
        System.out.println(smsg);
       // Assert.assertEquals(smsg,"You are successfully logged in.");
        
       WebElement msg2= driver.findElement(By.cssSelector("div.login-container h2"));
     String smsg2=  msg2.getText();
     System.out.println(smsg2);
       // Assert.assertEquals(smsg2,"Hello "+name+",");
        driver.findElement(By.cssSelector("button.logout-btn")).click();
        
         
	}
	
	public static String getPassword(WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		Thread.sleep(5000);
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
        WebElement pass= driver.findElement(By.cssSelector("form p"));
        String textofString =pass.getText();
      String [] arrpass= textofString.split("'");//Please use temporary password 'rahulshettyacademy' to Login.
      String [] arrpass2=   arrpass[1].split("'");
		String passwordmain =arrpass2[0];
      return passwordmain;
	}

}
