import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Saleforce {
    public static void main(String[] arg){

        System.setProperty ( "webdriver.chrome.driver", "C:\\Users\\ajayu\\Downloads\\chromedriver.exe" );
        WebDriver driver=new ChromeDriver (  );
        driver.get ( "https://login.salesforce.com/" );

        driver.findElement ( By.id ( "username" ) ).sendKeys ( "hello" );
        driver.findElement ( By.name ( "pw" ) ).sendKeys ( "1245" );
        driver.findElement ( By.xpath ( "//*[@id=\'Login\']" ) ).click ();
        //driver.findElement ( By.xpath ( "//*[@id=\'forgot_password_link\']" ) ).click ();

       System.out.println(driver.findElement(By.xpath("//div[@id='error']") ).getText());










    }
}
