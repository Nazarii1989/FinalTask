package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class UserManagementPage {

    private WebDriver driver;

    @FindBy(xpath = "//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]")
    private WebElement addButton;

    @FindBy(xpath = "//form/div[1]/div/div[1]/div/div[2]/div/div/div[2]")
    private WebElement userRoleMenu;

    @FindBy(xpath = "//div[@role=\"listbox\"]/div[2]")
    private WebElement userRoleList;

    @FindBy(xpath = "//form/div[1]/div/div[3]/div/div[2]/div/div/div[2]")
    private WebElement statusMenu;

    @FindBy(xpath = "//span[text()=\"Enabled\"]")
    private WebElement statusMenuList;

    @FindBy(xpath = "//input[@placeholder=\"Type for hints...\"]")
    private WebElement employeeName;

    @FindBy(xpath = "//span[text()=\"Nazarii QA Simson\"]")
    private WebElement employeeNameList;

    @FindBy(xpath = "//form/div[1]/div/div[4]/div/div[2]/input")
    private WebElement userName;

    @FindBy(xpath = "//form/div[2]/div/div[1]/div/div[2]/input")
    private WebElement createPassword;

    @FindBy(xpath = "//form/div[2]/div/div[2]/div/div[2]/input")
    private WebElement confirmPassword;

    @FindBy(xpath = "//button[@type=\"submit\"]")
    private WebElement saveButton;

    public UserManagementPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void createUser() throws InterruptedException {

        Wait<WebDriver> fluentWait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10)).
                pollingEvery(Duration.ofMillis(500)).ignoring(Exception.class);

        fluentWait.until(ExpectedConditions.elementToBeClickable(addButton)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(userRoleMenu)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(userRoleList)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(statusMenu)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(statusMenuList)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(employeeName)).sendKeys("Nazarii");
        fluentWait.until(ExpectedConditions.elementToBeClickable(employeeNameList)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(userName)).sendKeys("Worker");
        fluentWait.until(ExpectedConditions.elementToBeClickable(createPassword)).sendKeys("Worker55");
        fluentWait.until(ExpectedConditions.elementToBeClickable(confirmPassword)).sendKeys("Worker55");
        fluentWait.until(ExpectedConditions.elementToBeClickable(saveButton)).click();
    }
}
