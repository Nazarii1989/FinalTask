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

public class JobEmployerCreationPage {

    private WebDriver driver;

    @FindBy(xpath = "//div/div/div[1]/div[2]/div[6]/a")
    private WebElement jobMenu;

    @FindBy(xpath = "//input[@placeholder=\"yyyy-dd-mm\"]")
    private WebElement jobMenuJoinedDate;

    @FindBy(xpath = "//ul[@class=\"oxd-calendar-selector\"]/li[1]")
    private WebElement jobMountsMenuJoinedDate;

    @FindBy(xpath = "//li[text()=\"January\"]")
    private WebElement jobJunMenuJoinedDate;

    @FindBy(xpath = "//ul[@class=\"oxd-calendar-selector\"]/li[2]")
    private WebElement jobYearMenuJoinedDate;

    @FindBy(xpath = "//li[text()=\"1989\"]")
    private WebElement jobYearListMenuJoinedDate;

    @FindBy(xpath = "//div[text()=\"10\"]")
    private WebElement jobDaysListMenuJoinedDate;

    @FindBy(xpath = "//form/div[1]/div/div[2]/div/div[2]/div/div")
    private WebElement jobTitleClick;

    @FindBy(xpath = "//span[text()=\"WorkerQANazar\"]")
    private WebElement jobTitleList;

    @FindBy(xpath = "//form/div[1]/div/div[4]/div/div[2]/div/div/div[2]")
    private WebElement jobCategory;

    @FindBy(xpath = "//span[text()=\"Technicians\"]")
    private WebElement jobCategoryList;

    @FindBy(xpath = "//form/div[1]/div/div[5]/div/div[2]/div/div/div[2]")
    private WebElement subUnit;

    @FindBy(xpath = "//span[text()=\"Development\"]")
    private WebElement subUnitList;

    @FindBy(xpath = "//form/div[1]/div/div[6]/div/div[2]/div/div/div[2]")
    private WebElement location;

    @FindBy(xpath = "//span[text()=\"Texas R&D\"]")
    private WebElement locationList;

    @FindBy(xpath = "//form/div[1]/div/div[7]/div/div[2]/div/div/div[2]")
    private WebElement employmentStatus;

    @FindBy(xpath = "//span[text()=\"Full-Time Contract\"]")
    private WebElement employmentStatusList;

    @FindBy(xpath = "//span[@class=\"oxd-switch-input oxd-switch-input--active --label-right\"]")
    private WebElement contractDetailsButton;

    @FindBy(xpath = "//form/div[3]/div/div[1]/div/div[2]/div/div/input")
    private WebElement contractDetailsDateStart;

    @FindBy(xpath = "//form/div[3]/div/div[2]/div/div[2]/div/div/input")
    private WebElement contractDetailsDateFinish;

    @FindBy(xpath = "//form/div[4]/div/div/div/div/div[2]/div/div[2]")
    private WebElement file1;

    @FindBy(xpath = "//button[@type=\"submit\"]")
    private WebElement saveButton;







    public JobEmployerCreationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void createJobEmployer() throws InterruptedException {

        Wait<WebDriver> fluentWait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10)).
                pollingEvery(Duration.ofMillis(500)).ignoring(Exception.class);

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", jobMenu);



        fluentWait.until(ExpectedConditions.elementToBeClickable(jobTitleClick)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(jobTitleList)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(jobCategory)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(jobCategoryList)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(subUnit)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(subUnitList)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(location)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(locationList)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(employmentStatus)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(employmentStatusList)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(jobMenuJoinedDate)).click();

        fluentWait.until(ExpectedConditions.elementToBeClickable(jobMountsMenuJoinedDate)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(jobJunMenuJoinedDate)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(jobYearMenuJoinedDate)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(jobYearListMenuJoinedDate)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(jobDaysListMenuJoinedDate)).click();

        fluentWait.until(ExpectedConditions.elementToBeClickable(contractDetailsButton)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(contractDetailsDateStart)).sendKeys("2024-11-01");
        fluentWait.until(ExpectedConditions.elementToBeClickable(contractDetailsDateFinish)).sendKeys("2024-11-03");
        fluentWait.until(ExpectedConditions.elementToBeClickable(saveButton)).click();

    }
}
