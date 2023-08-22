package anithlearning.appium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.android.nativekey.AndroidKey;

public class MobileBrowserTest extends BrowserBaseTest {
	@Test
	 public void BrowserTest() throws InterruptedException
	 {
		 
		// driver.get("https://www.google.com");
		//System.out.println(driver.getTitle());
		//driver.findElement(By.name("q")).sendKeys("Anith vc");
		//driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		// Thread.sleep(5000);
		 
		driver.get("https://rahulshettyacademy.com/angularAppdemo");
		driver.findElement(By.xpath("//span[@class='navbar-toggler-icon']")).click();
		driver.findElement(By.cssSelector("//a[@routerlink*='products']")).click();
		 ((JavascriptExecutor) driver).executeScript("windows.scrollBy(0,1000)","");
		
	String Text =	driver.findElement(By.cssSelector("[href*='/angularAppdemo/products/3']")).getText();
	Assert.assertEquals(Text, "Devops");
		
		
		
		
		
		
		 
	 }
	
	

}
