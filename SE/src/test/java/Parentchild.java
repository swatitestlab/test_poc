import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Parentchild {

    public static void main(String[] arg) {

        System.out.println ( "launch chrome driver" );
        //System.setProperty ( "webdriver.gecko.driver", "C:\\Users\\ajayu\\Downloads\\geckodriver.exe" );
        //WebDriver driver=new FirefoxDriver (  );



        System.setProperty ( "webdriver.chrome.driver", "C:\\Users\\ajayu\\Downloads\\chromedriver.exe" );

        WebDriver driver = new ChromeDriver ();

        driver.get ( "https://www.google.com/" );
        //driver.findElement ( By.xpath ( "//div[@class='RNNXgb']/div/div[2]/input" ) ).sendKeys ( "hello" );

        driver.findElement ( By.xpath ( "/html[1]/body[1]/div[1]/div[3]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]" ) ).sendKeys ( "hello" );



    }
}