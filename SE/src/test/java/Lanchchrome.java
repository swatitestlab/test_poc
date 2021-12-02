import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lanchchrome{

    public static void main(String[] arg){

        System.out.println ( "launch chrome driver" );

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajayu\\Downloads\\chromedriver.exe");

        WebDriver driver=new ChromeDriver(  );
        driver.get ("https://www.facebook.com/" );
        System.out.println(driver.getTitle ());
        System.out.println(driver.getCurrentUrl ());
        driver.findElement( By.id ("email" ) ).sendKeys( "swatu" );
        driver.findElement ( By.name ("pass") ).sendKeys ( "pwashh" );
        driver.findElement ( By.linkText ( "Forgot account?")).click ();
        //driver.quit ();






    }


}
