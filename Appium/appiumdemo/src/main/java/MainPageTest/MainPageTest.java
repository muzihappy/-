package MainPageTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import MainPage.MainPage;
import base.BaseTest;

public class MainPageTest extends BaseTest {
    //增
    @Test
    public void addSuccessful()
    {
         MainPage mainPage=new MainPage(getDriver());
        mainPage.add("别忘记带卡");
        System.out.print(getDriver().currentActivity());
        Assert.assertEquals("",getDriver().currentActivity());
    }
}
