package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.Action;

import io.appium.java_client.android.AndroidDriver;

public class LoginPage {
//    @FindBy(id ="nameET")
//    private String txt_name;
//    @FindBy(id ="passwordET")
//    private String txt_password;
//    @FindBy(id ="android.widget.Button")
//    private WebElement btn_submit;


    //对象和 方法
    //要么继承要么构造
    private String txt_name="";
    private String txt_password="";
    private String btn_submit="";
    AndroidDriver driver;
    Action action;
    public  LoginPage(AndroidDriver driver,Action action)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
        this.action=action;
    }
    public LoginPage(AndroidDriver driver)
    {
        this.driver=driver;
    }
    public void login(String name,String password)
    {
        this.driver.findElement(By.id(txt_name)).sendKeys(name);
        this.driver.findElement(By.id(txt_password)).sendKeys(password);
        this.driver.findElement(By.className(btn_submit)).click();


    }
    //利用typeFindBy登录操作

}
