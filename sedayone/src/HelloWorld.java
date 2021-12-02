import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld
{
    public static void main(String[] args)
    {
        System.out.println ( "hello world" );
        //create object for chrome driver

        System.setProperty ( "webdriver.chrome.driver","C:\\driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver (  );
        driver.get ( "https://www.youtube.com/watch?v=T_4ZFj_KTx4");
        System.out.println (driver.getTitle ());
        driver.getCurrentUrl ();
        driver.quit ();
    }
}
