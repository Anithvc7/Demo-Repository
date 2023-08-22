package anithlearning.appium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.functions.ExpectedCondition;

@Test
public class GeneralStoreTestcase2 extends BaseTest {

public void GeneralStoreTestcase2test() throws InterruptedException
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
	
	driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable (new UiSelector()).scrollIntoView(text(\"Jordan 6 Rings\"));"));
	
	int productCount = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();
	
	for(int i = 0;i<productCount;i++)
	
	{
		
		String productName=driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();
		
		if(productName.equalsIgnoreCase("Jordan 6 Rings"))
		{
			driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
				
			
		}
	}
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		// important --wait.until(ExpectedConditions)
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5)); // this is introduced to wait till the next page open as the element id are same 
		wait.until(ExpectedConditions.attributeContains(driver.findElement(By.id("com.androidsample.generalstore:id/toolbar_title")), "text", "Cart"));
		//Thread.sleep(3000);
	
	String lastPageProductName=driver.findElement(By.id("com.androidsample.generalstore:id/productName")).getText();
	Assert.assertEquals(lastPageProductName, "Jordan 6 Rings");
	
	Thread.sleep(3000);
}
	
	
	
	
	
	
	
	
}
