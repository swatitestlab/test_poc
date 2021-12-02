import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdateDropdown {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty ( "webdriver.chrome.driver", "C:\\Users\\ajayu\\OneDrive\\Desktop\\driver\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver ();
        driver.manage ().window ().maximize ();
        Thread.sleep ( 2000 );

        driver.get ( "https://rahulshettyacademy.com/dropdownsPractise/" );
        driver.findElement ( By.id ( "divpaxinfo" ) ).click ();
        System.out.println (driver.findElement ( By.id ( "divpaxinfo" ) ).getText ());
        Thread.sleep ( 3000 );
       // driver.findElement ( By.id ( "hrefIncAdt" ) ).click ();

        for (int i=1;i<3;i++)
        {
            driver.findElement ( By.id ( "hrefIncAdt" ) ).click ();

        }

        driver.findElement ( By.id ( "btnclosepaxoption" ) ).click ();
        System.out.println (driver.findElement ( By.id ( "divpaxinfo" ) ).getText ());




        //System.setProperty ( "webdriver.Edge.driver", "C:\\Users\\ajayu\\Downloads\\edgedriver_win64\\msedgedriver.exe" );
        //WebDriver driver=new EdgeDriver (  );

    }
}