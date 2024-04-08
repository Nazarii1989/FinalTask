package org.example;

import Page.*;
import WebDriver_1.WebDriverFinal;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Main_FinalTask {

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
    public static void main(String[] args) throws InterruptedException {
           driver = WebDriverFinal.getWebDriver();

           login_page = new LoginPage(driver);
           login_page.loginPage();
       }

       @Test
    public void Test1() throws InterruptedException {
       admin_page = new AdminPage(driver);
        admin_page.clickAdminPage();}

    @Test
    public void Test2() throws InterruptedException {

        new_job_tittle_page = new NewJobTittlePage(driver);
       new_job_tittle_page.createNewJob();}

    @Test
    public void Test3() throws InterruptedException {

        verify_page_job_tittle = new VerifyJobTittlePage(driver);
        verify_page_job_tittle.verifyJobTittle();}

    @Test
    public void Test4() throws InterruptedException {

        pim_menu_page = new PIMMenuPage(driver);
        pim_menu_page.createPIM();}

    @Test
    public void Test5() throws InterruptedException {

        create_job_employer_page = new JobEmployerCreationPage(driver);
       create_job_employer_page.createJobEmployer();}

    @Test
    public void Test6() throws InterruptedException {

        admin_menu_page = new AdminMenuPage(driver);
        admin_menu_page.clickAdminMenu();}

    @Test
    public void Test7() throws InterruptedException {

        user_management_page = new UserManagementPage(driver);
        user_management_page.createUser();}

    @Test
    public void Test8() throws InterruptedException {

        verify_admin_page = new VerifyAdminPage(driver);
        verify_admin_page.verifyAdmin();


    }

}
