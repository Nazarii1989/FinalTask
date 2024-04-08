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

public class PIMMenuPage {

    private WebDriver driver;

    @FindBy(xpath = "//a[@href=\"/web/index.php/pim/viewPimModule\"]")
    private WebElement clickPIM;

    @FindBy(xpath = "//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]")
    private WebElement addButton;

    @FindBy(xpath = "//input[@name=\"firstName\"]")
    private WebElement createFirstName;

    @FindBy(xpath = "//input[@name=\"middleName\"]")
    private WebElement createMidlName;

    @FindBy(xpath = "//input[@name=\"lastName\"]")
    private WebElement createLastName;

    @FindBy(xpath = "//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"]")
    private WebElement clickSaveButton;

    @FindBy(xpath = "//form/div[1]/div[2]/div/div/div[2]/input")
    private WebElement nickName;

    @FindBy(xpath = "//form/div[2]/div[1]/div[2]/div/div[2]/input")
    private WebElement otherID;

    @FindBy(xpath = "//form/div[2]/div[2]/div[1]/div/div[2]/input")
    private WebElement driverButton;

    @FindBy(xpath = "//form/div[2]/div[2]/div[2]/div/div[2]/div/div/i")
    private WebElement dateButton;

    @FindBy(xpath = "//ul[@class=\"oxd-calendar-selector\"]/li[1]")
    private WebElement mountsMenu;

    @FindBy(xpath = "//ul[@class=\"oxd-calendar-dropdown\"]/li[2]")
    private WebElement mounts;

    @FindBy(xpath = "//li[@class=\"oxd-calendar-selector-year\"]")
    private WebElement yearMenu;

    @FindBy(xpath = "//ul[@class=\"oxd-calendar-dropdown\"]/li[55]")
    private WebElement years;

    @FindBy(xpath = "//div[@class=\"oxd-calendar-dates-grid\"]/div[22]")
    private WebElement daysFeb;

    @FindBy(xpath = "//div[@class=\"oxd-calendar-dates-grid\"]/div[20]")
    private WebElement daysMar;

    @FindBy(xpath = "//form/div[3]/div[1]/div[1]/div/div[2]/div/div")
    private WebElement nationality;

    @FindBy(xpath = "//div[@role=\"listbox\"]/div[186]")
    private WebElement nationalityList;

    @FindBy(xpath = "//form/div[3]/div[1]/div[2]/div/div[2]/div/div/div[2]/i")
    private WebElement maritalStatus;

    @FindBy(xpath = "//div[@role=\"listbox\"]/div[3]")
    private WebElement maritalStatusList;

    @FindBy(xpath = "//input[@value=\"2\"]")
    private WebElement radioButton;

    @FindBy(xpath = "//form/div[1]/div/div[1]/div/div[2]/div/div/div[2]/i")
    private WebElement bloodTapeButton;

    @FindBy(xpath = "//div[@role=\"listbox\"]/div[4]")
    private WebElement bloodTapeList;

    @FindBy(xpath = "//form/div[1]/div/div[2]/div/div[2]/input")
    private WebElement test_Field;

    @FindBy(xpath = "//form/div[3]/div[2]/div[1]/div/div[2]/div/div/i")
    private WebElement dateOfBirthday;

    @FindBy(xpath = "//ul[@class=\"oxd-calendar-selector\"]/li[1]")
    private WebElement mountsMenuOFBirthday;

    @FindBy(xpath = "//ul[@role=\"menu\"]/li[10]")
    private WebElement mountsOfBirthday;

    @FindBy(xpath = "//li[@class=\"oxd-calendar-selector-year\"]")
    private WebElement yearMenuOfBirthday;

    @FindBy(xpath = "//ul[@role=\"menu\"]/li[20]")
    private WebElement yearsOfBirthday;

    @FindBy(xpath = "//div[@class=\"oxd-calendar-dates-grid\"]/div[30]")
    private WebElement daysOct;

    @FindBy(xpath = "//button[@class=\"oxd-button oxd-button--medium oxd-button--text\"]")
    private WebElement addAttachments;

    @FindBy(xpath = "//div[3]/div/form/div[1]/div/div/div/div[2]/div")
    private WebElement fileSelect;

    @FindBy(xpath = "//form/div[4]/button")
    private WebElement saveButton1;

    @FindBy(xpath = "//form/div[2]/button")
    private WebElement saveButton2;

    public PIMMenuPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void createPIM () throws InterruptedException {

        Wait<WebDriver> fluentWait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10)).
                pollingEvery(Duration.ofMillis(500)).ignoring(Exception.class);

        fluentWait.until(ExpectedConditions.elementToBeClickable(clickPIM)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(addButton)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(createFirstName)).sendKeys("Nazarii");
        fluentWait.until(ExpectedConditions.elementToBeClickable(createMidlName)).sendKeys("QA");
        fluentWait.until(ExpectedConditions.elementToBeClickable(createLastName)).sendKeys("Simson");
        fluentWait.until(ExpectedConditions.elementToBeClickable(clickSaveButton)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(otherID)).sendKeys("1715");
        fluentWait.until(ExpectedConditions.elementToBeClickable(driverButton)).sendKeys("1133557");
        fluentWait.until(ExpectedConditions.elementToBeClickable(nationality)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(nationalityList)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(maritalStatus)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(maritalStatusList)).click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", radioButton);
        fluentWait.until(ExpectedConditions.elementToBeClickable(dateButton)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(mountsMenu)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(mounts)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(yearMenu)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(years)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(daysFeb)).click();
       fluentWait.until(ExpectedConditions.elementToBeClickable(bloodTapeButton)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(bloodTapeList)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(test_Field)).sendKeys("Good Blood");
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", saveButton2);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", dateOfBirthday);
        fluentWait.until(ExpectedConditions.elementToBeClickable(mountsMenuOFBirthday)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(mountsOfBirthday)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(yearMenuOfBirthday)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(yearsOfBirthday)).click();
       fluentWait.until(ExpectedConditions.elementToBeClickable(daysOct)).click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", saveButton1);
}
   }
