package mypoint;

public class Test {
  public static void main(String[] args) {
    // Test constructors and toString()
    MyPoint  point1 = new MyPoint();
    System.out.println(point1);

    // Test setters and getters
    point1.setX(8);
    point1.setY(6);
    System.out.println("x is: " + point1.getX());
    System.out.println("y is: " + point1.getY());
    point1.setXY(3, 0);
    System.out.println(point1.getXY()[0]);
    System.out.println(point1.getXY()[1]);
    System.out.println(point1);

    // test another constructor
    MyPoint point2 = new MyPoint(0, 4);
    System.out.println(point2);

    // Test the overloaded methods distance()
    System.out.println(point1.distance(point2));
    System.out.println(point2.distance(point1));
    System.out.println(point1.distance(5, 6));
    System.out.println(point1.distance());

    MyPoint[] points = new MyPoint[10];
    for (int i = 0; i < points.length; i++) {
      points[i] = new MyPoint(i + 1, i + 1);
    }

    for (MyPoint point : points) {
      System.out.println(point);
    }
  }
}
