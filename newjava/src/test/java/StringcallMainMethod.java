import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class StringcallMainMethod {
    public static void main(String[] args) throws InterruptedException {
        ////System.setProperty ( "webdriver.chrome.driver", "C:\\Users\\ajayu\\OneDrive\\Desktop\\driver\\chromedriver.exe" );
        //WebDriver driver=new ChromeDriver (  );

        System.setProperty ( "webdriver.Edge.driver", "C:\\Users\\ajayu\\Downloads\\edgedriver_win64\\msedgedriver.exe" );
        WebDriver driver=new EdgeDriver (  );

        driver.manage ().timeouts ().implicitlyWait(10, TimeUnit.SECONDS);
        String password= getpassword(driver);
        driver.get ( "https://www.rahulshettyacademy.com/locatorspractice/" );
        driver.findElement ( By.id ( "inputUsername" ) ).sendKeys ( "swati" );
        driver.findElement ( By.name ( "inputPassword" ) ).sendKeys ( password);
        driver.findElement ( By.cssSelector ( "button.submit" ) ).click ();
        driver.findElement ( By.linkText ( "Forgot your password?" ) ).click ();
        Thread.sleep ( 1000 );
        driver.findElement ( By.cssSelector ( "button.reset-pwd-btn" ) ).click ();
        System.out.println (driver.findElement ( By.cssSelector ( "form p" ) ).getText ());
        }



    public static String getpassword (WebDriver driver) throws InterruptedException

    {
        driver.get ( "https://www.rahulshettyacademy.com/locatorspractice/" );
        driver.findElement ( By.linkText ( "Forgot your password?" ) ).click ();
        Thread.sleep ( 1000 );
        driver.findElement ( By.cssSelector ( "button.reset-pwd-btn" ) ).click ();
      String passwordText= driver.findElement ( By.cssSelector ( "form p" ) ).getText ();
      //     Please use temporary password 'rahulshettyacademy' to Login.
        // [0] index= Please use temporary password
        //[1] index='rahulshettyacademy' to Logi

        //[0] index='rahulshettyacademy'
        //[1] index= to Login.
      String[] passwordArray= passwordText.split ( "'" );
     String[] passwordArray2=  passwordArray[1].split ( "'" );
     String password = passwordArray2[0];
     return password;



        }
}
