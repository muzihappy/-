package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.Action;

import io.appium.java_client.android.AndroidDriver;

public class LoginPage1 {
    @FindBy(id ="nameET")
    private String txt_name;
    @FindBy(id ="passwordET")
    private String txt_password;
    @FindBy(id ="android.widget.Button")
    private WebElement btn_submit;
    AndroidDriver driver;
    Action action;
    public  LoginPage1(AndroidDriver driver, Action action)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
        this.action=action;
    }
//    public void login(String name,String password)
//    {
//        this.txt_name
//    }

}
