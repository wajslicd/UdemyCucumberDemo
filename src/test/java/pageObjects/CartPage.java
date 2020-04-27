package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
	public WebDriver driver;
	
	public CartPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By proceedToCheckout = By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
	
	
	public WebElement goToCheckout() {
		return driver.findElement(proceedToCheckout);
		
	}
	
	

}
