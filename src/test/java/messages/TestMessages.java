package messages;


import org.openqa.selenium.*;
import org.openqa.selenium.interactions.HasTouchScreen;
import org.openqa.selenium.interactions.TouchScreen;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteTouchScreen;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import util.Do;

import java.io.File;
import java.net.URL;
import java.util.List;


public class TestMessages {
    private WebDriver driver;
    private Do du;
    
    @BeforeMethod
    public void setUp() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName","Samsung");
        
        
        capabilities.setCapability("androidPackage", "com.android.mms");
        capabilities.setCapability("appActivity", "com.android.mms.ui.ComposeMessageActivity");
        
        
        driver = new RemoteWebDriver(new URL("http://10.69.1.203:4723:4723/wd/hub"), capabilities);    
        du = new Do(driver);
    }


    @Test
    public void testMessages(){ 
    	du.getElementByName("To").sendKeys("12345678910");
    	du.getElementByName("Type message").sendKeys("test by Terry");
    	du.getElementById("com.android.mms:id/send_button_sms").click();    	
    }


    @AfterMethod
    public void tearDown() throws Exception {
        driver.quit();
    }


}

