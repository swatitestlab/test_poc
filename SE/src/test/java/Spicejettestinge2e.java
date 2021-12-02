import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Spicejettestinge2e {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty ( "webdriver.chrome.driver", "C:\\Users\\ajayu\\Downloads\\chromedriver.exe" );

        WebDriver driver = new ChromeDriver ();


        driver.get ( "https://www.spicejet.com/" );

        driver.manage ().window ().maximize ();

        //* //both city dropdown value select
        driver.findElement ( By.id ( "ctl00_mainContent_ddl_originStation1_CTXT" ) ).click ();
        driver.findElement ( By.xpath ( "//a[@value='ATQ']" ) ).click ();
        Thread.sleep ( 2000 );  //div[@id ='ctl00_mainContent_ddl_destinationStation1_CTNR']
        driver.findElement ( By.xpath ( "//div[@id ='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']" ) ).click ();

        Thread.sleep ( 1000 );
        //code for current date

        driver.findElement ( By.cssSelector ( ".ui-state-default.ui-state-highlight" ) ).click ();

        //adult,child,infant dropdown

        driver.findElement ( By.id ( "divpaxinfo" ) ).click ();

        // for (int i=1;i<5;i++) {
        //  driver.findElement ( By.id ("ctl00_mainContent_ddl_Adult") ).click();
        //}
        WebElement Adults = driver.findElement ( By.id ( "ctl00_mainContent_ddl_Adult" ) );
        Select Adult = new Select ( Adults );
        Adult.selectByValue ( "4" );

        System.out.println ( driver.findElement ( By.id ( "ctl00_mainContent_ddl_Adult" ) ).getText () );

        WebElement Child = driver.findElement ( By.id ( "ctl00_mainContent_ddl_Child" ) );
        Select child = new Select ( Child );
        child.selectByValue ( "2" );
        //child.deselectByValue ( "1" );
        //child.selectByIndex ( 4 );

        System.out.println ( driver.findElement ( By.id ( "ctl00_mainContent_ddl_Child" ) ).getText () );

        WebElement Infant = driver.findElement ( By.id ( "ctl00_mainContent_ddl_Infant" ) );

        Select infant = new Select ( Infant );
        infant.selectByValue ( "3" );
        //infant.deselectAll ();
        System.out.println ( driver.findElement ( By.id ( "ctl00_mainContent_ddl_Infant" ) ).getText () );

        //code for currency dropdown

        driver.findElement ( By.id ( "ctl00_mainContent_DropDownListCurrency" ) ).click ();

        Select s = new Select ( driver.findElement ( By.id ( "ctl00_mainContent_DropDownListCurrency" ) ) );
        s.selectByValue ( "INR" );
        s.selectByValue ( "AED" );
        System.out.println ( driver.findElement ( By.id ( "ctl00_mainContent_DropDownListCurrency" ) ).getText () );

        //code for checkbox

        driver.findElement ( By.id ( "ctl00_mainContent_chk_IndArm" ) ).click ();
        driver.findElement ( By.id ( "ctl00_mainContent_chk_StudentDiscount" ) ).click ();
        System.out.println ( driver.findElements ( By.cssSelector ( "input[type='checkbox']" ) ).size () );

        //code for dissable callender
        System.out.println ( driver.findElement ( By.id ( "Div1" ) ).getAttribute ( "style" ) );

        driver.findElement ( By.id ( "ctl00_mainContent_rbtnl_Trip_1" ) ).click ();
        System.out.println ( driver.findElement ( By.id ( "Div1" ) ).getAttribute ( "style" ) );

        if (driver.findElement ( By.id ( "Div1" ) ).getAttribute ( "style" ).contains ( "1" ))

        {
            System.out.println ( "its enqabled" );
            Assert.assertTrue ( true );

        } else {
            System.out.println ( "its disenqabled" );
            Assert.assertTrue ( false );
        }
        // code for final orange color submit button
        driver.findElement ( By.cssSelector ( "[type='submit']" ) ).click ();


    }
}