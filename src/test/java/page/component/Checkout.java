package page.component;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import test.component.Base;
import util.WebUtils;

public class Checkout extends Base{
	@FindBy (xpath = "//div[@class=\"content\"]/child::div/div[2]/a[2]")
	WebElement countrySelect;
	@FindBy (xpath = "//div[@class=\"bby-cart gvp-cart-icon-lv\"]/a")
	WebElement cart;
	@FindBy (xpath = "//div[@class='checkout-buttons__checkout']/button")
	WebElement checkout;
	@FindBy (xpath = "//*[@class='button--continue']")
	WebElement continueBtn;
	@FindBy (xpath = "//*[@id='first-name']")
	WebElement firstName;
	@FindBy (xpath = "//*[@id='last-name']")
	WebElement lastName;
	@FindBy (xpath = "//*[@id='address-input']")
	WebElement address;
	@FindBy (xpath = "//*[@id='city']")
	WebElement city;
	@FindBy (xpath = "//*[@id='state']")
	WebElement state;
	@FindBy (xpath = "//*[@id='postalCode']")
	WebElement postalCode;
	@FindBy (xpath = "//*[@class='payment__order-summary']")
	WebElement placeOrder;
	
	public Checkout() {
		PageFactory.initElements(driver, this);
	}
	public void checkoutMethod() {
		clickEvent(countrySelect);
		threadSleepmethod();
		clickEvent(cart);
		threadSleepmethod();
		clickEvent(checkout);
		threadSleepmethod();
		clickEvent(continueBtn);
		threadSleepmethod();
		keyInput(firstName, "test");
		threadSleepmethod();
		keyInput(lastName, "user");
		threadSleepmethod();
		keyInput(address, "testuser");
		threadSleepmethod();
		keyInput(city, "bangalore");
		threadSleepmethod();
		Select sel = new Select(state);
		sel.selectByIndex(1);
		keyInput(postalCode, "600201");
		threadSleepmethod();
		clickEvent(placeOrder);
		threadSleepmethod();
	}

}
