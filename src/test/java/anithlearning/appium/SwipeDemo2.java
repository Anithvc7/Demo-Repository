package anithlearning.appium;



import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;




public class SwipeDemo2 extends BaseTest {
	
	@Test
	public void SwipeDemoTest () throws MalformedURLException, InterruptedException
	{
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
		driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
		WebElement firstImage =driver.findElement(By.xpath("(//android.widget.ImageView)[1]"));
		Assert.assertEquals(driver.findElement(By.xpath("(//android.widget.ImageView)[1]")).getAttribute("focusable"),"true");
		//swipe --code bellow
	//	((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
		//	   "elementId",((RemoteWebElement)firstImage).getId(),
	//		    "direction", "left",
		//	    "percent", 0.75
	//		));
		// added in baseTest so we can reuse . 
		swipeAction(firstImage,"left");
		
		Assert.assertEquals(driver.findElement(By.xpath("(//android.widget.ImageView)[1]")).getAttribute("focusable"),"false");
	}
}
