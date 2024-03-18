package page.component;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.component.Base;
import util.WebUtils;

public class ProductPurchase extends Base{
	@FindBy (xpath = "//div[@class=\"content\"]/child::div/div[2]/a[2]")
	WebElement countrySelect;
	@FindBy (xpath = "//input[@class=\"search-input\"]")
	WebElement searchInput;
	@FindBy (xpath = "//span[@class=\"header-search-icon\"]")
	WebElement searchIcon;
	@FindBy (xpath = "//div[contains(@id, 'fulfillment-add-to-cart-button')]/div/div/div/button")
	WebElement cartButton;
	@FindBy (xpath = "//div[@class=\"go-to-cart-button\"]")
	WebElement goToCart;
	@FindBy (xpath = "//div[@class=\"checkout-buttons__checkout\"]")
	WebElement checkOut;
	@FindBy (xpath = "//div[@class=\"cia-guest-content\"]/div[2]/button")
	WebElement guestBtn;
	@FindBy (xpath = "//input[@id=\"user.emailAddress\"]")
	WebElement emailAdd;
	@FindBy (xpath = "//input[@id=\"user.phone\"]")
	WebElement phoneAdd;
	@FindBy (xpath = "//div[@class=\"button--continue\"]")
	WebElement continueBtn;

	public ProductPurchase() {
		PageFactory.initElements(driver, this);
	}
	public void purchaseMethod() {
		clickEvent(countrySelect);
		threadSleepmethod();
//		keyInput(searchInput, "blu - g53 s64gb (unlocked) - pearlm");
		keyInput(searchInput, "iphone 13");
		threadSleepmethod();
		clickEvent(searchIcon);
		threadSleepmethod();
		clickEvent(cartButton);
		threadSleepmethod();
		clickEvent(goToCart);
		threadSleepmethod();
		clickEvent(checkOut);
		threadSleepmethod();
		clickEvent(guestBtn);
		threadSleepmethod();
		keyInput(emailAdd, "shivasankari1093@gmail.com");
		threadSleepmethod();
		keyInput(phoneAdd, "9629447567");
		threadSleepmethod();
		clickEvent(continueBtn);
		
	}
}
