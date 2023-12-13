package resources.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import resources.Utilties.ConfigurationFileReader;

public class BasePage {

    //<editor-fold desc="Global Properties">
    public WebDriver _driver;

    ConfigurationFileReader fileReader;
    public String baseUrl;
    public String userName;
    public String Password;
    public Logger loggerObj;

    public BasePage(WebDriver driver)
    {
        _driver = driver;
        fileReader = new ConfigurationFileReader();
        baseUrl = fileReader.getSingleValue("BaseURl");
        userName = fileReader.getSingleValue("UserName");
        Password = fileReader.getSingleValue("Password");
        loggerObj = Logger.getLogger(BasePage.class);
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

    public WebElement ReturnTopBarElement(String itemName)
    {
        return _driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[text()='"+itemName+"']"));
    }

    public void click(By locator, String ElementName){
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
        catch (Exception exc)
        {
            loggerObj.debug("Exception Location: "+ ElementName + " "  +exc.getMessage());
        }


    }

    public  void enterText(By locator, String text, String ElementName)
    {
        try{

            if(_driver.findElement(locator).isDisplayed() && _driver.findElement(locator).isEnabled())
            {
                _driver.findElement(locator).sendKeys(text);
            }
            else
            {
                throw new Exception(ElementName + "is not displayed or is not enabled");
            }

        }
        catch (Exception exc)
        {
            loggerObj.debug("Exception Location: "+ ElementName + " "  +exc.getMessage());
        }

    }
    public String getText(By locator, String ElementName)
    {
        try{


            if(_driver.findElement(locator).isDisplayed() && _driver.findElement(locator).isEnabled())
            {
                 return _driver.findElement(locator).getText();
            }
            else
            {
                throw new Exception(ElementName + "is not displayed or is not enabled");
            }

        }
        catch (Exception exc)
        {
            loggerObj.debug("Exception Location: "+ ElementName + " "  +exc.getMessage());
            return null;
        }

    }



}
