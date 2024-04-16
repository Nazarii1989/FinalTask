package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class NewJobTittlePage {

    private WebDriver driver;

    @FindBy(xpath = "//nav[@aria-label=\"Topbar Menu\"]/ul/li[2]")
    private WebElement createJob;

    @FindBy(xpath = "//a[text()=\"Job Titles\"]")
    private WebElement jobTitles;

    @FindBy(xpath = "//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]")
    private WebElement clickAddButton;

    @FindBy(xpath = "(//input[@class=\"oxd-input oxd-input--active\"])[2]")
    private WebElement addJobTittle;

    @FindBy(xpath = "//textarea[@placeholder=\"Type description here\"]")
    private WebElement addJobDescription;

    @FindBy(xpath = "//div[@class=\"oxd-file-button\"]")
    private WebElement file;

    @FindBy(xpath = "//textarea[@placeholder=\"Add note\"]")
    private WebElement clickNote;

    @FindBy(xpath = "//button[@type=\"submit\"]")
    private WebElement Save;

    public NewJobTittlePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void createNewJob() throws InterruptedException {

        Wait<WebDriver> fluentWait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10)).
                pollingEvery(Duration.ofMillis(500)).ignoring(Exception.class);

        fluentWait.until(ExpectedConditions.elementToBeClickable(createJob)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(jobTitles)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(clickAddButton)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(addJobTittle)).sendKeys("WorkerQANazar");
        fluentWait.until(ExpectedConditions.elementToBeClickable(addJobDescription)).sendKeys("Good Worker QA");
        fluentWait.until(ExpectedConditions.elementToBeClickable(clickNote)).sendKeys("Staff");
        fluentWait.until(ExpectedConditions.elementToBeClickable(Save)).click();
    }
}