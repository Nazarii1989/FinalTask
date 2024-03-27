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

public class Create_Job_Employer_Page {

    private WebDriver driver;

    @FindBy(xpath = "//div/div/div[1]/div[2]/div[6]/a")
    private WebElement JobMenu;

    @FindBy(xpath = "//input[@placeholder=\"yyyy-dd-mm\"]")
    private WebElement JobMenuJoinedDate;

    @FindBy(xpath = "//ul[@class=\"oxd-calendar-selector\"]/li[1]")
    private WebElement JobMountsMenuJoinedDate;

    @FindBy(xpath = "//ul[@class=\"oxd-calendar-dropdown\"]/li[1]")
    private WebElement JobJunMenuJoinedDate;

    @FindBy(xpath = "//ul[@class=\"oxd-calendar-selector\"]/li[2]")
    private WebElement JobYearMenuJoinedDate;

    @FindBy(xpath = "//ul[@class=\"oxd-calendar-dropdown\"]/li[55]")
    private WebElement JobYearListMenuJoinedDate;

    @FindBy(xpath = "//div[@class=\"oxd-calendar-dates-grid\"]/div[10]")
    private WebElement JobDaysListMenuJoinedDate;

    @FindBy(xpath = "//form/div[1]/div/div[2]/div/div[2]/div/div")
    private WebElement Job_Title_Click;

    @FindBy(xpath = "//span[text()=\"WorkerQANazar\"]")
    private WebElement Job_Title_List;

    @FindBy(xpath = "//form/div[1]/div/div[4]/div/div[2]/div/div/div[2]")
    private WebElement Job_Category;

    @FindBy(xpath = "//span[text()=\"Technicians\"]")
    private WebElement Job_Category_List;

    @FindBy(xpath = "//form/div[1]/div/div[5]/div/div[2]/div/div/div[2]")
    private WebElement Sub_Unit;

    @FindBy(xpath = "//span[text()=\"Development\"]")
    private WebElement Sub_Unit_List;

    @FindBy(xpath = "//form/div[1]/div/div[6]/div/div[2]/div/div/div[2]")
    private WebElement Location;

    @FindBy(xpath = "//span[text()=\"Texas R&D\"]")
    private WebElement Location_List;

    @FindBy(xpath = "//form/div[1]/div/div[7]/div/div[2]/div/div/div[2]")
    private WebElement Employment_Status;

    @FindBy(xpath = "//span[text()=\"Full-Time Contract\"]")
    private WebElement Employment_Status_List;

    @FindBy(xpath = "//span[@class=\"oxd-switch-input oxd-switch-input--active --label-right\"]")
    private WebElement Contract_Details_Button;

    @FindBy(xpath = "//form/div[3]/div/div[1]/div/div[2]/div/div/input")
    private WebElement Contract_Details_Date_Start;

    @FindBy(xpath = "//form/div[3]/div/div[2]/div/div[2]/div/div/input")
    private WebElement Contract_Details_Date_Finish;

    @FindBy(xpath = "//form/div[4]/div/div/div/div/div[2]/div/div[2]")
    private WebElement File1;

    @FindBy(xpath = "//button[@type=\"submit\"]")
    private WebElement Save_Button;







    public Create_Job_Employer_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void Job_Employer() throws InterruptedException {

        Wait<WebDriver> fluentWait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10)).
                pollingEvery(Duration.ofMillis(500)).ignoring(Exception.class);

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", JobMenu);



        fluentWait.until(ExpectedConditions.elementToBeClickable(Job_Title_Click)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(Job_Title_List)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(Job_Category)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(Job_Category_List)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(Sub_Unit)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(Sub_Unit_List)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(Location)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(Location_List)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(Employment_Status)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(Employment_Status_List)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(JobMenuJoinedDate)).click();

        fluentWait.until(ExpectedConditions.elementToBeClickable(JobMountsMenuJoinedDate)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(JobJunMenuJoinedDate)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(JobYearMenuJoinedDate)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(JobYearListMenuJoinedDate)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(JobDaysListMenuJoinedDate)).click();

        fluentWait.until(ExpectedConditions.elementToBeClickable(Contract_Details_Button)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(Contract_Details_Date_Start)).sendKeys("2024-11-01");
        fluentWait.until(ExpectedConditions.elementToBeClickable(Contract_Details_Date_Finish)).sendKeys("2024-11-03");
        fluentWait.until(ExpectedConditions.elementToBeClickable(Save_Button)).click();

    }
}
