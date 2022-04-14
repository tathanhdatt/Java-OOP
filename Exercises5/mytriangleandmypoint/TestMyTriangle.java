package mytriangleandmypoint;

public class TestMyTriangle {
  public static void main(String[] args) {
    // Create point
    MyPoint v1 = new MyPoint();
    MyPoint v2 = new MyPoint(3, 0);
    MyPoint v3 = new MyPoint(0, 4);

    // Test constructors
    MyTriangle t1 = new MyTriangle(v1, v2 ,v3);
    System.out.println(t1);
    MyTriangle t20 = new MyTriangle(0, 0, 6, 0, 3, 4);
    System.out.println(t20);

    // Test getPerimeter() and getType()
    System.out.println("t1's perimeter: " + t1.getPerimeter());
    System.out.println("t1's type: " + t1.getType());
    System.out.println("t20's perimeter: " + t20.getPerimeter());
    System.out.println("t20's type: " + t20.getType());
  }
}
