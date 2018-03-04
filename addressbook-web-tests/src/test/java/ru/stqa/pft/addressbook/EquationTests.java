package ru.stqa.pft.addressbook;

import org.testng.Assert;
import org.testng.annotations.Test;
import sandbox.Equation;

public class EquationTests {

  @Test
  public void test0(){
    Equation e = new Equation (1, 1, 1);
    Assert.assertEquals(e.rootNumber(), 0);

  }

  public void test1(){
    Equation e = new Equation (1, 2, 1);
    Assert.assertEquals(e.rootNumber(), 1);

  }

  public void tes2(){
    Equation e = new Equation (1, 5, 6);
    Assert.assertEquals(e.rootNumber(), 2);

  }

  public void testLinear() {
    Equation e = new Equation(0, 1, 1);
    Assert.assertEquals(e.rootNumber(), 1);
  }

  public void testConstant() {
    Equation e = new Equation(0, 0, 1);
    Assert.assertEquals(e.rootNumber(), 0);
  }

  public void testZero() {
    Equation e = new Equation(0, 0, 0);
    Assert.assertEquals(e.rootNumber(), 0);
  }
}
