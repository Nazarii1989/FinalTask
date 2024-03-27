package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class Login_Page {

    private WebDriver driver;

    @FindBy(xpath = "//input[@name=\"username\"]")
    private WebElement Username;

    @FindBy(xpath = "//input[@name=\"password\"]")
    private WebElement Password;

    @FindBy(xpath = "//button[@type=\"submit\"]")
    private WebElement Login;

    public Login_Page (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void Login() throws InterruptedException {

        Wait<WebDriver> fluentWait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10)).
                pollingEvery(Duration.ofMillis(500)).ignoring(Exception.class);
        fluentWait.until(ExpectedConditions.elementToBeClickable(Username)).sendKeys("Admin");
        fluentWait.until(ExpectedConditions.elementToBeClickable(Password)).sendKeys("admin123");
        fluentWait.until(ExpectedConditions.elementToBeClickable(Login)).click();
    }
}
