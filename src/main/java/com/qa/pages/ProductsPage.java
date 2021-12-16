package com.qa.pages;

import com.qa.base.BaseTest;
import com.qa.utils.TestUtils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ProductsPage extends BaseTest {
	TestUtils utils = new TestUtils();

	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Cart drop zone\"]/android.view.ViewGroup/android.widget.TextView")
	private MobileElement productName;

	@AndroidFindBy(xpath = "(//android.widget.TextView[@content-desc=\"test-Item title\"])[1]")
	private MobileElement productTitle;

	@AndroidFindBy(xpath = "(//android.widget.TextView[@content-desc=\"test-Price\"])[1]")
	private MobileElement productPrice;

	public String getTitle() {
		String title = getText(productTitle);
		return title;
	}

	public String getProductName() {
		String title = getText(productName);
		return title;
	}

	public String getProductPrice() {
		String price = getText(productPrice);
		return price;
	}

	public ProductDetailsPage clickProductTitle() {
		productName.click();
		return new ProductDetailsPage();
	}

}
