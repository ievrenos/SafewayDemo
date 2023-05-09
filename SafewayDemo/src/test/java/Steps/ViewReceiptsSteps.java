package Steps;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import Driver.Driver;
import Pages.HomePage;
import Pages.PaymentPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ViewReceiptsSteps {

	WebDriver driver;
	HomePage homePage;
	PaymentPage paymentPage;

	public ViewReceiptsSteps() {
		driver = Driver.GetDriver();
		homePage = new HomePage(driver);
	}

	@Given("user opens Safeway")
	public void user_opens_Safeway() {

		driver.get("https://www.safeway.com/");
		driver.manage().window().maximize();
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) {

		homePage.clickSignInUpLink();
		homePage.clickSignInLink();
		homePage.enterUserName(username);
		homePage.enterPassword(password);
	}

	@And("clicks on sign in button")
	public void clicks_on_sign_in_button() {
		homePage.clickSignInButton();
	}

	@And("user signs in successfully")
	public void user_signs_in_successfully() {
		homePage.clickGreetingLink();
	}

	@And("clicks on wallet")
	public void clicks_on_wallet() {
		paymentPage = homePage.clickWallet();
	}

	@And("clicks on view all receipts")
	public void clicks_on_view_all_receipts() {
		paymentPage.clickViewAllReceipts();
	}

	@Then("user can view digital receipts")
	public void user_can_view_digital_receipts() {
		Assert.assertTrue(paymentPage.receiptsVisible());
	}
}
