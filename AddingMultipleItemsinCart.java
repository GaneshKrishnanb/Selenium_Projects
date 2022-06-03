//package org.Cart;
//
//import java.util.Arrays;
//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;

package org.Cart;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddingMultipleItemsinCart {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		 Thread.sleep(3000);
		 
		 
		 String[] itemsNeededList = {"Beetroot","Brocolli","Carrot","Beans","Carrot"};
		 List<WebElement> itemsDisplayed = driver.findElements(By.cssSelector("h4.product-name"));
		 for(int i = 0;i<itemsDisplayed.size();i++) {  
			 // Brocolli - 1kg Splitting the text by "-" by using split method
			 String[] product = itemsDisplayed.get(i).getText().split("-");// Brocolli 1kg
			 String formattedName = product[0].trim();
			 
			 // Converting the array into array list
			 List itemsNeeded1 = Arrays.asList(itemsNeededList);
			 if(itemsNeeded1.contains(formattedName)) {
			 	 System.out.print(formattedName);
			 	 driver.findElements(By.xpath("// div [@class = 'product-action']/button")).get(i).click();
			 }
			 
			 
		 }

	}
}



//
//public class  AddingMultipleItemsinCart{
//
//
//
//public static void main(String[] args) throws InterruptedException {
//
//// TODO Auto-generated method stub
//
//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
//
//
//
//WebDriver driver=new ChromeDriver();
//
//
//
//String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot"};
//
//
//
//
//
//driver.get("https://rahulshettyacademy.com/seleniumPractise/");
//
//Thread.sleep(3000);
//
//addItems(driver,itemsNeeded);
//
//}
//
//public static  void addItems(WebDriver driver,String[] itemsNeeded)
//
//{
//
//int j=0;
//
//List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
//
//for(int i=0;i<products.size();i++)
//
//{
//
////Brocolli - 1 Kg
//
////Brocolli,    1 kg
//
//String[] name=products.get(i).getText().split("-");
//
//String formattedName=name[0].trim();
//
////format it to get actual vegetable name
//
////convert array into array list for easy search
//
////  check whether name you extracted is present in arrayList or not-
//
//List itemsNeededList = Arrays.asList(itemsNeeded);
//
//if(itemsNeededList.contains(formattedName))
//
//{
//
//j++;
//
////click on Add to cart
//
//driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
//
//if(j==itemsNeeded.length)
//
//{
//
//break;
//
//}
//
//}
//
//}
//
//}
//
//
//
//}
//
