package anithlearning.appium;



import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;




public class AppiumBasics extends BaseTest {
	
	@Test
	public void WifiSettingsName() throws MalformedURLException
	{
		//InterruptedException
		
		// need to start appium server - need to automate it 
		
		//AppiumDriverLocalService service = new AppiumServiceBuilder ().withAppiumJS(new File("//usr//local//lib//node_modules//appium//build//lib//main.js"))
	   //.usingDriverExecutable(new File("/usr/local/lib/node_modules")
	   //.withIPAddress("127.0.0.1").usingPort(4723).withTimeout(Duration.ofSeconds(60)).build();
      //  service.start();
      
		 // need to add driver - and add object for the driver 
		
		// bellow - we ineed to import (import io.appium.java_client.android.) if not showing use command + shift+ o)
		// Need to add arguments -- from quick fix --(LocalServices , Capabilities)
		// need to add Url - and need to import java.net.URL; AndroidDriver "http://127.0.0.1:4723" 
		
		//UiAutomator2Options options = new UiAutomator2Options();
		//options.setDeviceName ("Demo2");
		//options.setApp("//Users//apple//eclipse-workspace//appiumlearning//appium//src//test//java//Resources//ApiDemos-debug.apk");
		
		//AndroidDriver driver = new AndroidDriver(new URL ("http://127.0.0.1:4723"), options);
		
		// these all comitted has moved to BaseTest class
		 
		// Actual automation stating 
		// to fine the path -- we use these , Xpath, id , accessibility , classname , androidUIAutomator
		
		//
		//ConfigureAppium(); //	
		
		
		//     //tagName[@attribute='value'] -- xpath  ==> (//tagName) -- only 
		//
		
		 driver.findElement(AppiumBy.accessibilityId("Preference")).click();	
		 driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
	     driver.findElement(By.id("android:id/checkbox")).click();//- for check box
	     driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
	    String alertTitle= driver.findElement(By.id("android:id/alertTitle")).getText();
	    Assert.assertEquals(alertTitle,"WiFi settings");
	     
		 driver.findElement(By.id("android:id/edit")).sendKeys("Anith vc");
		// driver.findElement(By.id("android:id/button1")).click();
		 // or we can do the above by class -  findElements - because of multiple and need to use .get(int index)
		 driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();	 
		 
		 
		 
		 
		
		// TearDown();
		 
		
		
		
		
	 
		
	}
}
