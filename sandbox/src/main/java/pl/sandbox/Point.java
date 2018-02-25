package pl.sandbox;

public class Point {

  final double x;
  final double y;
  double distance;

  public Point(){
    x=0.0;
    y=0.0;
}

  public Point(double x, double y) {
    this.x=x;
    this.y=y;
  }

  public double Odleglosc(Point a, Point b){
    double dx = a.x - b.x;
    double dy = a.y - b.y;
    distance = Math.sqrt(dx*dx + dy*dy);
    return distance;
  }
  public String toString(){
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
  }
}