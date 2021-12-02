import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Greencarttry {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty ( "webdriver.chrome.driver", "C:\\Users\\ajayu\\Downloads\\chromedriver_win32 (1)\\chromedrivernew.exe" );
        Thread.sleep ( 2000 );
        WebDriver driver=new ChromeDriver ( );
        driver.get ( "https://rahulshettyacademy.com/seleniumPractise/#/" );
        driver.manage ().window ().maximize ();


        driver.findElement ( By.className ( "product-action" ) ).click ();


















    }











}















