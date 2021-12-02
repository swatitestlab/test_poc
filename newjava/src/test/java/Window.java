import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty ( "webdriver.chrome.driver", "C:\\Users\\ajayu\\OneDrive\\Desktop\\driver\\chromedriver.exe" );
        WebDriver driver=new ChromeDriver (  );
        Thread.sleep ( 1000 );
        driver.manage ().window ().maximize ();
        driver.get ( "http://google.com" );
        driver.navigate ().to ( "https://www.rahulshettyacademy.com/#/learning-path" );
        driver.navigate ().back ();
    }
}
