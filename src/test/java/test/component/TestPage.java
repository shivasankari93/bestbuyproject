package test.component;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import page.component.BestBuyLoginPage;
import page.component.BestBuySignupPage;
import page.component.BottomLinks;
import page.component.LinkTester;
import page.component.MenuBrand;
import page.component.MenuDepartment;
import page.component.NavigationMenu;
import page.component.ProductPurchase;
import util.WebUtils;

public class TestPage extends Base{
	@Test 
	public void testOne() {
		BestBuySignupPage signobj = new BestBuySignupPage();
		signobj.signUpMethod();
		ExtentTest test = report.createTest("TestOne");
		test.log(Status.PASS, "success");
		test.log(Status.INFO, "signUp method");
		
		String s = getScreenshotMethod("testOne");
		test.addScreenCaptureFromBase64String(s);
		report.flush();
	}
	@Test 
	public void testTwo() {
		BestBuyLoginPage logobj = new BestBuyLoginPage();
		logobj.accountCreation();
		ExtentTest test = report.createTest("TestTwo");
		test.log(Status.PASS, "success");
		test.log(Status.INFO, "login method");
		
		String s = getScreenshotMethod("testTwo");
		test.addScreenCaptureFromBase64String(s);
		report.flush();
		
	}
	@Test
	public void testThree() {
		ProductPurchase objOne = new ProductPurchase();
	objOne.purchaseMethod();
	ExtentTest test = report.createTest("TestThree");
		test.log(Status.PASS, "success");
	test.log(Status.INFO, "product method");
		
		String s = getScreenshotMethod("testThree");
		test.addScreenCaptureFromBase64String(s);
		report.flush();
		}
	@Test
	public void testFour() {
		MenuDepartment objTwo = new MenuDepartment();
		objTwo.departmentMethod();
		ExtentTest test = report.createTest("TestFour");
		test.log(Status.PASS, "success");
		test.log(Status.INFO, "MenuDepartment method");
		
		String s = getScreenshotMethod("testFive");
		test.addScreenCaptureFromBase64String(s);
		report.flush();
	}
	@Test 
	public void testFive() {
		MenuBrand objThree = new MenuBrand();
		objThree.brandMethod();
		ExtentTest test = report.createTest("TestFive");
		test.log(Status.PASS, "success");
		test.log(Status.INFO, "brandMethod method");
		
		String s = getScreenshotMethod("testFive");
		test.addScreenCaptureFromBase64String(s);
		report.flush();
	}
	@Test
	public void testSix() {
		NavigationMenu objFour = new NavigationMenu();
		objFour.menuMethod();
		ExtentTest test = report.createTest("TestSix");
		test.log(Status.PASS, "success");
		test.log(Status.INFO, "NavigationMenu method");
		
		String s = getScreenshotMethod("testSix");
		test.addScreenCaptureFromBase64String(s);
		report.flush();
	}
	@Test 
	public void testSeven() {
		BottomLinks objFive = new BottomLinks();
		objFive.bottomLinkMethod();
		ExtentTest test = report.createTest("TestSeven");
		test.log(Status.PASS, "success");
		test.log(Status.INFO, "bottomLinkMethod method");
		
		String s = getScreenshotMethod("testSeven");
		test.addScreenCaptureFromBase64String(s);
		report.flush();
	}
	@Test 
	public void testEight() {
		LinkTester objSix = new LinkTester();
		objSix.linkMethod();
		ExtentTest test = report.createTest("TestEight");
		test.log(Status.PASS, "success");
		test.log(Status.INFO, "linkMethod method");
		
		String s = getScreenshotMethod("testEight");
		test.addScreenCaptureFromBase64String(s);
		report.flush();
	}

}
