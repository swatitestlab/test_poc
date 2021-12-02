import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {
    public static void main(String[] args) {


        System.setProperty ( "webdriver.chrome.driver", "C:\\Users\\ajayu\\OneDrive\\Desktop\\driver\\chromedriver.exe" );
        WebDriver driver=new ChromeDriver (  );
        driver.manage ().window ().maximize ();

        driver.get ( "https://rahulshettyacademy.com/dropdownsPractise/" );

        //System.setProperty ( "webdriver.Edge.driver", "C:\\Users\\ajayu\\Downloads\\edgedriver_win64\\msedgedriver.exe" );
        //WebDriver driver=new EdgeDriver (  );

        WebElement  staticDropdown = driver.findElement ( By.id ( "ctl00_mainContent_DropDownListCurrency" ) );
        Select dropdown = new Select (  staticDropdown );
        dropdown.selectByIndex ( 3 );
        System.out.println (dropdown.getFirstSelectedOption ().getText ());
        dropdown.selectByVisibleText ( "AED" );
        System.out.println (dropdown.getFirstSelectedOption ().getText ());
        dropdown.selectByValue ("INR" );
        System.out.println (dropdown.getFirstSelectedOption ().getText ());


    }
}
