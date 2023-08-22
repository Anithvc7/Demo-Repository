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




public class ScrollDemo extends BaseTest {
	
	@Test
	public void ScrollDemoTest () throws MalformedURLException, InterruptedException
	{
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		// we can use this scroll methord if we know what we are looking for -- 
	//driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable (new UiSelector()).scrollIntoView(text(\"WebView\"));"));
		// the above code has added in base test and we can use it like below 
		//scrollToElement("WebView"); -- for now its getting fail need to find the issue 
		
		
	//	Thread.sleep(2000);
		// we use this can methord if we just need to scroll -- to check its there or not 
		
		//--code strt from here 
		boolean canScrollMore;
		do
		{
	      canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
		    "left", 100, "top", 100, "width", 200, "height", 200,
		   "direction", "down",
		   "percent", 3.0
		));
		}
		while(canScrollMore);
		// till here -- //
		//code not working in need to find issue 
		//  - its reusable so added to base test - so commit the above code --
		
		scrollToEndAction();
		Thread.sleep(2000);
		
	}
}
