package com.pranav.learn;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by KARODE on 3/9/2017.
 */
public class PranavFirstTestNg extends BaseTest{
    static final Logger LOGGER = LogManager.getLogger(BaseTest.class);


    @Test
    public void testOne(){
        ExtentTest test = extent.startTest("TestOne", "opening Facebook and asserting");
       driver.get("https://www.facebook.com/");
       LOGGER.info("This Command is to open facebook.com");

        test.log(LogStatus.INFO, "getting the title");
      String title = driver.getTitle() ;

      Assert.assertTrue(title.contains("Facebook"));
      LOGGER.info("This command will assert the title");



        extent.endTest(test);
        }

    @Test
    public void testTwo()
        {
            ExtentTest test = extent.startTest("TestTwo", "opening amazon and asserting");
        driver.get("http://amazon.com");
        LOGGER.info("This Command is to open amazon.com");
            test.log(LogStatus.INFO, "getting the title");

        String title = driver.getTitle() ;

        Assert.assertTrue(title.contains("Shop"));
        LOGGER.info("This Command will assert the title");

            extent.endTest(test);
    }

    }





