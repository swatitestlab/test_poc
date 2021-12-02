import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

//System.out.println("String name:+ products.get(i).getText()");

public class Greencart {
    public static void main(String[] arg) throws InterruptedException {

        System.setProperty ( "webdriver.chrome.driver", "C:\\Users\\ajayu\\Downloads\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver ();

        int j=0;
        driver.get ( "https://rahulshettyacademy.com/seleniumPractise/#/" );
        driver.manage ().window ().maximize ();

     List<WebElement> products=( driver.findElements (By.cssSelector ( "h4.product-name" )) );

     String[] itemneeded= {"Cucumber", "Brocolli","Beetroot" };

     for(int i=0;i<products.size();i++)

     {
         String[] name = products.get ( i ).getText ().split ( "-" );
         String formateName = name[0].trim ();

         //conversion array to array list
         //List al = Arrays.asList(geeks);
         List itemNeededList = Arrays.asList ( itemneeded );

         if (itemNeededList.contains ( formateName )) {
             j++;

             // if (name.contains ( "Cucumber" ))
             {
                 driver.findElements ( By.xpath ( "//button[text() ='ADD TO CART']" ) ).get ( i ).click ();

                 if (j == 3)
                 {
                     break;

                 }



             }


         }


     }


    }
}
