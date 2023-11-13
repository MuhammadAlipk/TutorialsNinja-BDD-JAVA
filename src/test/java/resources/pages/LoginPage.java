package resources.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage
{
    public LoginPage(WebDriver driver)
    {
        super(driver);
    }

    By txt_UserName = By.id("input-email");
    By txt_Password = By.id("input-password");
    By btn_LoginButton = By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");


    public void Login(String userName, String password)
    {
        _driver.findElement(MyAccount).click();
        _driver.findElement(Login_Link).click();
        _driver.findElement(txt_UserName).sendKeys(userName);
        _driver.findElement(txt_Password).sendKeys(password);
        _driver.findElement(btn_LoginButton).click();
    }

}
