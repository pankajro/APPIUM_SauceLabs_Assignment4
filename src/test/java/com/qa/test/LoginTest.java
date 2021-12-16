package com.qa.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.qa.pages.*;
import com.qa.base.BaseTest;

public class LoginTest extends BaseTest {

	@Test
	public void Test() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUserName();
		loginPage.enterPassword();

		ProductsPage productsPage = loginPage.clickLoginBtn();
		String actualProductTitle = productsPage.getTitle();
		String expectedProductTitle = "PRODUCTS";
		Assert.assertEquals(actualProductTitle, expectedProductTitle);

		String actualProductName = productsPage.getProductName();
		String expectedProductName = "Sauce Labs Backpack";
		Assert.assertEquals(actualProductName, expectedProductName);

		String actualProductPrice = productsPage.getProductPrice();
		String expectedProductPrice = "$29.99";
		Assert.assertEquals(actualProductPrice, expectedProductPrice);

		ProductDetailsPage ProductDetailsPage = productsPage.clickProductTitle();
		ProductDetailsPage.confirmProduct();

	}

}
