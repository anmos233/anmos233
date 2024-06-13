package shubham;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Array_of_product {

	public static void main(String[] args) {
		 WebDriver driver=  new ChromeDriver();
         driver.manage().timeouts().implicitlyWait(30,TimeUnit.MILLISECONDS);
         
         driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
         
         String []vegs={"Cucumber","Brocolli"};
         List list =Arrays.asList(vegs); //convert  string array to arraylist
         
      List<WebElement> elements=  driver.findElements(By.cssSelector("h4.product-name"));

      
    
      
      for(int i=0;i<elements.size();i++)
      {
    	 String[] name= elements.get(i).getText().split("-");
    	String name1=name[0].trim();
    	  if(list.contains(name1))
    	  {
    		  driver.findElements(By.cssSelector("div.product-action button")).get(i).click();
    	  }
      }
	}

}
