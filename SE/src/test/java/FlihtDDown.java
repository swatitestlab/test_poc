import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FlihtDDown {

    public static void main(String[] arg) throws InterruptedException {

        System.out.println ( "launch chrome driver" );
        System.setProperty ( "webdriver.chrome.driver", "C:\\Users\\ajayu\\Downloads\\chromedriver.exe" );

        WebDriver driver = new ChromeDriver ();

        driver.get ( "https://rahulshettyacademy.com/dropdownsPractise/" );

        driver.findElement ( By.id ( "divpaxinfo" ) ).click ();
        Thread.sleep ( 2000 );


        //  int i=1;
        // while(i<5)
        //  {
        //       driver.findElement ( By.id( "hrefIncAdt") ).click ();
        //    i++;
        //}

        for (int i = 1; i < 5; i++) {

            driver.findElement ( By.id ( "hrefIncAdt" ) ).click ();

        }

        driver.findElement ( By.id ( "btnclosepaxoption" ) ).click ();

    }
}