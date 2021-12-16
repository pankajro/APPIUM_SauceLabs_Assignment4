package com.qa.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.base.BaseTest;
import com.qa.pages.LoginPage;
import com.qa.pages.ProductDetailsPage;
import com.qa.pages.ProductsPage;

public class ValidateProductTest extends BaseTest {

	@Test
	public void Login() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUserName();
		loginPage.enterPassword();

		ProductsPage productsPage = loginPage.clickLoginBtn();
		String actualTitle1 = productsPage.getTitle();
		String expectedTitle1 = "PRODUCTS";
		Assert.assertEquals(actualTitle1, expectedTitle1);

		String actualProductName = productsPage.getProductName();
		String expectedProductName = "Sauce Labs Backpack";
		Assert.assertEquals(actualProductName, expectedProductName);

		String actualProductPrice = productsPage.getProductPrice();
		String expectedProductPrice = "$29.99";
		Assert.assertEquals(actualProductPrice, expectedProductPrice);

		ProductDetailsPage productDetailsPage = productsPage.clickProductTitle();
		productDetailsPage.getProductName();
		productDetailsPage.pressBackToProductsBtn();

	}

}
