package resources.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import resources.pages.LoginPage;

import java.time.Duration;

public class Login {

    WebDriver driver;
    LoginPage loginPage;
    @Given("The user will navigate to the application.")
    public void theUserWillNavigateToTheApplication() {

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        loginPage = new LoginPage(driver);
        driver.get(loginPage.baseUrl);
        driver.manage().window().maximize();

    }

    @When("User enters a valid User Name and valid Password.")
    public void userEntersAValidUsernameAndValidPassword() {

        loginPage.Login(loginPage.userName, loginPage.Password);
    }

    @When("User enters a invalid UserName and valid Password.")
    public void userEntersAInvalidUsernameAndValidPassword() {

        loginPage.Login("adsfsdaf@gmail.com", loginPage.Password);
    }
    @When("User enters a valid UserName and invalid password.")
    public void userEntersAValidUsernameAndInvalidPassword() {

        loginPage.Login(loginPage.userName, "123654");
    }

    @When("User enters a valid UserName and empty password.")
    public void userEntersAValidUsernameAndEmptyPassword() {

        loginPage.Login(loginPage.userName, "");
    }

    @When("User enters a Empty UserName and Valid password.")
    public void userEntersEmptyUsernameAndValidPassword() {

        loginPage.Login("", loginPage.Password);
    }

    @When("User enters a Empty UserName and Empty password.")
    public void userEntersEmptyUsernameAndEmptyPassword() {

        loginPage.Login("", "");
    }



    @And("Clicks on the login button.")
    public  void  userClicksOnLoginButton() throws Exception {
        loginPage.click(loginPage.btn_LoginButton, "LoginButton");
    }
    @Then("user should be authenticated and should be navigated to the home page of application.")
    public void authWithValidCredentials()
    {
        Assert.assertEquals(loginPage._driver.getTitle(), "My Account");
        driver.quit();
    }

    @Then("user should not be authenticated and there should be an error message.")
    public void authWithInvalidCredentials()
    {
        Assert.assertNotEquals(loginPage._driver.getTitle(), "My Account");
        driver.quit();
    }


}
