package anithlearning.appium;


import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class iOSLongpress extends iOSBaseTest {

	@Test
	public void iOSLongpresstest ()
	{
		
		
		driver.findElement(AppiumBy.accessibilityId("Steppers")).click();
	WebElement ele =driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`label == 'Increment'`][3]"));
	Map <String,Object>params = new HashMap<>();
    params.put("elements", ((RemoteWebElement)ele).getId());
    params.put("duration", 5);
		
    driver.executeScript("mobile:touchAndHold", params);

	
	
	
	
	}
	
	
	
	
	
}
