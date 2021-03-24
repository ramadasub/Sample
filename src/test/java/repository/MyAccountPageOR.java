package repository;

import org.openqa.selenium.By;

import common.BrowserActions;

public class MyAccountPageOR extends BrowserActions {

	public static By lnk_SignOut = By.linkText("Sign out");
	public static By ele_Account = By.xpath("//a[@class='account']/span");
	public static By ele_HomeIcon = By.xpath("//a[@title='My Store']/img");

	public static By ele_Items = By.xpath("//*[@itemprop='name']");
	public static By btn_AddToCart = By.xpath("//*[text()='Add to cart']");
	public static By btn_ProceedToCheckout = By
			.xpath("//*[@name='processCarrier']//*[contains(text(),'Proceed to checkout')]");

	public static By chk_Terms = By.id("cgv");

	public static By ele_CartItem = By.xpath("//*[@class='cart_description']//*[@class='product-name']");

}
