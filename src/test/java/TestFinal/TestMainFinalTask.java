package TestFinal;

import Page.*;
import WebDriver_1.WebDriverFinal;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestMainFinalTask {

    public static WebDriver driver;
    public static LoginPage login_page;
    public static AdminPage admin_page;
    public static NewJobTittlePage new_job_tittle_page;
    public static VerifyJobTittlePage verify_page_job_tittle;
    public static PIMMenuPage pim_menu_page;
    public static JobEmployerCreationPage create_job_employer_page;
    public static AdminMenuPage admin_menu_page;
    public static UserManagementPage user_management_page;
    public static VerifyAdminPage verify_admin_page;



    @Test
    public static void testMainFinalTask () throws InterruptedException {
           driver = WebDriverFinal.getWebDriver();

           login_page = new LoginPage(driver);
           login_page.loginPage();

           admin_page = new AdminPage(driver);
           admin_page.clickAdminPage();

           new_job_tittle_page = new NewJobTittlePage(driver);
           new_job_tittle_page.createNewJob();

           verify_page_job_tittle = new VerifyJobTittlePage(driver);
           verify_page_job_tittle.verifyJobTittle();

           pim_menu_page = new PIMMenuPage(driver);
           pim_menu_page.createPIM();

           create_job_employer_page = new JobEmployerCreationPage(driver);
           create_job_employer_page.createJobEmployer();

           admin_menu_page = new AdminMenuPage(driver);
           admin_menu_page.clickAdminMenu();

           user_management_page = new UserManagementPage(driver);
           user_management_page.createUser();

           verify_admin_page = new VerifyAdminPage(driver);
           verify_admin_page.verifyAdmin();


    }

}
