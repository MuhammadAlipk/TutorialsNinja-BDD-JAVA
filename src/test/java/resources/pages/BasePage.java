package resources.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class BasePage {

    //<editor-fold desc="Global Properties">
    public WebDriver _driver;
    public String baseUrl = "https://tutorialsninja.com/demo/";

    public BasePage(WebDriver driver)
    {
        _driver = driver;
    }
    //</editor-fold>

    //<editor-fold desc="Top Navigation BAr Links">
    public By MyAccount = By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]");
    public By Login_Link = By.cssSelector("#top-links > ul > li.dropdown.open > ul > li:nth-child(2) > a");
    public By linl_Registration = By.cssSelector("#top-links > ul > li.dropdown.open > ul > li:nth-child(1) > a");
    public By link_PhoneNumber = By.cssSelector("#top-links > ul > li:nth-child(1) > span");
    public By link_WishList= By.cssSelector("#wishlist-total > span");
    public By link_CartTopNav = By.cssSelector("#top-links > ul > li:nth-child(4) > a > span");
    public By link_CheckOut = By.cssSelector("#top-links > ul > li:nth-child(5) > a > span");
    public By drop_currency = By.cssSelector("#form-currency > div > button");
    public By currency_EUR = By.cssSelector("#form-currency > div > ul > li:nth-child(1) > button");
    public By currency_POUND = By.cssSelector("#form-currency > div > ul > li:nth-child(2) > button");
    public By currency_USD  = By.cssSelector("#form-currency > div > ul > li:nth-child(3) > button");

    //</editor-fold>

    //<editor-fold desc="Global Header">
    public By txt_GlobalSearch = By.cssSelector("#search > input");
    public By btn_GlobalSearch = By.cssSelector("#search > span > button");
    public By btn_Home = By.cssSelector("#logo > h1 > a");
    //</editor-fold>

    public void click(By locator, String ElementName)
    {
        try {
            _driver.findElement(locator).click();
        }
        catch (NoSuchElementException exc)
        {

        }

    }



}
