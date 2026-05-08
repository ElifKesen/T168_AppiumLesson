package tests;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ToDoListPage;
import utilities.Driver;

public class ToDoListTest {
    AndroidDriver<AndroidElement> driver= Driver.getAndroidDriver();

    ToDoListPage page=new ToDoListPage();

// görev kaydedilir
// görev silinir
// Görev olusturma sayfasina geri dönüldügü dogrulanir

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

    }

}
