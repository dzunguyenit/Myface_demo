package a;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.AbstractTest;
import myface.HomePage;
import myface.LoginPage;
import myface.ProductPage;

public class product extends AbstractTest {
	WebDriver driver;
	private LoginPage loginPage;
	private HomePage homePage;
	private ProductPage productPage;
	String username, password, urlProduct, productname, sku;

	@Parameters({ "browser", "url", "version" })
	@BeforeClass
	public void beforeClass(String browser, String url, String version) {
		username = "myfacefinal@gmail.com";
		password = "123456";
		productname = "nguyen";
		sku = "kaaaaa12";
		urlProduct = "https://tintinshop.myface.vn/admin/product/product";

		driver = gotourl(browser, url, version);
	}

	@Test
	public void TC_27_EmailCannotHaveBlankSpace() {
		loginPage = new LoginPage(driver);
		loginPage.inputUsername(username);
		loginPage.inputPassword(password);
		homePage = loginPage.clickLogin();
		productPage = homePage.openProductPage(urlProduct);
		productPage.clickCreateProduct();
		productPage.inputProductName(productname);
		productPage.inputSKU(sku);
	}

	@AfterClass
	public void afterClass() {
		closeBrowser();
	}
}
