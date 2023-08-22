package anithlearning.appium;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

@Test
public class GeneralStore_ToastMessage extends BaseTest {

public void GeneralStore_ToastMessagetest() throws InterruptedException
{
	
	//driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Anith vc");
	//driver.hideKeyboard();
	driver.findElement(By.xpath("//android.widget.RadioButton[@text='Female']")).click(); 
	driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
	
	driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable (new UiSelector()).scrollIntoView(text(\"Argentina\"));"));
	driver.findElement(By.xpath("//android.widget.TextView[@text='Argentina']")).click(); //tagName[@attribute='value'] -- xpath  ==> (//tagName) -- only 
    driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
    Thread.sleep(3000);
  String toastMessage =  driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name"); // here we cant use getText methord --
  Assert.assertEquals(toastMessage, "Please enter your name");
    
    
    
    
    
    
    
    
	
	
	
	
}
	
	
	
	
	
	
	
	
}
