package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;

import Wait.WaitUntil;

public class HomePage {

	WebDriver driver;

	By signInUpLink = By.cssSelector(".dst-sign-in-up");
	By signInLink = By.id("sign-in-modal-link");
	By email = By.id("label-email");
	By password = By.id("label-password");
	By signInButton = By.id("btnSignIn");
	By accountIcon = By.className("menu-nav__profile-button");
	By walletLink = By.xpath("//a[@href='/customer-account/payment']");

	public HomePage(WebDriver driver) {
		
		this.driver = driver;
	}

	public void clickSignInUpLink() {
		
		WaitUntil.elementIsAvailable(signInUpLink, driver).click();
	}

	public void clickSignInLink() {
		
		WaitUntil.elementIsAvailable(signInLink, driver).click();
	}

	public void enterUserName(String userName) {

		WaitUntil.elementIsAvailable(email, driver).sendKeys(userName);
	}

	public void enterPassword(String passWord) {

		WaitUntil.elementIsAvailable(password, driver).sendKeys(passWord);
	}

	public void clickSignInButton() {

		WaitUntil.elementIsAvailable(signInButton, driver).click();
	}

	public void clickGreetingLink() {
		try {
			driver.findElement(accountIcon).click();
		} catch (StaleElementReferenceException e) {
			WaitUntil.elementIsAvailable(accountIcon, driver).click();
		}
	}

	public PaymentPage clickWallet() {
		WaitUntil.elementIsAvailable(walletLink, driver).click();
		return new PaymentPage(driver);
	}
}
