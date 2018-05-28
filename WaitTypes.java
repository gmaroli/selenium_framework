package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitTypes {
	
	WebDriver driver;
	
	public WaitTypes(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement waitforElement(By locator, int timeout) {
		WebElement element = null;
		try {
			WebDriverWait wait = new WebDriverWait(driver, timeout);
			element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			
		} catch(Exception e) {
			System.out.println("Element not appeared on the web page");
		}
		return element;
	}

}
