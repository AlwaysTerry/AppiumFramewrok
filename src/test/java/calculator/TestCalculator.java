package calculator;


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
import java.io.File;
import java.net.URL;
import java.util.List;


public class TestCalculator {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName","Samsung");
        
        //package&activity
       capabilities.setCapability("androidPackage", "com.android.calculator2");
        capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
        
        driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);      
    }


    @Test
    public void testCalculator(){ 
    	
    	try{
    		driver.findElement(By.name("DELETE")).click();
    	}catch(Exception e){
    		driver.findElement(By.name("CLR")).click();
    	}
    	
//    	driver.findElement(By.name("1")).click();
//    	driver.findElement(By.name("+")).click();
//    	driver.findElement(By.name("2")).click();
//    	driver.findElement(By.name("=")).click();
	
    	driver.findElement(By.xpath("//android.widget.Button[@text='1']")).click();
    	driver.findElement(By.xpath("//android.widget.Button[@text='+']")).click();
    	driver.findElement(By.xpath("//android.widget.Button[@text='2']")).click();
    	driver.findElement(By.xpath("//android.widget.Button[@text='=']")).click();
    	System.out.println(driver.findElement(By.xpath("//android.widget.EditText")).getText());
    }


    @AfterMethod
    public void tearDown() throws Exception {
        driver.quit();
    }


}

