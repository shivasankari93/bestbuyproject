package page.component;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.component.Base;
import util.WebUtils;

public class MenuDepartment extends Base {
	@FindBy (xpath = "//div[@class=\"content\"]/child::div/div[2]/a[2]")
	WebElement countrySelect;
	@FindBy (xpath = "//button[@class=\"c-button-unstyled hamburger-menu-button\"]")
	WebElement menuBtn;
	@FindBy (xpath = "(//ul[@class=\"hamburger-menu-flyout-list\"]/li)[12]")
	WebElement homeBtn;
	@FindBy (xpath = "(//ul[@class=\"hamburger-menu-flyout-list\"]/li)[3]")
	WebElement furBtn;
	@FindBy (xpath = "//ul[@class='hamburger-menu-flyout-list']/li[4]/div/ul/li[4]/a")
	WebElement bedBtn;
	@FindBy (xpath = "(//div[contains(@id,'fulfillment-add-to-cart-button')])[3]")
	WebElement bedCart;
	public MenuDepartment() {
		PageFactory.initElements(driver, this);
	}
	public void departmentMethod() {
		clickEvent(countrySelect);
		threadSleepmethod();
		clickEvent(menuBtn);
		threadSleepmethod();
		clickEvent(homeBtn);
		threadSleepmethod();
		clickEvent(furBtn);
		threadSleepmethod();
		clickEvent(bedBtn);
		pageDownMethod();
		threadSleepmethod();
		clickEvent(bedCart);
	}
}
