package page.component;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.component.Base;
import util.WebUtils;

public class BestBuySignupPage extends Base {
	@FindBy (xpath = "//div[@class=\"content\"]/child::div/div[2]/a[2]")
	WebElement countrySelect;
	@FindBy (xpath ="//span[@class=\"v-p-right-xxs line-clamp\"]")
	WebElement account;
	@FindBy (xpath="//a[@class=\"c-button c-button-outline c-button-sm create-account-btn\"]")
	WebElement accountCreation;
	@FindBy (xpath = "//input[@id=\"firstName\"]")
	WebElement firstName;
	@FindBy (xpath = "//input[@id=\"lastName\"]")
	WebElement lastName;
	@FindBy (xpath = "//input[@id=\"email\"]")
	WebElement email;
	@FindBy (xpath = "(//input[@type=\"password\"])[1]")
	WebElement password;
	@FindBy (xpath = "//input[@id=\"reenterPassword\"]")
	WebElement confirmPass;
	@FindBy (xpath = "//input[@id=\"phone\"]")
	WebElement phone;
	@FindBy (xpath = "//div[@class=\"cia-form__controls \"]/button")
	WebElement createAccountBtn;
	@FindBy (xpath = "//div[@class=\"cia-settings-container\"]//child::div/div/div/a")
	WebElement signIn;

	public BestBuySignupPage() {
		PageFactory.initElements(driver, this);
	}
	public void signUpMethod() {
		clickEvent(countrySelect);
		threadSleepmethod();
		clickEvent(account);
		threadSleepmethod();
		clickEvent(accountCreation);
		threadSleepmethod();
		keyInput(firstName, "test");
		threadSleepmethod();
		keyInput(lastName, "user");
		threadSleepmethod();
		keyInput(email, "shivasankari1093@gmail.com");
		threadSleepmethod();
		keyInput(password, "Ammu-1093");
		threadSleepmethod();
		keyInput(confirmPass, "Ammu-1093");
		threadSleepmethod();
		keyInput(phone, "9629447567");
		threadSleepmethod();
		clickEvent(createAccountBtn);
		threadSleepmethod();
		clickEvent(signIn);
		
		
		
		
	}
}
