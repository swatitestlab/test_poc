import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import java.util.List;

public class AutoDD {

    public static void main(String[] arg) throws InterruptedException {

        System.setProperty ( "webdriver.chrome.driver", "C:\\Users\\ajayu\\Downloads\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver ();
        driver.get ( "https://rahulshettyacademy.com/dropdownsPractise/" );
        driver.manage ().window ().maximize ();


        Assert.assertFalse (driver.findElement ( By.cssSelector ( "input[id ='ctl00_mainContent_chk_SeniorCitizenDiscount']"  ) ).isSelected ());

        driver.findElement( By.cssSelector( "input[id ='ctl00_mainContent_chk_SeniorCitizenDiscount']" ) ).click ();
        Assert.assertTrue (driver.findElement( By.cssSelector ( "input[id ='ctl00_mainContent_chk_SeniorCitizenDiscount']"  ) ).isSelected ());

        System.out.println(driver.findElements ( By.cssSelector ( "input[type ='checkbox']" ) ).size ());

        driver.findElement ( By.id ( "autosuggest" ) ).sendKeys ( "ind" );

        Thread.sleep(2000);
        List<WebElement> options =driver.findElements(By.cssSelector("li[class ='ui-menu-item'] a" ) );
        for (WebElement option :options){
            if (option.getText().equalsIgnoreCase( "India" ))
           {
             option.click ();
               break;
           }

            }

        System.out.println (driver.findElement ( By.cssSelector ( "input[id* ='friendsandfamily']"  ) ).isSelected ());
        driver.findElement( By.cssSelector( "input[id* ='friendsandfamily']" ) ).click ();
        System.out.println(driver.findElement( By.cssSelector ( "input[id* ='friendsandfamily']"  ) ).isSelected ());

        System.out.println(driver.findElements ( By.cssSelector ( "input[type ='checkbox']" ) ).size ());




    }
}