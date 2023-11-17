package resources.stepdefincations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import resources.pages.LoginPage;

import java.util.concurrent.TimeUnit;

public class Login {

    WebDriver driver;
    LoginPage loginPage;
    @Given("The user will navigate to the application.")
    public void theUserWillNavigateToTheApplication() {

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        loginPage = new LoginPage(driver);
        driver.get(loginPage.baseUrl);
        driver.manage().window().maximize();

    }

    @When("User enters a valid {string} and valid {string}.")
    public void userEntersAValidUsernameAndValidPassword(String UName, String password) {

        loginPage.Login(UName, password);
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
