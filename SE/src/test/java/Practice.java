import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

    public static void main(String[] arg) {

        System.out.println ( "launch chrome driver" );

        System.setProperty ( "webdriver.chrome.driver","C:\\Users\\ajayu\\Downloads\\chromedriver.exe" );

        WebDriver driver = new ChromeDriver ();

        driver.get (" https://www.rahulshettyacademy.com/" );
        //driver.get ( "'https://courses.rahulshettyacademy.com/courses" );
       // driver.findElement ( By.xpath ( "//a[@href='https://courses.rahulshettyacademy.com/courses']" ) ).click ();
        //driver.findElement ( By.xpath ( "//a[@href='https://courses.rahulshettyacademy.com/courses']" ) ).click ();
        driver.findElement ( By.xpath ( "//div[2]/div/div/div[2]/nav/div[2]/ul/li[2]/a']" ) ).click ();




    }


}

