package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import utils.Actions;

//APP首页
public class HomePage {
    @FindBy(linkText = "新闻")
    private WebElement newBar;

    @FindBy(linkText = "电台")
    private WebElement  transBar;

    //个人登录
    @FindBy(className = "android.widget.ImageButton")
    private WebElement personBut;
    @FindBy(id = "cn.edu.hebtu.software.snowcarsh2:id/icon_image")
            private WebElement openLogin;
    @FindBy(id = "cn.edu.hebtu.software.snowcarsh2:id/et_username")
            private WebElement username;
    @FindBy(id = "cn.edu.hebtu.software.snowcarsh2:id/et_password")
            private WebElement password;
    @FindBy(id = "cn.edu.hebtu.software.snowcarsh2:id/btn_login")
            private WebElement loginBut;

    //电台
    @FindBy(id = "cn.edu.hebtu.software.snowcarsh2:id/radio_image")
            private WebElement radioImg;
    @FindBy(linkText = "《魔兽故事》")
            private WebElement moshouStory;
    AndroidDriver driver;
    Actions action;
    public HomePage(AndroidDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
        action= new Actions(driver);
    }
    public void intoNew()
    {
        action.click(newBar);
    }
    public void login( String user, String passw)
    {
        action.click(openLogin);
        action.type(username,user);
        action.type(password,passw);
        action.click(loginBut);
    }
    public void intoTransBar()
    {
        action.click(transBar);
    }


}
