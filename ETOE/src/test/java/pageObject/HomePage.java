package pageObject;

import Academy.base;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class HomePage  extends base {

    public static Logger log = LogManager.getLogger(base.class.getName());

    @BeforeTest
    public void initilizeDriver() throws IOException {
        driver = initlizeDriver();
    }

    @Test (dataProvider = "getData")
    public void basePageNavigation(String Username, String Password) throws IOException {


        driver.get("http://www.qaclickacademy.com/");

        LandingPage l = new LandingPage(driver); //fetching data from landing class.
        l.getLogin().click();
        LoginPage lp = new LoginPage(driver);
        lp.getEmail().sendKeys(Username);
        lp.getPassword().sendKeys(Password);
        //System.out.println(text);
        log.info("text show");
        lp.getLogin().click();

    }

    @AfterTest
    public void teardown()
    {

        driver.close();


    }

    @DataProvider
    public Object[][] getData()
    {
        // Row stands for how many different data types test should run
        //coloumn stands for how many values per each test

        // Array size is 2
        // 0,1
        Object[][] data=new Object[2][2];

        //0th row [r][c]
        data[0][0]="nonrestricteduser@qw.com";
        data[0][1]="123456";
        //data[0][2]="Restrcited User";

        //1st row
        data[1][0]="restricteduser@qw.com";  //w
        data[1][1]="456788";
       // data[1][2]= "Non restricted user";

        return data;




    }
}