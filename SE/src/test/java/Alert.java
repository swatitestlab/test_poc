import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class Alert {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty ( "webdriver.chrome.driver", "C:\\Users\\ajayu\\Downloads\\chromedriver.exe" );

        WebDriver driver = new ChromeDriver ();

        driver.get ( "https://www.rahulshettyacademy.com/AutomationPractice/" );

        driver.manage ().window ().maximize ();

        driver.findElement ( By.cssSelector ( "[value='radio1']" ) ).click ();
        driver.findElement ( By.xpath ( "(//input[@value= 'radio2'])" ) ).click ();
        driver.findElement ( By.cssSelector ( "[value='radio3']" ) ).click ();

        driver.findElement ( By.xpath ( "//input[@id='autocomplete']" ) ).sendKeys ( "India" );
        Thread.sleep ( 2000 );


        List<WebElement> Options = driver.findElements ( By.cssSelector ( "li[class= 'ui-menu-item'] div" ) );



        for (WebElement optiondrop : Options) {
            if (optiondrop.getText ().equalsIgnoreCase ( "India" )) ;
            {
                optiondrop.click ();
                break;
            }

        }
        System.out.println ( driver.findElements ( By.cssSelector ( "li[class= 'ui-menu-item'] div" ) ).size () );
        System.out.println ( driver.findElement ( By.cssSelector ( "li[class= 'ui-menu-item'] div" ) ).getText () );

        driver.findElement ( By.id ( "dropdown-class-example" ) ).click ();
        Select s = new Select ( driver.findElement ( By.id ( "dropdown-class-example" ) ) );
        s.selectByVisibleText ("Option1" ) ;
        Thread.sleep ( 1000 );
       s.selectByIndex ( 2 ) ;
        Thread.sleep ( 1000 );
       s.selectByVisibleText ("Option3"  );

       driver.findElement ( By.id ( "checkBoxOption1" ) ).click ();
       driver.findElement ( By.id ( "checkBoxOption2" ) ).click ();

       driver.findElement ( By.id ( "name" ) ).sendKeys ( "swati" );
       driver.findElement ( By.id ( "alertbtn" ) ).click ();
       Thread.sleep ( 1000 );
        System.out.println ( driver.switchTo ().alert ().getText () );
       driver.switchTo ().alert ().accept ();


        driver.findElement ( By.id ( "confirmbtn" ) ).click ();
        Thread.sleep ( 1000 );
        System.out.println ( driver.switchTo ().alert ().getText () );
        driver.switchTo ().alert ().dismiss ();




    }

    }



   

