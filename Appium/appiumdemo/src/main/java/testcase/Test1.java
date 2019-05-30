package testcase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import swipe.*;
public class Test1 {
    public AndroidDriver<WebElement> driver;

    public AndroidDriver getDriver() {
        return driver;
    }

    @Test
    public void StartApp() throws IOException, InterruptedException {
        File classpathRoot = new File(System.getProperty("user.dir"));

        File appDir = new File(classpathRoot, "/apps");

        File app = new File(appDir.getCanonicalPath(), "SnowCrash.apk");

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("deviceName", "127.0.0.1:62001");

        capabilities.setCapability("appPackage", "cn.edu.hebtu.software.snowcarsh2");

        capabilities.setCapability("appActivity", ".activity.startActvity.WelcomeActivity");

        driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        SwipeClass swipeClass=new SwipeClass();
        swipeClass.swipeToLeft(driver);
        swipeClass.swipeToLeft(driver);
        swipeClass.swipeToLeft(driver);
        swipeClass.swipeToLeft(driver);
        swipeClass.swipeToLeft(driver);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElementById("startButton").click();

        //上滑操作
        swipeClass.swipeToUp(driver);
        swipeClass.swipeToUp(driver);
        swipeClass.swipeToUp(driver);
        swipeClass.swipeToUp(driver);
        swipeClass.swipeToUp(driver);
        swipeClass.swipeToUp(driver);
        swipeClass.swipeToUp(driver);
        swipeClass.swipeToUp(driver);

        //点击怪默之王（失败）
        driver.findElementByClassName("android.widget.ImageView").click();
        //等待
        Thread.sleep(3000);
        //针对怪默之王进行左滑、右滑操作

    }
}


