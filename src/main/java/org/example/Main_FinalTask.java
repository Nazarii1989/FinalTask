package org.example;

import Page.*;
import WebDriver_1.WebDriverFinal;
import org.openqa.selenium.WebDriver;

public class Main_FinalTask {

    public static WebDriver driver;

    public static Login_Page login_page;

    public static Admin_Page admin_page;

    public static New_Job_Tittle_Page new_job_tittle_page;

    public static Verify_Page_Job_Tittle verify_page_job_tittle;

    public static PIM_Menu_Page pim_menu_page;

    public static Create_Job_Employer_Page create_job_employer_page;

    public static Admin_Menu_Page admin_menu_page;

    public static User_Management_Page user_management_page;

    public static Verify_Admin_Page verify_admin_page;



    public static void main(String[] args) throws InterruptedException {
        driver = WebDriverFinal.getWebDriver();

        login_page = new Login_Page(driver);
        login_page.Login();

       admin_page = new Admin_Page(driver);
        admin_page.Admin();

        new_job_tittle_page = new New_Job_Tittle_Page(driver);
       new_job_tittle_page.New_Job();

        verify_page_job_tittle = new Verify_Page_Job_Tittle(driver);
        verify_page_job_tittle.Verify();

        pim_menu_page = new PIM_Menu_Page(driver);
        pim_menu_page.PIM_Menu();

        create_job_employer_page = new Create_Job_Employer_Page(driver);
       create_job_employer_page.Job_Employer();

        admin_menu_page = new Admin_Menu_Page(driver);
        admin_menu_page.Admin_M();

        user_management_page = new User_Management_Page(driver);
        user_management_page.User();

        verify_admin_page = new Verify_Admin_Page(driver);
        verify_admin_page.VerifyAdmin();



    }
}
