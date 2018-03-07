package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;


public class NavigationHelper extends HelperBase {
  //private FirefoxDriver wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true).setBinary("C:/Program Files/Mozilla Firefox/firefox.exe"));

  public NavigationHelper(WebDriver wd) {
    super(wd);
  }

  public void gotoGroupPage() {
    if (isElementPresent(By.tagName("h1"))
            && wd.findElement(By.tagName("h1")).getText().equals("Groups")
            && isElementPresent(By.name("new"))){
      return;
  }
      click(By.linkText("groups"));
  }

  private boolean isElementPresent(By locator) {
    try{
      wd.findElement(locator);
      return true;
    }catch (NoSuchElementException ex){
      return false;
    }
  }
}
