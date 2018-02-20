package pl.sandbox;

public class hello {

	public static void main(String[] args) {
    hello("world");
    hello("artur");


    Square s = new Square(5);
    //s.l = 5;
    System.out.println("powierzchnia kwadratu o boku " + s.l + " = " + s.area());


    Rectangle r = new Rectangle(4, 6);
    //r.a = 4;
    //r.b = 6;
    System.out.println("powierzchnia prostokatu o boku " + r.a + " i " + r.b +  " = " + r.area());
  }
	public static void hello(String somebody) {

    System.out.println("Hello, " + somebody + "!");
  }

  public static double area(Square s) {
	  return s.l * s.l;
  }

  public static double area(Rectangle r) {
	  return r.a * r.b;
  }
}