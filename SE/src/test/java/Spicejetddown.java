import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;

import static java.lang.Thread.sleep;

public class Spicejetddown {


    public static void main(String[] args) throws InterruptedException {
        System.setProperty ( "webdriver.chrome.driver", "C:\\Users\\ajayu\\Downloads\\chromedriver.exe" );

        WebDriver driver = new ChromeDriver ();


        driver.get ( "https://www.spicejet.com/" );

        driver.manage ().window ().maximize ();


        System.out.println ( driver.findElements ( By.cssSelector ( "input[type ='checkbox']" ) ).size () );

        driver.findElement ( By.xpath ( "//div[@id='divpaxinfo']" ) ).click ();

        Thread.sleep ( 4000 );

        // Selection of Adults

        WebElement Adults = driver.findElement ( By.id ( "ctl00_mainContent_ddl_Adult" ) );

        //WebElement Adults = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']"));

        Select adultsdrp = new Select ( Adults );

        adultsdrp.selectByValue ( "4" );

        // Selection of Childs

        WebElement childs = driver.findElement ( By.xpath ( "//select[@id='ctl00_mainContent_ddl_Child']" ) );

        Select childsdrp = new Select ( childs );

        childsdrp.selectByValue ( "2" );

        //driver.findElement(By.xpath(".//*[@id='divpaxinfo']")).click();

        // System.out.println(driver.findElement(By.xpath(".//*[@id='divpaxinfo']")).getText());

        // for infant

        WebElement Infant = driver.findElement ( By.id ( "ctl00_mainContent_ddl_Infant" ) );

        Select infantdrop = new Select ( Infant );

        infantdrop.selectByValue ( "2" );

        driver.findElement ( By.xpath ( ".//*[@id='divpaxinfo']" ) ).click ();

        System.out.println ( driver.findElement ( By.xpath ( ".//*[@id='divpaxinfo']" ) ).getText () );


    }

}

//public static void main(String[] arg) throws InterruptedException {

//* System.out.println ( "launch chrome driver" );

////System.setProperty ( "webdriver.chrome.driver", "C:\\Users\\ajayu\\Downloads\\chromedriver.exe" );

////WebDriver driver = new ChromeDriver ();

//// driver.get ( "https://www.spicejet.com/" );

////driver.manage ().window ().maximize ();

////driver.findElement ( By.id ( "divpaxinfo" ) ).click ();

//// Select s=new Select(driver.findElement ( By.id ( "ctl00_mainContent_ddl_Adult" ) ));

////s.selectByValue ( "2" );
////s.selectByIndex ( 6 );
////s.deselectByIndex ( 8 );

////Thread.sleep ( 10000 );

////driver.findElement ( By.id ( "ctl00_mainContent_ddl_Child" )).click ();

////Select b=new Select(driver.findElement ( By.id ( "ctl00_mainContent_ddl_Child" ) ));
//// b.selectByIndex (2 );
////b.deselectByValue ( "3" );


//I hope below code is helpful for you

//public class SpicejetNewPassenger {

//static WebDriver driver;

//public static void main(String[] args) throws InterruptedException {

//   System.setProperty("webdriver.chrome.driver", "./WebDrivers/chromedriver.exe");

// driver =new ChromeDriver();

//driver.get("https://www.spicejet.com/");

//driver.manage().window().maximize();

//Thread.sleep(6000);

//driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();

//Thread.sleep(4000);

// Selection of Adults

// WebElement Adults = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']"));

//  Select adultsdrp = new Select(Adults);

// adultsdrp.selectByValue("2");

// Selection of Childs

//WebElement childs = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Child']"));

//Select childsdrp = new Select(childs);

//childsdrp.selectByValue("2");

// driver.findElement(By.xpath(".//*[@id='divpaxinfo']")).click();

//   System.out.println(driver.findElement(By.xpath(".//*[@id='divpaxinfo']")).getText());

