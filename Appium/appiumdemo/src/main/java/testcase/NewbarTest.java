package testcase;

import com.example.appiumdemo.BaseTest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import base.BaseTest1;
import pages.HomePage;

public class NewbarTest extends BaseTest1 {
    @Test
    public void openNewBar()
    {
        HomePage homePage=new HomePage(getDriver());
    }


}
