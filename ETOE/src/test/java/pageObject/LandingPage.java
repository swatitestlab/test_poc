package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;

public class LandingPage {
    WebDriver driver;

    By signin = By.linkText("Login");
    By tittle = By.cssSelector(".text-center>h2");
    By navbar = By.cssSelector(".navbar-collapse.collapse");

    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getLogin() {
        return driver.findElement(signin);

    }

    public WebElement getTittle() {
        return driver.findElement(tittle);

    }

    public WebElement navigationBar() {
        return driver.findElement(navbar);

    }
    @AfterTest
    public void teardown() {

        driver.close();


    }


}
