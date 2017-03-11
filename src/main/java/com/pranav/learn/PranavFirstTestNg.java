package com.pranav.learn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by KARODE on 3/9/2017.
 */
public class PranavFirstTestNg {
    WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver = new FirefoxDriver() ;
    }
    @Test
    public void testOne(){
        driver.get("https://www.facebook.com/");

        String title = driver.getTitle() ;

        Assert.assertTrue(title.contains("Facebook"));
        System.out.println(title);
    }
    @Test
    public void testTwo(){
        driver.get("http://amazon.com");

        String title = driver.getTitle() ;

        Assert.assertTrue(title.contains("Shop"));
    }
    @AfterMethod
    public void closeApp(){
        driver.quit();
    }



}
