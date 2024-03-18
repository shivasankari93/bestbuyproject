package page.component;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.component.Base;
import util.WebUtils;

public class BottomLinks extends Base{
	@FindBy (xpath = "//div[@class=\"content\"]/child::div/div[2]/a[2]")
	WebElement countrySelect;
	@FindBy (xpath = "//*[@id='footer']/ul/li[1]/div/a")
	WebElement support;
	@FindBy (xpath = "//*[@id='footer']/ul/li[2]/div/a")
	WebElement order;
	@FindBy (xpath = "//*[@id='footer']/ul/li[3]/div/a")
	WebElement store;
	@FindBy (xpath = "//*[@id='footer']/ul/li[4]/div/a")
	WebElement exchange;
	@FindBy (xpath = "//a[@class='mini-header-logo__link']")
	WebElement bestBuy;
	public BottomLinks() {
		PageFactory.initElements(driver, this);
	}
	public void bottomLinkMethod() {
		clickEvent(countrySelect);
		threadSleepmethod();
		String title = getTitleMethod();
		System.out.println(title);
//		pageDownMethod();
		clickEvent(support);
		String supportTitle = getTitleMethod();
		System.out.println(supportTitle);
		threadSleepmethod();
//		pageDownMethod();
		clickEvent(order);
		String orderTitle = getTitleMethod();
		System.out.println(orderTitle);
		threadSleepmethod();
		clickEvent(bestBuy);
//		pageDownMethod();
		clickEvent(store);
		String storeTitle = getTitleMethod();
		System.out.println(storeTitle);
		threadSleepmethod();
//		pageDownMethod();
		clickEvent(exchange);
		String exchangeTitle = getTitleMethod();
		System.out.println(exchangeTitle);
	}
}
