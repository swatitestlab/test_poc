import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.xml.datatype.Duration;
import java.util.concurrent.TimeUnit;

public class Locators {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty ( "webdriver.chrome.driver", "C:\\Users\\ajayu\\OneDrive\\Desktop\\driver\\chromedriver.exe" );
        WebDriver driver=new ChromeDriver (  );
        driver.manage ().timeouts ().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get ( "https://www.rahulshettyacademy.com/locatorspractice/" );
        driver.findElement ( By.id ( "inputUsername" ) ).sendKeys ( "swati" );
        driver.findElement ( By.name ( "inputPassword" ) ).sendKeys ( "rahulsheetyacedemy" );
        driver.findElement ( By.id ( "chkboxOne" ) ).click ();
        driver.findElement ( By.id ( "chkboxTwo" ) ).click ();
        //driver.findElement ( By.linkText ( "Forgot your password?" ) ).click ();
        driver.findElement ( By.cssSelector ( "button.submit" ) ).click ();
        System.out.println (driver.findElement ( By.cssSelector ( "p.error" )).getText ());
        driver.findElement ( By.linkText ( "Forgot your password?" ) ).click ();
        Thread.sleep ( 1000 );
        driver.findElement ( By.xpath ( "//input[@placeholder='Name']" ) ).sendKeys ( "rahul" );
        driver.findElement ( By.xpath ( "//input[@placeholder='Email']" ) ).sendKeys ( "rsa@gmail.com" );
        driver.findElement ( By.xpath ( "//input[@placeholder='Email']" ) ).clear ();
        driver.findElement ( By.cssSelector ( "input[placeholder='Email']" ) ).sendKeys ( "john@gmail.com" );
        driver.findElement ( By.xpath ( "//form/input[3]" ) ).sendKeys ( "98456789" );
        // driver.findElement ( By.xpath ( "//div/button[2]" ) ).click (); by xpath traverse
        driver.findElement ( By.cssSelector ( "button.reset-pwd-btn" ) ).click ();
        System.out.println (driver.findElement ( By.cssSelector ( "form p" ) ).getText ());

        Thread.sleep ( 1000 );
        //div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
        driver.findElement ( By.xpath ( "//div[@class='forgot-pwd-btn-conainer']/button[1]" ) ).click (); //this is customize x path from parent child with indexing
        driver.findElement ( By.xpath ( "//input[contains(@id,'inputUsername')]" ) ).sendKeys ( "rahul" );
        driver.findElement ( By.cssSelector ( "input[type*='pass']" ) ).sendKeys ( "rahulshettyacademy" );
        //driver.findElement ( By.xpath ( "//div[contains(@class,'checkbox-container')]/span/input[1]" ) ).click ();
        driver.findElement(By.id("chkboxOne")).click();
        //driver.findElement ( By.cssSelector ( "button[class*='submit signInBtn']" ) ).click ();
        driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
    }
}
