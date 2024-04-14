package WebDriver_1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class WebDriverFinal {

    public static WebDriver getWebDriver(){
        if(driver == null){
            InitializeWedDriverMainTask();
        }
        return driver;
    }

    private static WebDriver driver;
    private static String URL = "https://opensource-demo.orangehrmlive.com/";


    private WebDriverFinal () {}


    private static void InitializeWedDriverMainTask () {
        WebDriverManager.edgedriver().setup();
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");
        driver = new EdgeDriver(edgeOptions);
        driver.get(URL);
    }

}
