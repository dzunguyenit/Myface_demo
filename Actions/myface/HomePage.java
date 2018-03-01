package myface;

import org.openqa.selenium.WebDriver;

import com.abtractpage.AbstractPage;

public class HomePage extends AbstractPage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public ProductPage openProductPage(String url) {
		openUrl(driver, url);
		return new ProductPage(driver);
	}

}
