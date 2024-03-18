package page.component;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.component.Base;
import util.WebUtils;

public class NavigationMenu extends Base {
	@FindBy (xpath = "//div[@class=\"content\"]/child::div/div[2]/a[2]")
	WebElement countrySelect;
	@FindBy (xpath = "//ul[@class='bottom-nav-left lv']/li[1]/a")
	WebElement topBrand;
	@FindBy (xpath = "//div[@class='top-nav']/a")
	WebElement bestBuy;
	@FindBy (xpath = "//ul[@class='bottom-nav-left lv']/li[2]/a")
	WebElement deal;
	@FindBy (xpath = "//ul[@class='bottom-nav-left lv']/li[3]/a")
	WebElement sell;
	@FindBy (xpath = "//ul[@class='bottom-nav-left lv']/li[4]/a")
	WebElement membership;
	public NavigationMenu() {
		PageFactory.initElements(driver, this);
	}
	public void menuMethod() {
		clickEvent(countrySelect);
		threadSleepmethod();
		String title = getTitleMethod();
		System.out.println(title);
		clickEvent(topBrand);
		threadSleepmethod();
		String topBrandTitle = getTitleMethod();
		System.out.println(topBrandTitle);
		threadSleepmethod();
		clickEvent(deal);
		threadSleepmethod();
		String dealTitle = getTitleMethod();
		System.out.println(dealTitle);
		threadSleepmethod();
		clickEvent(sell);
		threadSleepmethod();
		String sellTitle = getTitleMethod();
		System.out.println(sellTitle);
		threadSleepmethod();
		clickEvent(membership);
		threadSleepmethod();
		String membershipTitle = getTitleMethod();
		System.out.println(membershipTitle);
	}
}
