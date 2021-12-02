import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Practice2 {



    public static void main(String[] args) throws InterruptedException {

            System.setProperty("webdriver.chrome.driver","C:\\Users\\ajayu\\Downloads\\chromedriver.exe");

            WebDriver driver=new ChromeDriver();

            driver.get("https://rahulshettyacademy.com/#/index");

            driver.manage().window().maximize();

            System.out.println(driver.getTitle());

            //    Course link

            Thread.sleep(10000);

            driver.findElement(By.xpath("(//a[@href='https://courses.rahulshettyacademy.com/courses'])[1]")).click();

            System.out.println(driver.findElement(By.xpath("//a[@href='https://courses.rahulshettyacademy.com/courses']")).getText());

        }





    }
