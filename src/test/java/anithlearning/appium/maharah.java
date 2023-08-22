package anithlearning.appium;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

@Test
public class maharah extends BaseTest {
	
	
	public void maharahtest () throws InterruptedException
	{
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("autoGrantPermissions", "true");
		// driver.findElement(By.className("com.android.permissioncontroller:id/permission_message")).click();
		//String notificationPopup= driver.findElement(By.className("com.android.permissioncontroller:id/permission_message")).getText();
		//Assert.assertEquals(notificationPopup, "Allow Maharah to send you notifications?");
		//driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
		driver.findElement(By.id("com.maharah.maharahApp.debug:id/countryCodeTv")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("com.maharah.maharahApp.debug:id/searchEd")).click();
		driver.findElement(By.id("com.maharah.maharahApp.debug:id/searchEd")).sendKeys("India");
		Thread.sleep(3000);
		
	
		
String countryCount =driver.findElement(By.id("com.maharah.maharahApp.debug:id/countryNameTv")).getText();
		
         if(countryCount.equalsIgnoreCase("India"))
         {
        	 driver.findElements(By.id("com.maharah.maharahApp.debug:id/countryNameTv")).get(1).click();
         }
	
	
	
	
	
	}

}
