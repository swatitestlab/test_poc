import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Intro {
    public static void main(String[] args) {


        System.setProperty ( "webdriver.chrome.driver", "C:\\Users\\ajayu\\OneDrive\\Desktop\\driver\\chromedriver.exe" );
        WebDriver driver=new ChromeDriver (  );

        driver.get ( "https://www.rahulshettyacademy.com/#/index" );
        System.out.println (driver.getTitle());
        System.out.println (driver.getCurrentUrl ());


    }
}
