package Academy;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class base {
    public WebDriver driver;
    public Properties prop;

    public WebDriver initlizeDriver() throws IOException {
        prop = new Properties();

        FileInputStream fis = new FileInputStream("D:\\Workspace\\interview\\ETOE\\src\\test\\java\\Academy\\data.properties");
        prop.load(fis);
        String browserName = prop.getProperty("browser");

        if (browserName.equals("chrome")) {

            System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajayu\\OneDrive\\Desktop\\driver\\chromedriver.exe");
            driver = new ChromeDriver();


            //initate chrome browse
        } else if (browserName.equals("firefox")) {

            driver = new FirefoxDriver();

            //initate firefox browser
        } else if (browserName.equals("ie")) {
            //driver = new InternetExplorerDriver();

        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.manage().window().maximize();
        return driver;
    }


    public String getScreenShotPath(String testCaseName,WebDriver driver) throws IOException
    {
        TakesScreenshot ts=(TakesScreenshot) driver;
        File source =ts.getScreenshotAs(OutputType.FILE);
        String destinationFile = System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
        FileUtils.copyFile(source, new File(destinationFile));
        return destinationFile;


    }
}
