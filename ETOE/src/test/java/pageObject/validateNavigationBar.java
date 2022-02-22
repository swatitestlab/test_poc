package pageObject;

import Academy.base;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class validateNavigationBar extends base {
    public static Logger log = LogManager.getLogger(base.class.getName());

    @BeforeTest
    public void initilizeDriver() throws IOException {
        driver = initlizeDriver();
        driver.get(prop.getProperty("url"));
    }

    @Test

    public void basePageValidation() throws IOException {


        LandingPage l = new LandingPage(driver); //fetching data from landing class.

        Assert.assertTrue(l.navigationBar().isDisplayed());
       log.info("NavigationBar is display");
        // Assert.assertFalse();

    }
    @AfterTest
    public void teardown() {

        driver.close();


    }

}