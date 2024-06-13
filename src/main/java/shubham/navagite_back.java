package shubham;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navagite_back {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.MILLISECONDS);
        driver.get("https://www.google.com");
        
        driver.navigate().to("https://fb.com");
        Thread.sleep(3000);
        
        		driver.navigate().back();
	}

}
