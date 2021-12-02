
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.SourceType;

public class Edgedriver {
    public static void main(String[] args) throws InterruptedException {
        System.out.println ( "HI edge" );

        System.setProperty ( "webdriver.edge.driver", "C:\\driver\\msedgedriver.exe" );

        WebDriver driver=new EdgeDriver ();
        //driver.wait (5);
        driver.get ( "https://www.google.com" );

        System.out.println(driver.getTitle ());
        System.out.println (driver.getCurrentUrl ());
        driver.get ( "https://www.youtube.com" );
        driver.navigate ().back();
        driver.navigate ().forward ();
        driver.quit ();
    }
}
