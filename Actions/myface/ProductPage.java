package myface;

import org.openqa.selenium.WebDriver;

import com.abtractpage.AbstractPage;

import myfaceUI.ProductPageUI;

public class ProductPage extends AbstractPage {
	WebDriver driver;

	public ProductPage(WebDriver driver) {
		this.driver = driver;
	}

	public void inputProductName(String productname) {
		waitForControlVisible(driver, ProductPageUI.PRODUCT_NAME_TXT);
		sendKeyToElement(driver, ProductPageUI.PRODUCT_NAME_TXT, productname);
	}

	public void inputSKU(String sku) {
		waitForControlVisible(driver, ProductPageUI.SKU_TXT);
		sendKeyToElement(driver, ProductPageUI.SKU_TXT, sku);
	}

	public void clickCreateProduct() {
		waitForControlVisible(driver, ProductPageUI.CREATE_PRODUCT_BTN);
		clickToElement(driver, ProductPageUI.CREATE_PRODUCT_BTN);
	}
}
