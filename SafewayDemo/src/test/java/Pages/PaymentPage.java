package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Wait.WaitUntil;

public class PaymentPage {

	WebDriver driver;

	By viewAllReceipts = By.xpath("//*[contains(text(),'View all receipts')]");
	By noReceipts = By.xpath("//*[contains(@class, 'notFound') and text() = 'No Receipts Found']");

	public PaymentPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickViewAllReceipts() {

		WaitUntil.elementIsAvailable(viewAllReceipts, driver).click();
	}

	public boolean receiptsVisible() {

		return WaitUntil.elementIsAvailable(noReceipts, driver).isDisplayed();
	}
}
