import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.io.File;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import static org.openqa.selenium.OutputType.*;

public class LD {
    FirefoxDriver wd;
    
    @BeforeMethod
    public void setUp() throws Exception {
        wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true).setBinary("C:/Program Files/Mozilla Firefox/firefox.exe"));
        System.setProperty("webdriver.gecko.driver","C:/Program Files/Mozilla Firefox/geckodriver.exe");
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }
    
    @Test
    public void LD() {
        wd.get("https://service.advatech.pl/LanDeskProd.WebAccess/ss/Logon/Logon.rails");
        wd.findElement(By.id("Ecom_User_ID")).click();
        wd.findElement(By.id("Ecom_User_ID")).clear();
        wd.findElement(By.id("Ecom_User_ID")).sendKeys("awojtowicz");
        wd.findElement(By.id("Ecom_User_Password")).click();
        wd.findElement(By.id("Ecom_User_Password")).clear();
        wd.findElement(By.id("Ecom_User_Password")).sendKeys("arturkuba");
        wd.findElement(By.id("logonButton")).click();
        wd.findElement(By.xpath("//div[@id='secondaryToolbar']//span[.='Switch to Web Desk']")).click();
        wd.findElement(By.xpath("//li[@id='shortcutItem_01557a27-40e9-438d-8b4b-4b0653a0c248']//span[.='Help Desk 1st line']")).click();
        wd.findElement(By.xpath("//li[@id='shortcutItem_69ba6f75-80a1-4d9d-bba0-3d2e232bbe1e']//span[.='Nowe żądanie']")).click();
        wd.findElement(By.xpath("//div[@id='secondaryToolbar']//span[.='Log off']")).click();
    }
    
    @AfterMethod
    public void tearDown() {
        wd.quit();
    }
    
    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
