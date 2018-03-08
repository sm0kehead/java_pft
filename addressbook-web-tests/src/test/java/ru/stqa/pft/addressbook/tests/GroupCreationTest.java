package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupCreationTest extends TestBase {


  @Test
  public void testGroupCreationTest() {

    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().createGroup(new GroupData("test1", "test2", "test3"));

  }

}
