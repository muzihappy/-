package MainPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import utils.Actions;

public class MainPage1 {
    @FindBy(linkText = "新闻")
    private WebElement newbar;
    AndroidDriver driver;
    Actions action;
    public MainPage1(AndroidDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
        action= new Actions(driver);
    }
//    @FindBy(id = "action_new")
//    private WebElement action_new;
//    @FindBy(id = "toDoItemDetailET")
//    private WebElement toDoItemDetailET;
//    @FindBy(id = "saveBtn")
//    private WebElement saveBtn;
//    @FindBy(linkText = "删除")
//    private WebElement subbtn;
//
//    @FindBy(className = "android.widget.LinearLayout")
//    private WebElement LinearLayout;
//    @FindBy(id = "android:id/button1")
//    private WebElement queren;
}
