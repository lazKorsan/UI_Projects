package stepdefinitions;

import config.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pages.ExamplePage;


import java.util.Map;

import static pages.ExamplePage.*;

import static utils.ClickUtils.clickByXpath;
import static utils.SendKeysUtils.sendByXpath;

public class exampleSteps {

    private static final Logger logger = LogManager.getLogger(exampleSteps.class);
    WebDriver driver = stepdefinitions.Hooks.getDriver();
    ExamplePage examplePage = new ExamplePage(driver);

    @Given("Kullanici ana sayfaya gider")
    public void kullanici_ana_sayfaya_gider() {

        logger.info("Kullanici ana sayfaya gider");
        driver.get(ConfigReader.getProperty("url"));
        logger.info("Kullanici ana sayfaya gitti");

    }


    @Given("Kullanici login page sayfasina gider")
    public void kullanici_login_page_sayfasina_gider() {

        logger.info("Kullanici login page sayfasina gider");
        driver.get("https://qa.instulearn.com/login");
        logger.info("Kullanici login page sayfasina gitti");


    }
    @Given("Kullanici email kutusuna gecerli mail adresi girer")
    public void kullanici_email_kutusuna_gecerli_mail_adresi_girer() {

        logger.info("Kullanici email kutusuna gecerli mail adresi girer");


        sendByXpath(driver,mailBox,"ahmet.student@instulearn.com");


        logger.info("Kullanici email kutusuna gecerli mail adresi girdi");

    }
    @Given("Kullanici password kutusuna gecerli password girer")
    public void kullanici_password_kutusuna_gecerli_password_girer() {
        logger.info("Kullanici password kutusuna gecerli password girer");


        sendByXpath(driver,passwordBox,"InstuLearn.2026!");


        logger.info("Kullanici password kutusuna gecerli password girdi");

    }
    @Given("Kullanici submitButton tiklar")
    public void kullanici_submit_button_tiklar() {
        logger.info("Kullanici submitButton tiklar");


        clickByXpath(driver, submitButton);


        logger.info("Kullanici submitButton tiklandi");

    }

    @When("Kullanici mail adresi {string} ve tanimli password ile  {string} giris yapar")
    public void kullaniciMailAdresiVeTanimliPasswordIleGirisYapar(String mail, String password) {

        loginMethod(driver,mail,password);


    }

    @When("Kullanici mail adresi ile {string} ve tanimli password ile  {string} giris yapar")
    public void kullaniciMailAdresiIleVeTanimliPasswordIleGirisYapar(String mail, String password) {

        loginMethod(driver,mail,password);


    }

    @When("Kullanici mesaj kutusuna su notu birakir:")
    public void kullaniciMesajKutusunaSuNotuBirakir(String mesaj) {

        System.out.println(mesaj);


    }

    @When("Kullanici su bilgilerle kayit olur:")
    public void kullaniciSuBilgilerleKayitOlur(Map<String, String> data) {

        loginMethod(driver,data.get("mail"),data.get("password"));
    }
}


