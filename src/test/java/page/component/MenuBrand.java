package page.component;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.component.Base;
import util.WebUtils;

public class MenuBrand extends Base {
//	@FindBy (xpath = "")
//	WebElement ;
	@FindBy (xpath = "//div[@class=\"content\"]/child::div/div[2]/a[2]")
	WebElement countrySelect;
	@FindBy (xpath = "//button[@class=\"c-button-unstyled hamburger-menu-button\"]")
	WebElement menuBtn;
	@FindBy (xpath = "//ul[@class='hamburger-menu-flyout-list']/li[3]/button")
	WebElement brand;
	@FindBy (xpath = "//ul[@class='hamburger-menu-flyout-list']/li[4]/div/ul/li[2]/a")
	WebElement appleBrand;
	@FindBy (xpath = "//div[@class='widget widget-flex']/div/div[2]/div[1]/div[2]/div/a")
	WebElement iphone;
	@FindBy (xpath = "//div[@class='flex-wrapper gray-theme imageLinkAndDescription-type']/div[2]/div[2]/div[8]/div/a")
	WebElement iphoneModel;
	@FindBy (xpath = "(//div[contains(@id,'fulfillment-add-to-cart-button')])[1]")
	WebElement addToCart;
	public MenuBrand() {
		PageFactory.initElements(driver, this);
	}
	public void brandMethod() {
		clickEvent(countrySelect);
		threadSleepmethod();
		clickEvent(menuBtn);
		threadSleepmethod();
		clickEvent(brand);
		threadSleepmethod();
		clickEvent(appleBrand);
		threadSleepmethod();
		clickEvent(iphone);
		threadSleepmethod();
		clickEvent(iphoneModel);
		threadSleepmethod();
//		pageDownMethod();
//		threadSleepmethod();
//		pageDownMethod();
		clickEvent(addToCart);

	}
	
}
