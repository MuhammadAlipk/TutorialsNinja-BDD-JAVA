package resources.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

    //<editor-fold desc="Global Properties">
    public WebDriver _driver;
    public String baseUrl = "https://tutorialsninja.com/demo/";
    public Logger loggerObj = Logger.getLogger(BasePage.class);

    public BasePage(WebDriver driver)
    {
        _driver = driver;
    }
    //</editor-fold>

    //<editor-fold desc="Top Navigation BAr Links">
    public By MyAccount = By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]");
    public By Login_Link = By.cssSelector("#top-links > ul > li.dropdown.open > ul > li:nth-child(2) > a");
    public By linlk_Registration = By.cssSelector("#top-links > ul > li.dropdown.open > ul > li:nth-child(1) > a");
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

    public WebElement ReturnNavigationItem(String ItemName)
    {
       return  _driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li/a[text()='"+ ItemName+ "']"));
    }

    public WebElement ReturnTopBArElement(String itemNaem)
    {
        return _driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[text()='"+itemNaem+"']"));
    }

    public void click(By locator, String ElementName) throws Exception {
        try {

            if(_driver.findElement(locator).isDisplayed() && _driver.findElement(locator).isEnabled())
            {
                _driver.findElement(locator).click();
            }
            else
            {
                throw new Exception(ElementName + "is not displayed or is not enabled");
            }

        }
        catch (NoSuchElementException exc)
        {
            throw new Exception("Something went wrong please contact automation team");
        }


    }



}
