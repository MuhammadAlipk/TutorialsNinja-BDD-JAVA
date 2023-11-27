package resources.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterationPage extends BasePage
{

    public By link_RegisterPage = By.cssSelector("#top-links > ul > li.dropdown.open > ul > li:nth-child(1) > a");
    public By txt_FtName = By.id("input-firstname");
    public By txt_LName = By.id("input-lastname");
    public By txt_Email = By.id("input-email");
    public By txt_Phone = By.id("input-telephone");
    public By txt_Password = By.id("input-password");
    public By txt_CPassword = By.id("input-confirm");
    public By radio_NewsLetterYes = By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]");
    public By radio_NewsLetterNo = By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[2]");
    public By check_Terms = By.xpath("//*[@id=\"content\"]/form/div/div/input[1]");
    public By btn_Continue = By.xpath("//input[@value='Continue']");
    public By lbl_successMessage = By.xpath("//*[@id=\"content\"]/h1");

    public RegisterationPage(WebDriver driver)
    {
        super(driver);
    }

    public void NavigateToRegistrationPage() throws Exception {
        ReturnTopBarElement("My Account").click();
        click(link_RegisterPage, "Registration Page Link");
    }

    public void RegisterUser()
    {

    }

}
