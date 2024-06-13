package shubham;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.Window;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class scroll_down_on_web {
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.fitpeo.com/revenue-calculator");
		WebElement point=driver.findElement(By.cssSelector("h4[class*='12siehf']"));
		
      JavascriptExecutor js= ( JavascriptExecutor)driver;
      js.executeScript("window.scrollBy(0,300)","");
    js.executeScript("arguments[0].scrollIntoView();", point);
    //js.executeScript("window.scrollTo(0,document.body.scrollHeight)"); --till end scroll down
		
 
    
      //slider
     WebElement slider=driver.findElement(By.cssSelector("span .css-79rf0x"));
    Actions ac= new Actions(driver);
    
    Thread.sleep(3000);
   ac.dragAndDropBy(slider,100,0).perform();
    
  
      
      
  
      
      
	}

	
	}


