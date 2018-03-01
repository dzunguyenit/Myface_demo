package myface;

import org.openqa.selenium.WebDriver;

import com.abtractpage.AbstractPage;

import myfaceUI.LoginPageUI;

public class LoginPage extends AbstractPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void inputUsername(String username) {
		waitForControlVisible(driver, LoginPageUI.USERNAME_TXT);
		sendKeyToElement(driver, LoginPageUI.USERNAME_TXT, username);
	}

	public void inputPassword(String password) {
		waitForControlVisible(driver, LoginPageUI.PASSWORD_TXT);
		sendKeyToElement(driver, LoginPageUI.PASSWORD_TXT, password);
	}

	public HomePage clickLogin() {
		waitForControlVisible(driver, LoginPageUI.LOGIN_BTN);
		clickToElement(driver, LoginPageUI.LOGIN_BTN);
		return new HomePage(driver);
	}
}
