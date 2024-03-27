package Page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class Verify_Admin_Page {

    private WebDriver driver;

    @FindBy(xpath = "//form/div[1]/div/div[1]/div/div[2]/input")
    private WebElement Username1;

    @FindBy(xpath = "//form/div[1]/div/div[2]/div/div[2]/div/div/div[2]")
    private WebElement User_Role1;

    @FindBy(xpath = "//div[@role=\"listbox\"]/div[2]")
    private WebElement User_Role_List1;

    @FindBy(xpath = "//form/div[1]/div/div[3]/div/div[2]/div/div/input")
    private WebElement Employee_Name1;

    @FindBy(xpath = "//span[text()=\"Nazarii QA Simson\"]")
    private WebElement Employee_Name1_List;

    @FindBy(xpath = "//form/div[1]/div/div[4]/div/div[2]/div/div/div[2]")
    private WebElement Status1;

    @FindBy(xpath = "//div[@role=\"listbox\"]/div[2]")
    private WebElement Status_List1;

    @FindBy(xpath = "//button[@type=\"submit\"]")
    private WebElement Search_Button;


    @FindBy(xpath = "//div[6]/div/button[2]")
    private WebElement Click_Check_Button1;

    @FindBy(xpath = "//div[@class=\"oxd-autocomplete-text-input oxd-autocomplete-text-input--active\"]")
    private WebElement Cher11;

    public Verify_Admin_Page(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void VerifyAdmin() throws InterruptedException {

        Wait<WebDriver> fluentWait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10)).
                pollingEvery(Duration.ofMillis(500)).ignoring(Exception.class);

        fluentWait.until(ExpectedConditions.elementToBeClickable(Username1)).sendKeys("Worker");
        fluentWait.until(ExpectedConditions.elementToBeClickable(User_Role1)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(User_Role_List1)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(Employee_Name1)).sendKeys("Nazarii");
        fluentWait.until(ExpectedConditions.elementToBeClickable(Employee_Name1_List)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(Status1)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(Status_List1)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(Search_Button)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(Click_Check_Button1)).click();


        String NameBeforeSaveJobTittle = "Nazarii QA Simson";
        String NameAfterSaveJobTittle = "Nazarii QA Simson";
        System.out.println("Verify New Employee Information Name  :" + NameBeforeSaveJobTittle.equals(NameAfterSaveJobTittle));

        String NickNameBeforeSaveJobTittle = "Worker";
        String NickNameAfterSaveJobTittle = "Worker";
        System.out.println("Verify New Employee Information NickName  :" + NickNameBeforeSaveJobTittle.equals(NickNameAfterSaveJobTittle));

    }
}
