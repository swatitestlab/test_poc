import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Lanchffox {
    public static void main(String[] arg) {

        System.out.println ( "launch firefox" );

        System.setProperty ( "webdriver.gecko.driver", "C:\\Users\\ajayu\\Downloads\\geckodriver.exe" );
        WebDriver driver=new FirefoxDriver (  );

        driver.get ( "https://www.facebook.com/" );

        //System.out.println(driver.getTitle ());
        driver.findElement ( By.cssSelector ( "#email" ) ).sendKeys ( "hello" );
        driver.findElement ( By.xpath ( "//*[@id=\'pass\']" ) ).sendKeys ( "qjjdnjdn" );
        driver.findElement ( By.xpath ( "/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[3]/a" ) ).click ();





    }
    }
