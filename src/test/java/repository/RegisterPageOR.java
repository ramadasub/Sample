package repository;

import org.openqa.selenium.By;

import common.BrowserActions;

public class RegisterPageOR extends BrowserActions {

	public By txt_cusFirstName = By.id("customer_firstname");
	public By txt_CusLastName = By.id("customer_lastname");
	public By txt_Pwd = By.id("passwd");
	public By drdw_Days = By.id("days");
	public By drdw_Month = By.id("months");
	public By drdw_Year = By.id("years");
	public By txt_FirstName = By.id("firstname");
	public By txt_LastName = By.id("lastname");
	public By txt_Company = By.id("company");
	public By txt_Address = By.id("address1");
	public By txt_City = By.id("city");
	public By drdw_State = By.id("id_state");
	public By txt_Zip = By.id("postcode");
	public By drdw_Country = By.id("id_country");
	public By txt_Phone = By.id("phone_mobile");
	public By txt_Assign = By.id("alias");
	public static By btn_Register = By.xpath("//*[contains(text(),'Register')]");

	public void performRegister(String cusFirstName, String cusLastName, String pwd, String day, String month,
			String year, String firstName, String lastName, String company, String address, String city, String state,
			String zip, String country, String phone, String assign) {
		setElementText(txt_cusFirstName, cusFirstName);
		setElementText(txt_CusLastName, cusLastName);
		setElementText(txt_Pwd, pwd);
		selectValueFromDropDown(drdw_Days, day);
		selectValueFromDropDown(drdw_Month, month);
		selectValueFromDropDown(drdw_Year, year);

		setElementText(txt_FirstName, firstName);
		setElementText(txt_LastName, lastName);
		setElementText(txt_Company, company);
		setElementText(txt_Address, address);
		setElementText(txt_City, city);
		selectValueFromDropDown(drdw_State, state);
		setElementText(txt_Zip, zip);
		selectValueFromDropDown(drdw_Country, country);
		setElementText(txt_Phone, phone);
		setElementText(txt_Assign, assign);
	}
}
