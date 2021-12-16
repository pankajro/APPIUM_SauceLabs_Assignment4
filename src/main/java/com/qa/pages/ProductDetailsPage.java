package com.qa.pages;

import com.qa.base.BaseTest;
import com.qa.utils.TestUtils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ProductDetailsPage extends BaseTest {
	TestUtils utils = new TestUtils();

	@AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Description\"]/android.widget.TextView[1]\n")
	private MobileElement productName;

	@AndroidFindBy(accessibility = "test-BACK TO PRODUCTS")
	private MobileElement backToProductsBtn;

	public String getProductName() {
		String text = getText(productName);
		return text;
	}

	public ProductsPage pressBackToProductsBtn() {
		click(backToProductsBtn);
		return new ProductsPage();
	}

}
