import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicdd {
    public static void main(String[] arg) throws InterruptedException {

        System.setProperty ( "webdriver.chrome.driver", "C:\\Users\\ajayu\\Downloads\\chromedriver.exe" );

        WebDriver driver=new ChromeDriver (  );

        driver.get ( "https://rahulshettyacademy.com/dropdownsPractise/" );
        driver.manage ().window ().maximize ();
        driver.findElement ( By.id ( "ctl00_mainContent_ddl_originStation1_CTXT" ) ).click ();
        driver.findElement ( By.xpath ( "//div[@id ='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value ='MAA']" ) ).click ();
        Thread.sleep ( 2000 );
        driver.findElement ( By.xpath ( "//div[@id ='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value ='COK']" ) ).click ();








    }
}
