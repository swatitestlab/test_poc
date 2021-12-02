import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentChildFollowSibling {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty ( "webdriver.chrome.driver", "C:\\Users\\ajayu\\OneDrive\\Desktop\\driver\\chromedriver.exe" );
        WebDriver driver=new ChromeDriver (  );
        Thread.sleep ( 1000 );
        driver.manage ().window ().maximize ();
        driver.get ( "https://www.rahulshettyacademy.com/AutomationPractice/" );
        System.out.println(driver.findElement ( By.xpath ( "//header/div/button[1]" ) ).getText ()); //xpath parentto child
        System.out.println(driver.findElement ( By.xpath ( "//header/div/button[1]/following-sibling::button[1]" ) ).getText ()); // xpath xpath parentto child and following sibling
        System.out.println(driver.findElement ( By.xpath ( "//header/div/button[1]/following-sibling::button[2]" ) ).getText ());
        System.out.println(driver.findElement ( By.id ( "(//fieldset[@class='pull-right'])/input[1]" ) ).getText ());
        System.out.println (driver.findElement ( By.xpath ( "//fieldset/div/following-sibling::input[1]" ) ).getText ());
        System.out.println (driver.findElement ( By.xpath ( "//fieldset/div/following-sibling::input[2]" ) ).getText ());




    }
}
