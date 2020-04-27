package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import pageObjects.CartPage;
import pageObjects.CheckOutPage;
import pageObjects.HomePage;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Cucumber.UdemyCucumber.Base;

@RunWith(Cucumber.class)
public class StepDefinitionVegetables {
	public WebDriver driver;
	HomePage home;
	CheckOutPage checkout;
	CartPage cart;
	
    @Given("^User is on GREENKART landing page$")
    public void user_is_on_greenkart_landing_page() throws Throwable {
    	driver = Base.getDriver();
    	    	
        //throw new PendingException();
    }

    @When("^User searches for (.+) vegetable$")
    public void user_searches_for_something_vegetable(String strArg1) throws Throwable {    	
    	home = new HomePage(driver);
    	home.getSearch().sendKeys(strArg1);
    	Thread.sleep(3000);
    	//throw new PendingException();
    }

    @Then("^\"([^\"]*)\" results are displayed$")
    public void something_results_are_displayed(String strArg1) throws Throwable {
    	Assert.assertTrue(home.getProductName().getText().contains(strArg1));
    	
    	//throw new PendingException();
    }
      
    @Then("^verify selected (.+) items are displayed in checkout page$")
    public void verify_selected_items_are_displayed_in_checkout_page(String name) throws Throwable {
    	checkout = new CheckOutPage(driver);
    	Assert.assertTrue(checkout.getProductName().getText().contains(name));
    	
    	//throw new PendingException();
    }
    
     @And("^added items to cart$")
    public void added_items_to_cart() throws Throwable {
    	 home.incrementQuantity().click();
    	 home.addToCart().click();
    	
    	//throw new PendingException();
    }

    @And("^user proceeded to checkout page for purchase$")
    public void user_proceeded_to_checkout_page_for_purchase() throws Throwable {
    	cart = new CartPage(driver);
    	home.getCart().click();
    	cart.goToCheckout().click();
    	
    	//throw new PendingException();
    }


}
