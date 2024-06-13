package shubham;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dyanamic_dropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.MILLISECONDS);
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");

		//a[@value='BLR']---xpath for banglore
		//a[@value='BHO'])[2]----xpath for bhopal
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//a[@value='BHO'])[2]")).click();
		//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BHO']
		
		
		
		String att = driver.findElement(By.id("Div1")).getAttribute("style");
		System.out.println(att);
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		String att1 = driver.findElement(By.id("Div1")).getAttribute("style");
		
	    System.out.println(att1);

		
		
		
		
		
		//driver.findElement(By.cssSelector(".ui-state-active")).click();
		
		
	}

}
