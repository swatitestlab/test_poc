import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XCpath {
    public static void main(String[] arg){

        System.out.println ( "fibd x and c path" );
        System.setProperty ( "webdriver.chrome.driver", "C:\\Users\\ajayu\\Downloads\\chromedriver.exe" );
        WebDriver driver=new ChromeDriver (  );

        //driver.get ( "https://www.facebook.com/" );


       // XPATH SYNTAX ......     //tagname[@attribute='value']

       // driver.findElement ( By.xpath ( "//input[@name= 'email']" ) ).sendKeys ( "swatiuhjbj" );
        //driver.findElement ( By.xpath ( "//input[@id='pass']" ) ).sendKeys ( "12345" );
        //driver.findElement ( By.xpath ( "//*[@name='login']" ) ).click ();


      // CSSPATH SYNTAX ......     tagname[attribute='value']

       // driver.findElement ( By.cssSelector ( "input[name='email'] " )).sendKeys ( "ahunbaswayet" );
        //driver.findElement ( By.cssSelector ( "input[type='password']" ) ).sendKeys ( "123456u" );
        //driver.findElement ( By.cssSelector ( "*[name='login']" ) ).click ();

        driver.get ( "https://login.salesforce.com/" );
        driver.findElement ( By.cssSelector ( "input[id='username']" ) ).sendKeys ( "helloj" );
        driver.findElement ( By.xpath ( "//input[@id='password']" ) ).sendKeys ( "12345677" );
        driver.findElement ( By.cssSelector ( "input#Login" ) ).click ();
        System.out.println(driver.findElement ( By.xpath ("//div[@id='error']") ).getText());











    }
}
