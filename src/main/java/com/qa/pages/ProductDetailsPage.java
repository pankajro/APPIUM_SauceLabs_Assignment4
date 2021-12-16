package com.qa.pages;

import com.qa.base.BaseTest;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ProductDetailsPage extends BaseTest {

	@AndroidFindBy(xpath = "(//android.widget.TextView[@content-desc=\"test-Item title\"])[1]")
	private MobileElement confirmProduct;

	public String confirmProduct() {
		String title = getText(confirmProduct);
		return title;
	}
}
