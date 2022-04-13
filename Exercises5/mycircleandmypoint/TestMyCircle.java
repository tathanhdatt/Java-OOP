package mycircleandmypoint;

public class TestMyCircle {
  public static void main(String[] args) {
    // Test construct
    MyCircle circle1 = new MyCircle();
    System.out.println(circle1);

    // Test setters and getters
    circle1.setCenter(new MyPoint(1, 1));
    circle1.setRadius(2);
    System.out.println("Center: " + circle1.getCenter());
    System.out.println("Radius: " + circle1.getRadius());

    circle1.setCenterX(2);
    circle1.setCenterY(2);
    System.out.println("Center's x: " + circle1.getCenterX());
    System.out.println("Center's y: " + circle1.getCenterY());

    circle1.setCenterXY(3, 3);
    System.out.println("Center's x: " + circle1.getCenterXY()[0]);
    System.out.println("Center's y: " + circle1.getCenterXY()[1]);

    // Test methods
    System.out.println("Area: " + circle1.getArea());
    System.out.println("Circumference: " + circle1.getCircumference());

    // Test another constructor and distance()
    MyCircle circle2 = new MyCircle(1, 1, 1);
    System.out.println(circle2);
    MyCircle circle3 = new MyCircle(new MyPoint(5, 5), 2);
    System.out.println(circle3);
    System.out.println("Distance from circle2 to circle3: " + circle2.distance(circle3));
  }
}
