import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.util.concurrent.TimeUnit.SECONDS;

public class Parentclildnode {

    public static void main(String[] args) throws InterruptedException {
        // System.setProperty ( "webdriver.edge.driver", "C:\\driver\\msedgedriver.exe"  );
        // WebDriver driver=new EdgeDriver (  );

        // System.setProperty ( "webdriver.gecko.driver" , "C:\\driver\\geckodriver.exe");
        // WebDriver driver=new FirefoxDriver (  );


        System.setProperty ( "webdriver.chrome.driver", "C:\\driver\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver ();

        driver.manage ().window ().maximize ();
        driver.manage().timeouts().implicitlyWait(10,SECONDS) ;

        driver.get ( "https://rahulshettyacademy.com/AutomationPractice/" );
       // driver.findElement ( By.xpath ( "//button[contains(text(), 'Home')]" ) ).click ();
        ////driver.wait (1000);
        //driver.navigate ().back ();

        //driver.findElement ( By.xpath ( "//button[contains(text(), 'Practice')]" ) ).click ();
        //driver.wait ();
       // driver.navigate ().back ();
       // driver.wait (100);
       // driver.findElement ( By.xpath ( "//button[contains(text(), 'Login')]" ) ).click ();
       // driver.navigate ().back ();
       // driver.findElement (By.xpath ( "//button[contains(text(), 'Signup')]" ) ).click ();
        //driver.navigate ().back ();
        //driver.wait (100);
        driver.findElement ( By.xpath ( "//div[@id='checkbox-example']/fieldset/label[1]/input" ) ).click ();
        driver.findElement ( By.xpath ( "//div[@id='checkbox-example']/fieldset/label[2]/input" ) ).click ();
        driver.findElement ( By.xpath ( "//div[@id='checkbox-example']/fieldset/label[3]/input" ) ).click ();
    }
}