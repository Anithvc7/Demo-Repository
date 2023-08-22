package anithlearning.appium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class fitnesstesting extends BaseTest {

	@Test
	
	public void fitnesstestingtest() throws InterruptedException
	{
		driver.findElement(AppiumBy.accessibilityId("Sign In")).click();
		driver.findElement(AppiumBy.accessibilityId("+966")).click();
		Thread.sleep(4000);
		driver.hideKeyboard();
		//driver.findElement(AppiumBy.className("android.widget.EditText")).sendKeys("India");
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable (new UiSelector()).scrollIntoView(text(\"+91 India\"));"));
		
		driver.hideKeyboard();
		Thread.sleep(4000);
		driver.findElement(AppiumBy.className("android.widget.ImageView")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"+91 India\"]"));
		
		
		
		
	}
}
