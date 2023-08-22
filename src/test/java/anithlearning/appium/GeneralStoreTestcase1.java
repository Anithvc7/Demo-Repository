package anithlearning.appium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

@Test
public class GeneralStoreTestcase1 extends BaseTest {

public void GeneralStoreTestcase1test() throws InterruptedException
{
	
	driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Anith vc");
	driver.hideKeyboard();
	driver.findElement(By.xpath("//android.widget.RadioButton[@text='Female']")).click(); // -- bu using text atribute --one of thr methord
	//tagName[@attribute='value'] -- xpath  ==> (//tagName) -- only 
	driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
	
	driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable (new UiSelector()).scrollIntoView(text(\"Argentina\"));"));
	
	//scrollToElement("Argentina");
	driver.findElement(By.xpath("//android.widget.TextView[@text='Argentina']")).click();
    driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
	
	Thread.sleep(3000);
	
	
}
	
	
	
	
	
	
	
	
}
