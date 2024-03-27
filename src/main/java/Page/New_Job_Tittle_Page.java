package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class New_Job_Tittle_Page {

    private WebDriver driver;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]")
    private WebElement Job;

    @FindBy(xpath = "//a[text()=\"Job Titles\"]")
    private WebElement JobTitles;

    @FindBy(xpath = "//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]")
    private WebElement Add;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")
    private WebElement AddJobTittle;

    @FindBy(xpath = "//textarea[@placeholder=\"Type description here\"]")
    private WebElement AddJobDescription;

    @FindBy(xpath = "//div[@class=\"oxd-file-button\"]")
    private WebElement File;

    @FindBy(xpath = "//textarea[@placeholder=\"Add note\"]")
    private WebElement Note;

    @FindBy(xpath = "//button[@type=\"submit\"]")
    private WebElement Save;

    public New_Job_Tittle_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void New_Job() throws InterruptedException {

        Wait<WebDriver> fluentWait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10)).
                pollingEvery(Duration.ofMillis(500)).ignoring(Exception.class);

        fluentWait.until(ExpectedConditions.elementToBeClickable(Job)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(JobTitles)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(Add)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(AddJobTittle)).sendKeys("WorkerQANazar");
        fluentWait.until(ExpectedConditions.elementToBeClickable(AddJobDescription)).sendKeys("Good Worker QA");
        fluentWait.until(ExpectedConditions.elementToBeClickable(Note)).sendKeys("Staff");
        fluentWait.until(ExpectedConditions.elementToBeClickable(Save)).click();
    }
}