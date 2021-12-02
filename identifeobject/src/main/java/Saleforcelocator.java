import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Saleforcelocator {
    public static void main(String[] args) {
        System.setProperty ( "webdriver.gecko.driver", "C:\\driver\\geckodriver.exe" );
        WebDriver driver = new FirefoxDriver ();

        //System.setProperty ( "webdriver.chrome.driver", "C:\\driver\\chromedriver.exe" );
        //WebDriver driver =new ChromeDriver (  );
        driver.get ( "https://login.salesforce.com/" );
        driver.findElement ( By.id ( "username" ) ).sendKeys ( "swati" );
        driver.findElement ( By.name ( "pw" ) ).sendKeys ( "127ryefbebf" );
        driver.findElement ( By.xpath ( "//*[@id='Login']" ) ).click ();
        System.out.println ( driver.findElement ( By.cssSelector ( "  div#error.loginError" ) ).getText ());
                //driver.navigate ().back ();
        //driver.findElement ( By.linkText ( "Forgot Your Password?" ) ).click ();
        //driver.navigate ().back ();
        //driver.findElement ( By.linkText ( "Use Custom Domain" ) ).click ();
    }

}
