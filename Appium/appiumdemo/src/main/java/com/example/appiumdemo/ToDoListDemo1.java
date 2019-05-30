package com.example.appiumdemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;

public class ToDoListDemo1 {

    AndroidDriver<WebElement> driver;

    @BeforeSuite
    public void StartApp() throws IOException {
        File classpathRoot = new File(System.getProperty("user.dir"));

        File appDir = new File(classpathRoot, "/apps");

        File app = new File(appDir.getCanonicalPath(), "todolist.apk");

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("deviceName", "127.0.0.1:62001");

        //该注释掉
        capabilities.setCapability("app", app.getAbsolutePath());
        //怎么写

        capabilities.setCapability("appPackage", "com.example.todolist");

        //怎么写
        capabilities.setCapability("appActivity", ".Activity");

        driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    //登录
    @Test
    public void login()
    {
        //
        driver.findElementByClassName("android.widget.TextView").click();
        //
        driver.findElementById("com.example.todolist:id/action_new").click();
        driver.findElementById("com.example.todolist:id/toDoItemDetailET").sendKeys("dadoudou");
        driver.findElementById("com.example.todolist:id/saveBtn");

    }
    //拖拽
//    @AfterSuite
//    public  void teardown()
//    {
//        driver.quit();
//    }
}

