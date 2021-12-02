import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locater {

    public static void main(String[] args)
    {
       // System.setProperty ( "webdriver.edge.driver", "C:\\driver\\msedgedriver.exe"  );
       // WebDriver driver=new EdgeDriver (  );

       // System.setProperty ( "webdriver.gecko.driver" , "C:\\driver\\geckodriver.exe");
       // WebDriver driver=new FirefoxDriver (  );


        System.setProperty ( "webdriver.chrome.driver", "C:\\driver\\chromedriver.exe" );
        WebDriver driver =new ChromeDriver (  );

        driver.get ("https://www.google.com/"  );

        //driver.get ( "https://www.facebook.com/" );

        //BY X PATH CODE
     /*   driver.findElement ( By.xpath (    "//input[@id='email']") ).sendKeys ( "swati" );
        driver.findElement ( By.xpath ( "//input[@id='pass']") ).sendKeys ( "huhxbbjbbcdgcychc" );
        //driver.findElement ( By.xpath ( "//*[@id=\'u_0_d_IY\']" ) ).click ();
        //driver.navigate ().back ();
        //driver.findElement ( By.xpath ( "//*[@id=\'u_0_a_KK\']/div[3]/a")).click ();

        //tagname[@attribute="value"]
        //<button value="1" class="_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy" name="login" data-testid="royal_login_button" type="submit" id="u_0_d_cP" data-nlok-ref-guid="529a5aa5-8164-4846-9b65-8646fee68064">Log In</button>
        //button[@name='login']
        driver.findElement ( By.xpath ( "//*[@name='login']" ) ).click ();
        driver.navigate ().back ();

        driver.findElement ( By.linkText ( "Forgot Password?" ) ).click ();

     //BY CSS CODE   tagname[attribute="value"]
        driver.findElement ( By.cssSelector ( "input[type='text']" ) ).sendKeys ( "seati" );
        driver.findElement ( By.cssSelector ( "*[type='password']" ) ).sendKeys ( "swddcndccj" );
        driver.findElement ( By.cssSelector ( "*[type='submit']" ) ).click ();
        driver.navigate ().back (); */

        driver.findElement ( By.xpath ( "  //div[@class='RNNXgb']/div/div[2]/input" ) ).sendKeys ( "sesth" );
        driver.findElement ( By.xpath ( "   //div[@class='LX3sZb']/div/div/div/div/div/a" ) ).click ();

    }
}
