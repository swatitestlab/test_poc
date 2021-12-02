import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment22 {
    public static void main (String[] arg){

        System.setProperty ( "Webdriver.chrome.driver","C:\\Users\\ajayu\\Downloads\\chromedriver_win32 (2)\\chromedrivernew.exe" );
        WebDriver driver=new ChromeDriver (  );
        driver.get ( "https://www.cleartrip.com" );
        driver.manage ().window ().maximize ();

        driver.findElement ( By.id ( "RoundTrip" ) ).click ();
        driver.findElement ( By.id ( "DepartDate" ) ).click ();
        driver.findElement ( By.cssSelector ( "a. ui-datepicker-days-cell-over.undefined selected" ) ).click ();

        driver.findElement ( By.id ( "Adults" ) ).click ();
        Select s =new Select(driver.findElement ( By.id ( "Adults" ) )) ;
        s.selectByValue ( "3" );

        driver.findElement ( By.id ( "Childrens" ) ).click ();












    }
}
