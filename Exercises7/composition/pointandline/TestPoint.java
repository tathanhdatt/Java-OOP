package composition.pointandline;

public class TestPoint {
  public static void main(String[] args) {
    // test constructor
    Point point = new Point(10, 20);
    System.out.println(point);

    // test setters and getters
    point.setX(100);
    point.setY(10);
    System.out.println("x: " + point.getX());
    System.out.println("y: " + point.getY());
  }
}
