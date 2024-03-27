package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class Admin_Menu_Page {

    private WebDriver driver;

    @FindBy(xpath = "//a[@href=\"/web/index.php/admin/viewAdminModule\"]")
    private WebElement Admin_Menu;

    public Admin_Menu_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void Admin_M() throws InterruptedException {

        Wait<WebDriver> fluentWait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10)).
                pollingEvery(Duration.ofMillis(500)).ignoring(Exception.class);

        fluentWait.until(ExpectedConditions.elementToBeClickable(Admin_Menu)).click();

    }
}
