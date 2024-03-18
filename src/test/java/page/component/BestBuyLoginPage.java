package page.component;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.component.Base;
import util.WebUtils;

public class BestBuyLoginPage extends Base{
	@FindBy (xpath = "//div[@class=\"content\"]/child::div/div[2]/a[2]")
	WebElement countrySelect;
	@FindBy (xpath ="//span[@class=\"v-p-right-xxs line-clamp\"]")
	WebElement account;
	@FindBy (xpath ="//div[@class='guest-user']/a[1]")
	WebElement signIn;
	@FindBy (xpath = "//input[@type=\"email\"]")
	WebElement loginEmail;
	@FindBy (xpath = "//input[@type=\"password\"]")
	WebElement loginPass;
	@FindBy (xpath = "//button[@type=\"submit\"] ")
	WebElement loginBtn;
	public BestBuyLoginPage() {
		PageFactory.initElements(driver, this);
	}
	public void accountCreation() {
		clickEvent(countrySelect);
		threadSleepmethod();
		clickEvent(account);
		threadSleepmethod();
		clickEvent(signIn);
		threadSleepmethod();
		keyInput(loginEmail, "shivasankari1093@gmail.com");
		threadSleepmethod();
		keyInput(loginPass, "Ammu-1093");
		threadSleepmethod();
		clickEvent(loginBtn);
	}
	
}
