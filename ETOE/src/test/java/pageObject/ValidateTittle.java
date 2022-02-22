package pageObject;

import Academy.base;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;


public class ValidateTittle extends base {

    public WebDriver driver;

    public static Logger log = LogManager.getLogger(base.class.getName());

    @BeforeTest
    public void initializeDriver() throws IOException {
       driver  = initlizeDriver();
        log.info("Driver is Initialize");
        driver.get(prop.getProperty("url"));
        log.info("Navigate to the home page");
    }

    @Test

    public void validateAppTitle() throws IOException {


        LandingPage l = new LandingPage(driver); //fetching data from landing class.
        Assert.assertEquals(l.getTittle().getText(), "FEATURED COURSES");
        log.info("Successfully validate the message");

    }
    @AfterTest
    public void teardown() {

        driver.close();


    }

}