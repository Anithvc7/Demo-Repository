package anithlearning.appium;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.functions.ExpectedCondition;

@Test
public class GeneralStoreTestcase4_hybrid extends BaseTest {

public void GeneralStoreTestcase3test() throws InterruptedException
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
	driver.findElements(By.xpath("//android.widget.TextView[@text='ADD TO CART']")).get(0).click(); // 1st methord
	//driver.findElement(By.xpath("//android.widget.TextView[@text='ADD TO CART'])[1]")).click();  // 2nd methord
	driver.findElements(By.xpath("//android.widget.TextView[@text='ADD TO CART']")).get(0).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		// important --wait.until(ExpectedConditions)
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5)); // this is introduced to wait till the next page open as the element id are same 
		wait.until(ExpectedConditions.attributeContains(driver.findElement(By.id("com.androidsample.generalstore:id/toolbar_title")), "text", "Cart"));
		Thread.sleep(3000);
	//int productCount =driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).size(); -- changing this to easy way 
		
		List<WebElement> productPrice =driver.findElements(By.id("com.androidsample.generalstore:id/productPrice"));
		int count =productPrice.size();
		double sum =0;
		for(int i = 0; i < count ; i++)
		{
			
			String amountString =productPrice.get(i).getText();			
			
			Double price =Double.parseDouble(amountString.substring(1));// --TO REMOVE THE $ FROM PRICE
			
			sum = sum + price ;
			
			
		}
		
		
		String displayPrice= driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
	Double displayPrices= Double.parseDouble(displayPrice.substring(1));
		Assert.assertEquals(sum, displayPrices);
		Thread.sleep(3000);
	WebElement checkBox=driver.findElement(By.id("com.androidsample.generalstore:id/termsButton"));
		((JavascriptExecutor) driver).executeScript("mobile: longClickGesture",
				ImmutableMap.of("elementId",((RemoteWebElement)checkBox).getId(),"duration",2000));
		Thread.sleep(2000);
		String cancelButton =driver.findElement(By.id("android:id/button1")).getText();
		Assert.assertEquals(cancelButton, "CLOSE");
		driver.findElement(By.id("android:id/button1")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.className("android.widget.CheckBox")).click();
		
		String purchase =driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).getText();
		Assert.assertEquals(purchase, "Visit to the website to complete purchase");
		driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();
		Thread.sleep(6000);
		// hybrid 
		
		//driver.getContextHandles();
		//driver.context("");   // context name may be diffrernt -- these can be used if we get the context name
		
		//can also get context name by appium -- using the bellow "system printin "
		//advance for-loop methord 
		
		Set<String> contexts =driver.getContextHandles();
		for (String contextName :contexts)
		{
			System.out.println(contextName);
		
		}
		
		driver.context("WEBVIEW_com.androidsample.generalstore");
		driver.findElement(By.name("q")).sendKeys("Anith vc");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.context("NATIVE_APP");
		
		
}
	
	
	
	
	
	
	
}
