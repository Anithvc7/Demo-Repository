package anithlearning.appium;


import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class iOSSwipetestphoto extends iOSBaseTest {

	@Test
	public void iOSLongpresstest ()
	{
	Map<String,String> params = new HashMap<String,String>();
	params.put("bundilId", "com.apple.mobileslideshow");
	driver.executeScript("mobile:LaunchApp", params);
	
	
	
	}
	
	
	
	
	
}
