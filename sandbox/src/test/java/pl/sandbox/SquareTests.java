package pl.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;
import pl.sandbox.Square;


public class SquareTests {

  @Test
  public void testArea() {
    Square s = new Square(5);
    Assert.assertEquals(s.area(), 25.0);
  }
}
