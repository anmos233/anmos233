package shubham;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import dev.failsafe.internal.util.Assert;

public class ccheckbox {

	    public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.MILLISECONDS);
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		WebElement webelement=driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']"));
		webelement.click();
		Boolean isselected=webelement.isSelected();	
		assertTrue(isselected);
	
		System.out.println(isselected);
		
		List<WebElement>Boxes=driver.findElements(By.cssSelector("input[type='checkbox']"));
		int sizeboxs=Boxes.size();
		System.out.println(sizeboxs);
		SoftAssert assert1=new SoftAssert();
		driver.quit();
		
	}

}
