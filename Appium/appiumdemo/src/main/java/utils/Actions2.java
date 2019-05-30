package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

public class Actions2 {
    AndroidDriver<WebElement> driver;
    AndroidTouchAction aca;
    TouchAction dragNDrop;
    public Actions2(AndroidDriver<WebElement> driver)
    {
        this.driver=driver;
        AndroidTouchAction aca=new AndroidTouchAction(driver);
        TouchAction dragNDrop=new TouchAction(driver);

    }
    public void type(By element, String context)
    {

    }
    public void click(WebElement element)
    {
        element.click();
    }
    public void longPress(WebElement ele)
    {
        TouchAction dragNDrop=new TouchAction(driver).longPress(element(ele)).perform();
    }
    //坐标点的划动
//    public void swip(PointOption fromOption, WebElement toOption, int time)
//    {
////        AndroidTouchAction aca=new AndroidTouchAction(driver);
//        aca.press(fromOption).WaitOptions.waitOptions(ofSeconds(time)).moveTo(toOption).perform();
////          aca.press(fromOption).waitAction()
//    }

    //元素间的滑动
    public void drop(WebElement fromEle,WebElement toEle)
    {
        TouchAction dragNDrop = new TouchAction(driver)
                .longPress(element(fromEle))
                .moveTo(element(toEle))
                .perform();
    }
//    public void drop(WebElement fromEle,WebElement toEle,long time)
//    {
//
//        TouchAction dragNDrop = new TouchAction(driver)
//                .longPress(longPressOptions()
//                        .withDuration(ofSeconds(2)))
//                .moveTo(toEle).perform();
//    }
//    //AndroidTouchAction划动

    //拖动
}
