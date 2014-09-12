package Suning;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestSuning {
	   private WebDriver driver;

	    @BeforeMethod
	    public void setUp() throws Exception {
	        DesiredCapabilities capabilities = new DesiredCapabilities();
	        capabilities.setCapability("platformName", "Android");
	        capabilities.setCapability("deviceName","Samsung");
	        
	        //package&activity
	        //capabilities.setCapability("app", "mail.apk");
	        capabilities.setCapability("androidPackage", "com.suning.mobile.ebuy");
	        capabilities.setCapability("appActivity", "com.suning.mobile.ebuy.ui.frame.SuningTabActivity");
	        
	        driver = new RemoteWebDriver(new URL("http://172.28.57.49:4723/wd/hub"), capabilities);
	        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
	    }


	    @Test
	    public void testCalculator(){
	    	
	    	driver.findElement(By.xpath("//android.widget.RelativeLayout[3]")).click();
	    	driver.findElement(By.xpath("//android.widget.TextView[text()='手机/数码/配件']")).click();
    }


	    @AfterMethod
	    public void tearDown() throws Exception {
	        driver.quit();
	    }

}
