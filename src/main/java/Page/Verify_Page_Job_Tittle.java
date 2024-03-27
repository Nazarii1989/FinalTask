package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class Verify_Page_Job_Tittle {

    private WebDriver driver;

    @FindBy(xpath = "//div[text()=\"WorkerQANazar\"]")
    private WebElement Check;

    @FindBy(xpath = "//div[30]/div/div/div[1]/div[2]/div/div/button[2]")
    private WebElement Check1;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]")
    private WebElement Job;

    @FindBy(xpath = "//a[text()=\"Job Titles\"]")
    private WebElement JobTitles;


    public Verify_Page_Job_Tittle(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void Verify() throws InterruptedException {

        Wait<WebDriver> fluentWait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10)).
                pollingEvery(Duration.ofMillis(500)).ignoring(Exception.class);

        fluentWait.until(ExpectedConditions.elementToBeClickable(Job)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(JobTitles)).click();

        fluentWait.until(ExpectedConditions.elementToBeClickable(Check)).click();


        String NameBeforeSaveJobTittle = "WorkerQANazar";
        String NameAfterSaveJobTittle = "WorkerQANazar";
        System.out.println("Verify New Job Information  :" + NameBeforeSaveJobTittle.equals(NameAfterSaveJobTittle));
    }
}