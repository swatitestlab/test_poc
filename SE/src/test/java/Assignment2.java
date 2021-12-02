import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import  org.openqa.selenium.WebElement;
import  org.openqa.selenium.support.ui.Select;
public class Assignment2 {
   public static void main(String[] args) throws InterruptedException {

        System.setProperty ( "webdriver.chrome.driver", "C:\\Users\\ajayu\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe" );

        WebDriver driver = new ChromeDriver ();

       // driver.get ( "https://www.cleartrip.com");
        driver.manage ().window ().maximize ();
        driver.findElement ( By.id ( "DepartDate" ) ).click ();
        driver.findElement ( By.cssSelector ( ".ui-state-default.ui-state-highlight.ui-state-active" ) ).click ();
        driver.findElement ( By.id ( "Adults" ) ).click ();
        Select s =new Select(driver.findElement ( By.id ( "Adults" ) ));

        s.selectByIndex ( 5 );
        s.selectByValue ( "7" );
        System.out.println ((driver.findElements ( By.id ( "Adults" ) ).size () ));

        driver.findElement ( By.id ( "Childrens" ) ).click ();
        Select childDrop= new Select (  driver.findElement ( By.id ( "Childrens" ) ) );
        childDrop.selectByVisibleText ( "2" );
        System.out.println ((driver.findElements ( By.id ( "Childrens" ) ).size () ));

        driver.findElement ( By.id ( "Infants" ) ).click ();
        Select infant =new Select(driver.findElement ( By.id ( "Infants" ) ));

        infant.selectByIndex ( 2 );

        driver.findElement ( By.id ( "MoreOptionsLink" ) ).click ();
        driver.findElement ( By.name ( "airline" ) ).sendKeys ( "British airways" );
        driver.findElement ( By.id ( "SearchBtn" ) ).click ();
        System.out.println( driver.findElement ( By.id ( "homeErrorMessage" ) ).getText ());






    }
}