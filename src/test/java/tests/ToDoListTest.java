package tests;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.PointOption;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ToDoListPage;
import utilities.Driver;

public class ToDoListTest {
    AndroidDriver<AndroidElement> driver= Driver.getAndroidDriver();

    ToDoListPage page=new ToDoListPage();

    @Test
    public void test1() throws InterruptedException {
        // uygulamanin basarili bir sekilde yuklendigi dogrulanir
        Assert.assertTrue(driver.isAppInstalled("todolist.scheduleplanner.dailyplanner.todo.reminders"));


        // uygulaminin basarili bir sekilde acildigi dogrulanir
       // Assert.assertTrue(driver.findElementByXPath("//*[@text='Welcome to To-do List']").isDisplayed());
        Assert.assertTrue(page.WelComeButton.isDisplayed());

       // Ileri butonlarina tiklanir ve pop-up lar kapatilir
        page.ContinueButton.click();
        Thread.sleep(1000);
        page.ContinueButton.click();
        Thread.sleep(1000);
        page.XButton.click();
        Thread.sleep(1000);
        page.X2Button.click();

        // görev ekleme adimina gecilir
        page.TaskButton.click();
        Thread.sleep(1000);

        // görev adi girilir
        page.TaskWriteBox.sendKeys("Appium dersini calis");
        Thread.sleep(1000);

        // görev kaydedilir
        page.TaskSaveButton.click();

        TouchAction action=new TouchAction<>(driver);
        Thread.sleep(2000);
        for (int i = 0; i < 3; i++) {
            action.press(PointOption.point(900,1200)).release().perform();
        }

       // görev silinir
        page.TaskSpace.click();
        Thread.sleep(1000);
        page.ThreePunkt.click();
        Thread.sleep(1000);
        page.DeleteText.click();
        Thread.sleep(1000);
        page.DeleteConfirm.click();

      // Görev olusturma sayfasina geri dönüldügü dogrulanir
        Assert.assertTrue(page.TaskButton.isDisplayed());

    }

}
