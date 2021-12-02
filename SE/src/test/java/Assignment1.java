import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
    public static void main(String[] arg) throws InterruptedException {

        System.setProperty ( "webdriver.chrome.driver", "C:\\Users\\ajayu\\Downloads\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver ();
        driver.get ( "https://rahulshettyacademy.com/AutomationPractice/" );
        driver.manage ().window ().maximize ();

        Assert.assertFalse (driver.findElement ( By.id ( "checkBoxOption1" ) ).isSelected ());
        driver.findElement ( By.id ( "checkBoxOption1" ) ).click ();
        Assert.assertTrue( driver.findElement ( By.id ( "checkBoxOption1" ) ).isSelected () );
        driver.findElement ( By.id ( "checkBoxOption1" ) ).click ();


        System.out.println (driver.findElements ( By.cssSelector ( "input[type= 'checkbox']" )  ) .size ());

        


    }
}