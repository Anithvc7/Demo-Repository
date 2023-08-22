package anithlearning.appium;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class AssignmentFullPractice extends BaseTest {

	
	@Test
	
	public void AssignmentFullPracticeTest ()
	
	{
		//ok , cancel with a message
		driver.findElement(AppiumBy.accessibilityId("App")).click();
		driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
		driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with a message")).click();
		//String result =driver.findElement(By.id("android:id/alertTitle")).getText();
		//Assert.assertEquals(result, "Lorem ipsum dolor sit aie consectetur adipiscing Plloaso mako nuto siwuf cakso dodtos anr koop.");
		
		String results = driver.findElement(By.id("android:id/button2")).getText();
		Assert.assertEquals(results, "Cancel");
		
		
		String okResults = driver.findElement(By.id("android:id/button1")).getText();
		Assert.assertEquals(okResults, "OK");
		driver.findElement(By.id("android:id/button1")).click();
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	

}
