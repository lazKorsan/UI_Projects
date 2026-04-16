package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static utils.ClickUtils.clickByXpath;
import static utils.SendKeysUtils.sendByXpath;

public class ExamplePage extends BasePage{

    private static final Logger logger = LogManager.getLogger(ExamplePage.class);

    public static final String mailBox="//input[@id=\"email\"]";
    public static final String passwordBox="//input[@id=\"password\"]";
    public static final String submitButton="//button[@class='btn btn-primary btn-block mt-20']";





    public ExamplePage(WebDriver driver) {
        super(driver);
        org.openqa.selenium.support.PageFactory.initElements(driver, this);
    }

   // @FindBy(xpath = "//input[@id=\"email\"]")
    //public static WebElement mailBox;

    //@FindBy(xpath = "//input[@id=\"password\"]")
    //public static WebElement passwordBox;

    //@FindBy(xpath = "//button[@class='btn btn-primary btn-block mt-20']")
    //public static WebElement submitButton;

public static void loginMethod(WebDriver driver, String mail, String password){


        // todo Kullanici mail adresini girer
    logger.info("Kullanici email kutusuna gecerli mail adresi girer");


    sendByXpath(driver,mailBox,"ahmet.student@instulearn.com");


    logger.info("Kullanici email kutusuna gecerli mail adresi girdi");


    // todo Kullanici password girer
    logger.info("Kullanici password kutusuna gecerli password girer");


    sendByXpath(driver,passwordBox,"InstuLearn.2026!");


    logger.info("Kullanici password kutusuna gecerli password girdi");

    // todo LoginButton a tiklar
    logger.info("Kullanici submitButton tiklar");


    clickByXpath(driver, submitButton);


    logger.info("Kullanici submitButton tiklandi");


}

}
