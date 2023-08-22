package anithlearning.appium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

@Test
public class PracticeWithLongScrollableMessage extends BaseTest{
	
	
	public void PracticeWithLongScrollableMessagetest () throws InterruptedException 
	{
		
		driver.findElement(AppiumBy.accessibilityId("App")).click();
		driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
		driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with ultra long message")).click();
		String tittle =driver.findElement(By.id("android:id/alertTitle")).getText();
		Assert.assertEquals(tittle, "Header title");
		// Java
		boolean canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
		    "left", 100, "top", 100, "width", 200, "height", 200,
		    "direction", "down",
		    "percent", 3.0
		));
		
		Thread.sleep(3000);
		String something = driver.findElement(By.id("android:id/button3")).getText();
		Assert.assertEquals(something, "Something");
		String cancel=driver.findElement(By.id("android:id/button2")).getText();
		Assert.assertEquals(cancel, "Cancel");
		String ok=driver.findElement(By.id("android:id/button1")).getText();
		Assert.assertEquals(ok, "OK");
		Thread.sleep(3000);
		driver.findElement(By.id("android:id/button1")).click();
		Thread.sleep(3000);
		
		
		
		
	}
	
	

}
