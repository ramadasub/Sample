package common;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserActions extends BasePage{

	public void navigateUrl(){
		driver.get("http://automationpractice.com/index.php");
	}

	public void clickElement(By locator){
		waitForElement(locator);
		driver.findElement(locator).click();
	}
	
	public void setElementText(By locator,String input){
		waitForElement(locator);
		driver.findElement(locator).sendKeys(input);
	}
	
	public void selectValueFromDropDown(By locator, String value){
		waitForElement(locator);
		Select select=new Select(driver.findElement(locator));
		select.selectByValue(value);
	}
	
	public void waitForElement(By locator){
		WebDriverWait wait=new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	
	public boolean validateElementDisplay(By locator){
		waitForElement(locator);
		return driver.findElement(locator).isDisplayed();
	}
	
	public void pauseExe(int mSec){
		try {
			Thread.sleep(mSec);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
