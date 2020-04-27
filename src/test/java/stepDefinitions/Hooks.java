package stepDefinitions;

import cucumber.api.java.Before;
import Cucumber.UdemyCucumber.Base;
import cucumber.api.java.After;

public class Hooks extends Base {
	
	@Before("@MobileTest")
	public void beforeValidation() {
		System.out.println("Mobile Before hook");
	}
	
	@After("@MobileTest")
	public void afterValidation() {
		System.out.println("Mobile After hook");
	}
	
	@Before("@WebTest")
	public void beforeWeb() {
		System.out.println("Web Before hook");
	}
	
	@After("@WebTest")
	public void afterWeb() {
		System.out.println("Web After hook");
	}
	
	@After("@SeleniumTest")
	public void afterSeleniumTest() {
		driver.close();
	}
	
	@After("@SmokeTest")
	public void afterSmokeTest() {
		driver.close();
	}
	
	@After("@RegressionTest")
	public void afterRegressionTest() {
		driver.close();
	}

}
