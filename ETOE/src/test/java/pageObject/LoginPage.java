package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    WebDriver driver;

    By email = By.id("user_email");
    By Password = By.cssSelector("input[id='user_password']");
    By login = By.cssSelector("input[value='Log In']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getEmail() {
        return driver.findElement(email);

    }

    public WebElement getPassword() {
        return driver.findElement(Password);

    }

    public WebElement getLogin() {
        return driver.findElement(login);

    }
}
