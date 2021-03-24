package steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import common.BrowserActions;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import repository.AuthenticationPageOR;
import repository.HomePageOR;
import repository.MyAccountPageOR;
import repository.RegisterPageOR;

public class SampleStepDefs {
	BrowserActions actions = new BrowserActions();

	@Given("I Navigate to application")
	public void navigateToApplication() {
		actions.navigateUrl();
	}

	@Given("I select {string} element")
	public void selectElement(String field) {
		if (field.equalsIgnoreCase("Sign in")) {
			actions.clickElement(HomePageOR.lnk_SignIn);
		} else if (field.equalsIgnoreCase("Create an Account")) {
			actions.clickElement(AuthenticationPageOR.btn_CreateAnAccount);
		} else if (field.equalsIgnoreCase("Register")) {
			actions.clickElement(RegisterPageOR.btn_Register);
		} else if (field.equalsIgnoreCase("Any item")) {
			actions.clickElement(MyAccountPageOR.ele_HomeIcon);
			actions.clickElement(MyAccountPageOR.ele_Items);
		} else if (field.equalsIgnoreCase("Add to cart")) {
			actions.clickElement(MyAccountPageOR.ele_HomeIcon);
			actions.clickElement(MyAccountPageOR.btn_AddToCart);
		} else if (field.equalsIgnoreCase("Proceed to checkout")) {
			actions.clickElement(MyAccountPageOR.btn_ProceedToCheckout);
		} else if (field.equalsIgnoreCase("Terms of Service")) {
			actions.clickElement(MyAccountPageOR.chk_Terms);
		}

	}

	@Given("I enter Email Address")
	public void enterEmailAddress() {
		AuthenticationPageOR auth = new AuthenticationPageOR();
		auth.enterEmail();
	}

	@Given("I perform registration with below data")
	public void performRegistration(DataTable assignmentInfo) {
		List<Map<String, String>> aInfo = assignmentInfo.asMaps(String.class, String.class);
		String cusFirstName = aInfo.get(0).get("CusFirstName");
		String cusLastName = aInfo.get(0).get("CusLastName");
		String pwd = aInfo.get(0).get("Password");
		String dob = aInfo.get(0).get("Dob");
		String day = dob.split("-")[0];
		String month = dob.split("-")[1];
		String year = dob.split("-")[2];
		String firstName = aInfo.get(0).get("FirstName");
		String lastName = aInfo.get(0).get("LastName");
		String company = aInfo.get(0).get("Company");
		String address = aInfo.get(0).get("Address");
		String city = aInfo.get(0).get("City");
		String state = aInfo.get(0).get("State");
		String zip = aInfo.get(0).get("Zip");
		String country = aInfo.get(0).get("Country");
		String phone = aInfo.get(0).get("Phone");
		String assign = aInfo.get(0).get("Assign");

		RegisterPageOR register = new RegisterPageOR();
		register.performRegister(cusFirstName, cusLastName, pwd, day, month, year, firstName, lastName, company,
				address, city, state, zip, country, phone, assign);
	}

	@Then("user should be register")
	public void userShouldBeRegister() {
		Assert.assertTrue(actions.validateElementDisplay(MyAccountPageOR.ele_Account));
	}

	@And("Verify the user name in the screen")
	public void verifyUserDetails() {
		Assert.assertTrue(actions.validateElementDisplay(MyAccountPageOR.ele_Account));
	}

	@Then("Verify the product details in Payment page")
	public void verifyUserdeatilsInPaymntPage() {
		Assert.assertTrue(actions.validateElementDisplay(MyAccountPageOR.ele_CartItem));
	}
}
