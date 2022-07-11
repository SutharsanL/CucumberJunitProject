package com.vcentry.lab.stepDefinition;

import com.vcentry.lab.base.BaseClass;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestSteps extends BaseClass{

@Given("User should Open browser as {string}")
public void user_should_open_browser_as(String string) {
    openBrowser(string);
    initObject();
}

@Given("User should Launch url")
public void user_should_launch_url() {
	System.out.println("driver: "+getDriver.get(Thread.currentThread().getId()));
    getDriver.get(Thread.currentThread().getId())
    .get("https://www.saucedemo.com/");
}

@Given("User enter Username {string}")
public void user_enter_username(String string) {
   login.enterUsername(string);
}

@Given("User enter Password {string}")
public void user_enter_password(String string) {
login.enterPassword(string);
}

@When("Click on Login button")
public void click_on_login_button() {
login.clickLogin();
}

@Then("User should navigate to HomePage")
public void user_should_navigate_to_home_page() {
    home.verifyHomePage();
}

@Then("User should get error message")
public void User_should_get_error_message() {
    login.verifyErrorMessage();
}
@Given("Add Backpack to the cart")
public void ADD_Backpack_toCart() {
	home.addBackpacktoCart();
	cart.verifyProductinCart();
}
@And("Click Checkout and enter details")
public  void Click_Checkout_and_enter_details() {
	cart.clickCheckout();
	cart.enterCheckoutDetails("Test", "test", "345678");
}
@When("Click on continue and Finish")
public void Click_on_continue_and_Finish() {
	cart.clickFinish();
}

@Then("Verify the Order Placed Message")
public void Verify_the_Order_Placed_Message() {
	cart.verifyOrderPlaced();
}


}
