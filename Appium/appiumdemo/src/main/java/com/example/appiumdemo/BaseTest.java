package com.example.appiumdemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;


//连接服务器
public class BaseTest {

    AndroidDriver<WebElement> driver;

    @BeforeSuite
    public void StartApp() throws IOException {
        File classpathRoot = new File(System.getProperty("user.dir"));

        File appDir = new File(classpathRoot, "/apps");

        File app = new File(appDir.getCanonicalPath(), "todolist.apk");

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("deviceName", "127.0.0.1:62001");

        //该注释掉
//        capabilities.setCapability("app", app.getAbsolutePath());
        capabilities.setCapability("noReset", true);
        //怎么写

        capabilities.setCapability("appPackage", "com.example.Notes");

        //怎么写
        capabilities.setCapability("appActivity", ".Activity");
        capabilities.setCapability("unicodeKeyborder", "true");
        driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

    //结束服务器
    @AfterSuite
    public  void teardown()
    {
        driver.quit();
    }
}

