package MainPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import io.appium.java_client.android.AndroidDriver;
import utils.Actions;

public class MainPage {

    @FindBy(id = "action_new")
    private WebElement action_new;
    @FindBy(id = "toDoItemDetailET")
    private WebElement toDoItemDetailET;
    @FindBy(id = "saveBtn")
    private WebElement saveBtn;
    @FindBy(linkText = "删除")
    private WebElement subbtn;

    @FindBy(className = "android.widget.LinearLayout")
    private WebElement LinearLayout;
    @FindBy(id = "android:id/button1")
    private WebElement queren;

    @FindBy(className = "android.widget.RelativeLayout")
    private WebElement RelativeLayout;

    @FindBy(linkText = "编辑")
    private WebElement edit;
    @FindBy(id = "saveToDoItemBtn")
    private WebElement saveToDoItemBtn;
    //    @FindAll({@FindBy(id="android:id/title")})
//    public List<WebElement> elementList;
//    private String getSave_btn;
//    private String add_btn="";
//    private String add_text="";
//    private String save_btn="";
//    private String long_press="";
    AndroidDriver driver;
    Actions action;

    public MainPage(AndroidDriver driver) {
        this.driver = driver;

    }

    //增
    public void add(String editcontent) {
        action.click(action_new);
        action.type(toDoItemDetailET, editcontent);
        action.click(saveBtn);
    }

    public void addmany(String editcontent)
    {
        for(int i=0;i<5;i++)
        {
            action.click(action_new);
            action.type(toDoItemDetailET, editcontent);
            action.click(saveBtn);
        }
    }
    //删//怎么知道长度
    //删//怎么知道长度
    public void sub()
    {
        action.longPress(RelativeLayout);
        action.click(subbtn);
        action.click(queren);

    }
    public void submany()
    {
        action.longPress(RelativeLayout);
        action.click(subbtn);
        action.click(queren);
    }

    //改
    public void edit(String context)
    {
        action.longPress(RelativeLayout);
        action.click(edit);
        action.type(toDoItemDetailET,context);
        action.click(saveToDoItemBtn);
    }
    //查第一个
    public void select()
    {
        action.click(RelativeLayout);
    }
    //有条件查询
}
