import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty ( "webdriver.chrome.driver", "C:\\Users\\ajayu\\OneDrive\\Desktop\\driver\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver ();
        driver.manage ().window ().maximize ();

        driver.get ( "https://rahulshettyacademy.com/dropdownsPractise/" );
        driver.findElement ( By.id ( "ctl00_mainContent_ddl_originStation1_CTXT" ) ).click ();
        driver.findElement ( By.xpath ( "//a[@value='IXG']" ) ).click ();
        Thread.sleep ( 1000 );
        //(//a[@value='BHO'])[2]
        // driver.findElement ( By.xpath ( "(//a[@value='BHO'])[2]" ) ).click ();
        driver.findElement ( By.xpath ( "//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BHO']" ) ).click ();
    }
}