package resources.pages;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage
{
    public LoginPage(WebDriver driver)
    {
        super(driver);
    }

    public By txt_UserName = By.id("input-email");
    public By txt_Password = By.id("input-password");
    public By btn_LoginButton = By.xpath("asdfsdf");


    public void Login(String userName, String password)
    {
        _driver.findElement(MyAccount).click();
        _driver.findElement(Login_Link).click();
        Assert.assertEquals(_driver.getTitle(), "Account Login");
        _driver.findElement(txt_UserName).sendKeys(userName);
        _driver.findElement(txt_Password).sendKeys(password);

    }



}
