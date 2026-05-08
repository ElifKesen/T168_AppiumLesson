package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ToDoListPage {
    public ToDoListPage(){
        PageFactory.initElements((WebDriver)Driver.getAndroidDriver(),this);
    }
    @FindBy(xpath ="//*[@text='Welcome to To-do List']" )
    public WebElement WelComeButton;

    @FindBy(xpath ="//*[@text='CONTINUE']" )
    public WebElement ContinueButton;

    @FindBy(id = "todolist.scheduleplanner.dailyplanner.todo.reminders:id/toolbar_back")
    public WebElement XButton;

    @FindBy(id = "todolist.scheduleplanner.dailyplanner.todo.reminders:id/dialog_pro_first_close")
    public WebElement X2Button;

    @FindBy(id = "todolist.scheduleplanner.dailyplanner.todo.reminders:id/iv_task_add")
    public WebElement TaskButton;

    @FindBy(id = "todolist.scheduleplanner.dailyplanner.todo.reminders:id/task_create_input")
    public WebElement TaskWriteBox;

}
