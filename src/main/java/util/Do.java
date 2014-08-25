package util;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Do {

	private WebDriver driver;
	
	public Do(WebDriver driver){
		this.driver = driver;
	}
	
	
	public WebElement getElementByName(String name){
		return driver.findElement(By.name(name));
	}
	
	
	
	public WebElement getElementById(String id){
		return driver.findElement(By.id(id));
	}
	
	
	public WebElement getElementByXpath(String xpath){
		return driver.findElement(By.xpath(xpath));
	}
	
	
	public List<WebElement> getElementsByXpath(String xpath){
		return driver.findElements(By.xpath(xpath));
	}
	
	
	
}
