import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class Afterlogin {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty ( "webdriver.chrome.driver", "C:\\Users\\ajayu\\OneDrive\\Desktop\\driver\\chromedriver.exe" );
        WebDriver driver=new ChromeDriver (  );
        String  name;
        name = "rahul";
        driver.manage ().timeouts ().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get ( "https://www.rahulshettyacademy.com/locatorspractice/" );
        driver.findElement ( By.id ( "inputUsername" ) ).sendKeys ( name);
        driver.findElement ( By.name ( "inputPassword" ) ).sendKeys ( "rahulshettyacademy" );
        driver.findElement ( By.id ( "chkboxOne" ) ).click ();
        driver.findElement ( By.id ( "chkboxTwo" ) ).click ();
        driver.findElement ( By.cssSelector ( "button.submit" ) ).click ();
       Thread.sleep ( 1000 );
        System.out.println( driver.findElement ( By.tagName ( "p" ) ).getText ());
        Assert.assertEquals (driver.findElement ( By.tagName ( "p" ) ).getText () , "You are successfully logged in.");

      Assert.assertEquals ( driver.findElement ( By.cssSelector ( "div[class='login-container'] h2" ) ).getText () , "Hello "+name+",");
      driver.findElement ( By.xpath ( "//button[text()='Log Out']" ) ).click ();
      driver.close ();

    }
}
