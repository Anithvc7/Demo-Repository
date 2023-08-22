package anithlearning.appium;

import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
@Test
public class Activity extends BaseTest{
	
	public void Activitytest ()
	{
		
		// to go to perticular page directly -- using Ativity 
		// adb shell dumpsys window |  grep -E 'mCurrentFocus' --- for mac
		// adb shell dumpsys window |  find "mCurrentFocus" --- for windows

		
		// not wprking bellow code 
		// issue with comment in terminal
	// 	Activity activity = new Activity ("io.appium.android.apis","io.appium.android.apis.preference.PreferenceDependencies");
		 driver.findElement(AppiumBy.accessibilityId("Preference")).click();	
		 driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
	     driver.findElement(By.id("android:id/checkbox")).click(); 
	     DeviceRotation landscape =new DeviceRotation(0, 0, 90); //-- to rotate the screen
	     driver.rotate(landscape);  //-- to rotate the screen
	     driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
	    String alertTitle= driver.findElement(By.id("android:id/alertTitle")).getText();
	    Assert.assertEquals(alertTitle,"WiFi settings");
	    // To copy paste clipboard
	    driver.setClipboardText("Anith vc");
		 driver.findElement(By.id("android:id/edit")).sendKeys(driver.getClipboardText());
		 driver.pressKey(new KeyEvent(AndroidKey.ENTER));  /// -- TO USE device action , like back home etc
		 
		 driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();
		 driver.pressKey(new KeyEvent(AndroidKey.BACK)); /// -- TO USE device action , like back home etc
		 driver.pressKey(new KeyEvent(AndroidKey.HOME)); /// -- TO USE device action , like back home etc
		 
		 
		 
		
	}
	
	
	
	

}
