package shubham;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class e2e {

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
		
		
		driver.findElement(By.cssSelector(".ui-state-highlight")).click();
		
		String att = driver.findElement(By.id("Div1")).getAttribute("style");
		System.out.println(att);
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		String att1 = driver.findElement(By.id("Div1")).getAttribute("style");
		
	System.out.println(att1);
	
	
	//adlut
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
	
	
	
	//search
	Thread.sleep(3000);
	
	driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();
	
	
	
	
	
	}

}
