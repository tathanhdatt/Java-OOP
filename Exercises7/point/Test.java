package point;

public class Test {
  public static void main(String[] args) {
    // Point2D
    // test constructor
    Point2D point2D1 = new Point2D();
    System.out.println(point2D1);
    Point2D point2D2 = new Point2D(1.1f, 2.2f);
    System.out.println(point2D2);
    // test getters and setters
    point2D1.setX(1.0f);
    point2D1.setY(2.0f);
    System.out.println(point2D1.getX() + ", " + point2D1.getY());
    point2D1.setXY(2.0f, 3.0f);
    System.out.println(point2D1.getXY()[0] + ", " + point2D1.getXY()[1]);

    // Point3D
    // test constructor
    Point3D point3D1 = new Point3D();
    System.out.println(point3D1);
    Point3D point3D2 = new Point3D(1.0f, 1.1f, 1.2f);
    System.out.println(point3D2);

    // test setters and getters
    point3D1.setZ(3.0f);
    System.out.println(point3D1.getX() + ", " + point3D1.getY() + ", " + point3D1.getZ());
    point3D1.setXYZ(2.0f, 3.0f, 4.0f);
    System.out.println(point3D1.getXYZ()[0] + ", " + point3D1.getXYZ()[1] + ", " + point3D1.getXYZ()[2]);

  }
}
