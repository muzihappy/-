//package com.example.appiumdemo;
//
//import static org.junit.Assert.assertEquals;
//
//import io.appium.java_client.NoSuchContextException;
//import io.appium.java_client.android.Activity;
//import io.appium.java_client.android.AndroidDriver;
//
//import org.junit.BeforeClass;
//import org.junit.Test;
//import org.openqa.selenium.WebElement;
//
//public class AndroidContextTest extends BaseTest{
//
//    @BeforeClass
//    public static void beforeClass2() throws Exception {
//        Activity activity = new Activity("io.appium.android.apis", ".view.WebView1");
//        driver.startActivity(activity);
//        Thread.sleep(20000);
//    }
//
//    @Test public void testGetContext() {
//        assertEquals("NATIVE_APP", driver.getContext());
//    }
//
//    @Test public void testGetContextHandles() {
//        assertEquals(driver.getContextHandles().size(), 2);
//    }
//
//    @Test public void testSwitchContext() {
//        driver.getContextHandles();
//        driver.context("WEBVIEW_io.appium.android.apis");
//        assertEquals(driver.getContext(), "WEBVIEW_io.appium.android.apis");
//        driver.context("NATIVE_APP");
//        assertEquals(driver.getContext(), "NATIVE_APP");
//    }
//
//    @Test(expected = NoSuchContextException.class) public void testContextError() {
//        driver.context("Planet of the Ape-ium");
//        assertEquals("Planet of the Ape-ium", driver.getContext());
//    }
//
//}