package resources.stepdefincations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import resources.Utilties.Users;
import resources.pages.RegisterationPage;
import java.time.Duration;

public class RegisterNewUSer {

    public WebDriver driver;
    public Users  user = new Users();
    public RegisterationPage registerationPage;
    @io.cucumber.java.en.Given("The user will navigate to the Registration page.")
    public void theUserWillNavigateToTheRegistrationPage(){
        try {
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
            registerationPage = new RegisterationPage(driver);
            driver.get(registerationPage.baseUrl);
            driver.manage().window().maximize();
            registerationPage.NavigateToRegistrationPage();
        }
        catch (Exception exc)
        {

        }
    }

    @When("user Enters First Name {string}.")
    public void userEntersFirstName(String arg0) {
        user.fName = arg0;
        registerationPage.enterText(registerationPage.txt_FtName, arg0,
                "First Name Text Box on Registration Page");

    }

    @And("User Enters LastName {string}.")
    public void userEntersLastName(String arg0) {
        user.LName = arg0;
        registerationPage.enterText(registerationPage.txt_LName, arg0,
                "Last Name Text Box on Registration Page");
    }

    @And("User Enters an email Address {string}.")
    public void userEntersAnEmailAddress(String arg0) {

        user.email = Math.random() + arg0;
        registerationPage.enterText(registerationPage.txt_Email, user.email,
                "Email Address Text Box on Registration Page");
    }

    @And("User Enters a phone number {string}.")
    public void userEntersAPhoneNumber(String arg0) {
        user.phone = arg0;
        registerationPage.enterText(registerationPage.txt_Phone, arg0,
                "Phone Number Text Box on Registration Page");
    }
    @And("User Enters a password {string}.")
    public void userEntersAPassword(String arg0) {
        user.password = arg0;
        registerationPage.enterText(registerationPage.txt_Password, arg0,
                "Password Text Box on Registration Page");

    }
    @And("User Enters a Confirm password {string}.")
    public void userEntersAConfirmPassword(String arg0) {

        user.cPassword = arg0;
        registerationPage.enterText(registerationPage.txt_CPassword, arg0,
                "Confirm Password Text Box on Registration Page");

    }

    @And("User clicks on Terms and condition check box {string}.")
    public void userClicksOnTermsAndConditionCheckBox(String arg0) {
        user.isTermsCondtionsAccept = Boolean.parseBoolean(arg0);
        if(user.isTermsCondtionsAccept = true)
        {
            registerationPage.click(registerationPage.check_Terms,
                        "Terms and condition checkbox on registration page");
        }

    }

    @And("User clicks on Continue button.")
    public void userClicksOnContinueButton() {
        registerationPage.click(registerationPage.btn_Continue, "Continue Button at registration page");
    }

    @Then("The new user should be register successfully.")
    public void theNewUserShouldBeRegisterSuccessfully() {

        Assert.assertEquals(registerationPage.getText(registerationPage.lbl_successMessage,
                        "Success message label on registration screen "),
                "Your Account Has Been Created!");
        driver.quit();

    }

    @And("User subscribe newsletter {string}.")
    public void userSubscribeNewsletter(String arg0) {
        registerationPage.click(registerationPage.radio_NewsLetterNo,"Newsletter radio button on registration button");
    }
}
