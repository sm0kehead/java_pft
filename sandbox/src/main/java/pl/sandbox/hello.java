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

  /*public String toString(){
    return "Odległość od punktu a do b wynosi: " + distance +".";
  }
  public static void main(String[] args){
    Point p0 = new Point();
    Point p1 = new Point(0.0,0.0);
    Point p2 = new Point(3.0,3.0);
    Point p3 = new Point(9.0,9.0);
    System.out.println(p0.toString());
    System.out.println(p0.toString());
    System.out.println(p0.toString());
    System.out.println(p0.toString());
    System.out.println("Odległość między punktami p1 i p2 wynosi" + p1.Odleglosc(p1, p2));
    System.out.println("Odległość między punktami p1 i p2 wynosi" + p1.Odleglosc(p1, p3));
  }*/
}