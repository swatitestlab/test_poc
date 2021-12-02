import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Regularexpresssion {

    public static void main(String[] args){

        System.out.println ( " practice regular expression " );

        System.setProperty ( "webdriver.gecko.driver", "C:\\Users\\ajayu\\Downloads\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver (  );

        driver.get ( "https://www.rediff.com/" );

        //driver.findElement ( By.id ( "username" ) ).sendKeys ( "hello" );
        //driver.findElement ( By.name ( "pw" ) ).sendKeys ( "1245" );
        //driver.findElement ( By.xpath ( "//*[@id=\'Login\']" ) ).click ();

        driver.findElement ( By.cssSelector ( "a[title*=Already]" ) ).click ();
        driver.findElement ( By.xpath ( "//input[contains(@id,'login1')]" ) ).sendKeys ( "hellohnbhd" );
        driver.findElement ( By.cssSelector ( "input[id*='password']" ) ).sendKeys ( "12345567" );
        driver.findElement ( By.cssSelector ( "input[title*='Sign in']" ) ).click ();




    }
}
