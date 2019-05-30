package com.example.appium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.File;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;


public class AndroidCreateSessionTest {

    private AndroidDriver<WebElement> driver;



    @BeforeClass

    public void setUp() throws Exception {

        File classpathRoot = new File(System.getProperty("user.dir"));

//        File appDir = new File(classpathRoot, "/apps");
        File appDir = new File(classpathRoot+"/apps");

        File app = new File(appDir.getCanonicalPath(), "ApiDemos-debug.apk");
        //可以直接写路径

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("deviceName", "Android Emulator");

        capabilities.setCapability("app", app.getAbsolutePath());

        capabilities.setCapability("appPackage", "io.appium.android.apis");

        capabilities.setCapability("appActivity", ".ApiDemos");

        driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);


//        driver = new AndroidDriver<WebElement>(getServiceUrl(), capabilities);

    }



    @AfterClass

    public void tearDown() {

        driver.quit();

    }



    @Test()

    public void testCreateSession() {

        String activity = driver.currentActivity();

        String pkg = driver.getCurrentPackage();

        Assert.assertEquals(activity, ".ApiDemos");

        Assert.assertEquals(pkg, "io.appium.android.apis");

    }

}