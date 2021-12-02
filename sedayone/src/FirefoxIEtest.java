import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxIEtest {
    public static void main(String[] args) {

        System.out.println ("hello workd");
        System.setProperty ( "webdriver.gecko.driver","C:\\driver\\geckodriver.exe" );
        WebDriver driver=new FirefoxDriver ();
        driver.get ( "https://github.com/mozilla/geckodriver/releases" );
        System.out.println (driver.getTitle ());
    }
}