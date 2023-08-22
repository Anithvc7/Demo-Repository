package anithlearning.appium;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

@Test
public class PracticeWithLongMessage extends BaseTest {
	
	
	public void PracticeWithLongMessageTest () throws InterruptedException
	{
		driver.findElement(AppiumBy.accessibilityId("App")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Alert Dialogs\"]")).click();
		driver.findElement(By.id("io.appium.android.apis:id/two_buttons2")).click();
		String Headertitle = driver.findElement(By.id("android:id/alertTitle")).getText();
		Assert.assertEquals(Headertitle, "Header title");
	//	String headerContent =driver.findElement(By.id("android:id/message")).getText();
	//	Assert.assertEquals(headerContent, "Plloaso mako nuto siwuf cakso dodtos anr koop a cupy uf cak vux noaw yerw phuno. Whag schengos, uf efed, quiel ba mada su otrenzr. Swipontgwook proudgs hus yag su ba dagarmidad. Plasa maku noga wipont trenzsa schengos ent kaap zux comy. Wipont trenz kipg naar mixent phona. Cak pwico siructiun ruous nust apoply tyu cak Uhex sisulutiun munityuw uw dseg");
		String something = driver.findElement(By.id("android:id/button3")).getText();
		Assert.assertEquals(something, "Something");
		String cancel=driver.findElement(By.id("android:id/button2")).getText();
		Assert.assertEquals(cancel, "Cancel");
		String ok=driver.findElement(By.id("android:id/button1")).getText();
		Assert.assertEquals(ok, "OK");
		Thread.sleep(3000);
		driver.findElement(By.id("android:id/button1")).click();
		Thread.sleep(3000);
		
		
		
	}
	
	
	

}
