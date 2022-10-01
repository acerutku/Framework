package com.techproed.utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class TestBaseFinal {

    protected WebDriver driver;
    protected static ExtentReports extentReports;
    protected static ExtentTest extentTest;
    protected static ExtentHtmlReporter extentHtmlReporter ;
    @BeforeTest(alwaysRun = true)
    public void setUpTest(){//This is how to set up Extent report.We will create and use this one in out test classes
        extentReports = new ExtentReports();//1.create object to set the location of the report
        String filePath = System.getProperty("user.dir") + "/test-output/nyprojectreport.html"; // create a custom report in the current project
        //Folder name = test-output, File name = report.html
        //String filePath = System.getProperty("user.dir) + "/test-output/nyprojectreport.html"; ==> THIS IS FOR WINDOWS USER
        extentHtmlReporter = new ExtentHtmlReporter(filePath); //2.creating the report with the path we created
        extentReports.attachReporter(extentHtmlReporter);//3.attaching the html report to our custom report
        //WWE CAN ADD CUSTOM INFO . NOT NECASSARY. JUST TO GIVE MORE INFORMATION TO THE USER OR TEAM
        extentReports.setSystemInfo("Environment","Environment Name");
        extentReports.setSystemInfo("Browser",ConfigReader.getProperty("browser"));
        extentReports.setSystemInfo("Automation Engineer","ENGINEER INFORMATION");
        extentHtmlReporter.config().setDocumentTitle("FHC Trip Reports");
        extentHtmlReporter.config().setReportName("FHC Trip Automation Reports");

    }
    @BeforeMethod(alwaysRun = true)
    public void setUpMethod(){
        driver = Driver.getDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(ConfigReader.getProperty("fhc_login_url"));
    }
    // @AfterMethod(alwaysRun = true)//In AfterMethod, we are getting the screenshots and attaching the report when test fails
    // public void tearDownMethod( ITestResult result) throws IOException {
    //    if (result.getStatus() == ITestResult.FAILURE) {//When test case fails. then take he screenshot and attached the report


    //      String screenshotLocation = ReusableMethods.getScreenshot(result.getName());// getScreenshot is coming from ReusableMethods
    //     extentTest.fail(result.getName());
    ///      extentTest.fail(result.getThrowable());
    //   } else if (result.getStatus() == ITestResult.SKIP) {
    //        extentTest.skip("Test Case is Skipped: " + result.getName());
    //      }
    //      driver.close();
    //   }



    @AfterTest(alwaysRun = true)
    public void tearDownTest(){extentReports.flush();}
}
