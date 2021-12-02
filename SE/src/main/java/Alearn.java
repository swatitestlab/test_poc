import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alearn {

    public static void main(String[] arg){

    System.out.println ( "i m learn" );



        System.setProperty("Webdriver.chrome.driver", "C:\\Users\\ajayu\\Downloadschromedriver.exe");
        WebDriver driver=new ChromeDriver();
      driver.get ("https://google.com");






    }
}
