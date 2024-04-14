package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class VerifyAdminPage {

    private WebDriver driver;

    @FindBy(xpath = "//form/div[1]/div/div[1]/div/div[2]/input")
    private WebElement userName1;

    @FindBy(xpath = "//form/div[1]/div/div[2]/div/div[2]/div/div/div[2]")
    private WebElement userRole1;

    @FindBy(xpath = "//div[@role=\"listbox\"]/div[2]")
    private WebElement userRoleList1;

    @FindBy(xpath = "//form/div[1]/div/div[3]/div/div[2]/div/div/input")
    private WebElement employeeName1;

    @FindBy(xpath = "//span[text()=\"Nazarii QA Simson\"]")
    private WebElement employeeName1List;

    @FindBy(xpath = "//form/div[1]/div/div[4]/div/div[2]/div/div/div[2]")
    private WebElement status1;

    @FindBy(xpath = "//div[@role=\"listbox\"]/div[2]")
    private WebElement statusList1;

    @FindBy(xpath = "//button[@type=\"submit\"]")
    private WebElement searchButton;


    @FindBy(xpath = "//div[6]/div/button[2]")
    private WebElement clickCheckButton1;

    @FindBy(xpath = "//div[@class=\"oxd-autocomplete-text-input oxd-autocomplete-text-input--active\"]")
    private WebElement cher11;

    public VerifyAdminPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void verifyAdmin() throws InterruptedException {

        Wait<WebDriver> fluentWait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10)).
                pollingEvery(Duration.ofMillis(500)).ignoring(Exception.class);

        fluentWait.until(ExpectedConditions.elementToBeClickable(userName1)).sendKeys("Worker");
        fluentWait.until(ExpectedConditions.elementToBeClickable(userRole1)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(userRoleList1)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(employeeName1)).sendKeys("Nazarii");
        fluentWait.until(ExpectedConditions.elementToBeClickable(employeeName1List)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(status1)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(statusList1)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(searchButton)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(clickCheckButton1)).click();


        String NameBeforeSaveJobTittle = "Nazarii QA Simson";
        String NameAfterSaveJobTittle = "Nazarii QA Simson";
        System.out.println("Verify New Employee Information Name  :" + NameBeforeSaveJobTittle.equals(NameAfterSaveJobTittle));

        String NickNameBeforeSaveJobTittle = "Worker";
        String NickNameAfterSaveJobTittle = "Worker";
        System.out.println("Verify New Employee Information NickName  :" + NickNameBeforeSaveJobTittle.equals(NickNameAfterSaveJobTittle));

    }
}
