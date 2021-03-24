package repository;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;

import common.BrowserActions;

public class AuthenticationPageOR extends BrowserActions {

	public static By txt_Email = By.id("email_create");
	public static By btn_CreateAnAccount = By.xpath("//*[contains(@id,'SubmitCreate')]//span");

	public void enterEmail() {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYYMMddHHMMSS");
		String randomString = sdf.format(d);
		setElementText(txt_Email, "Smith" + randomString + "@gmail.com");
	}

	
}
