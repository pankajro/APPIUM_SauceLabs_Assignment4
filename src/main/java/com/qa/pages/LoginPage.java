package com.qa.pages;

import org.openqa.selenium.support.PageFactory;
import com.qa.base.BaseTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage extends BaseTest {
	protected AppiumDriver driver;

	public LoginPage(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(accessibility = "test-Username")
	private MobileElement username;

	@AndroidFindBy(accessibility = "test-Password")
	private MobileElement password;

	@AndroidFindBy(accessibility = "test-LOGIN")
	private MobileElement loginBtn;

	public LoginPage enterUserName() {
		sendKeys(username, "standard_user");
		return this;
	}

	public LoginPage enterPassword() {
		sendKeys(password, "secret_sauce");
		return this;
	}

	public ProductsPage clickLoginBtn() {
		loginBtn.click();
		return new ProductsPage();
	}
}
