package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class User_Management_Page {

    private WebDriver driver;

    @FindBy(xpath = "//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]")
    private WebElement Add_Button;

    @FindBy(xpath = "//form/div[1]/div/div[1]/div/div[2]/div/div/div[2]")
    private WebElement User_Role_Menu;

    @FindBy(xpath = "//div[@role=\"listbox\"]/div[2]")
    private WebElement User_Role_List;

    @FindBy(xpath = "//form/div[1]/div/div[3]/div/div[2]/div/div/div[2]")
    private WebElement StatusMenu;

    @FindBy(xpath = "//span[text()=\"Enabled\"]")
    private WebElement StatusMenu_List;

    @FindBy(xpath = "//input[@placeholder=\"Type for hints...\"]")
    private WebElement Employee_Name;

    @FindBy(xpath = "//span[text()=\"Nazarii QA Simson\"]")
    private WebElement Employee_Name_List;

    @FindBy(xpath = "//form/div[1]/div/div[4]/div/div[2]/input")
    private WebElement Username;

    @FindBy(xpath = "//form/div[2]/div/div[1]/div/div[2]/input")
    private WebElement Password;

    @FindBy(xpath = "//form/div[2]/div/div[2]/div/div[2]/input")
    private WebElement Confirm_Password;

    @FindBy(xpath = "//button[@type=\"submit\"]")
    private WebElement Save_Button;

    public User_Management_Page(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void User() throws InterruptedException {

        Wait<WebDriver> fluentWait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10)).
                pollingEvery(Duration.ofMillis(500)).ignoring(Exception.class);

        fluentWait.until(ExpectedConditions.elementToBeClickable(Add_Button)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(User_Role_Menu)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(User_Role_List)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(StatusMenu)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(StatusMenu_List)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(Employee_Name)).sendKeys("Nazarii");
        fluentWait.until(ExpectedConditions.elementToBeClickable(Employee_Name_List)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(Username)).sendKeys("Worker");
        fluentWait.until(ExpectedConditions.elementToBeClickable(Password)).sendKeys("Worker55");
        fluentWait.until(ExpectedConditions.elementToBeClickable(Confirm_Password)).sendKeys("Worker55");
        fluentWait.until(ExpectedConditions.elementToBeClickable(Save_Button)).click();
    }
}
