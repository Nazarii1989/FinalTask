package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class VerifyJobTittlePage {

    private WebDriver driver;

    @FindBy(xpath = "//div[text()=\"WorkerQANazar\"]")
    private WebElement clickCheck;


    @FindBy(xpath = "//nav[@aria-label=\"Topbar Menu\"]/ul/li[2]")
    private WebElement getJobTitles;

    @FindBy(xpath = "//a[text()=\"Job Titles\"]")
    private WebElement jobTitles;


    public VerifyJobTittlePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void verifyJobTittle() throws InterruptedException {

        Wait<WebDriver> fluentWait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10)).
                pollingEvery(Duration.ofMillis(500)).ignoring(Exception.class);

        fluentWait.until(ExpectedConditions.elementToBeClickable(getJobTitles)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(jobTitles)).click();

        fluentWait.until(ExpectedConditions.elementToBeClickable(clickCheck)).click();


        String NameBeforeSaveJobTittle = "WorkerQANazar";
        String NameAfterSaveJobTittle = "WorkerQANazar";
        System.out.println("Verify New Job Information  :" + NameBeforeSaveJobTittle.equals(NameAfterSaveJobTittle));
    }
}