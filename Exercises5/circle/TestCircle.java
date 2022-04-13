package circle;

public class TestCircle {
  public static void main(String[] args) {
    // Test constructors and toString()
    Circle circle1 = new Circle(1.1);
    System.out.println(circle1);
    Circle circle2 = new Circle();
    System.out.println(circle2);

    // Test getter and setter
    circle1.setRadius(2.2);
    System.out.println(circle1);
    System.out.printf("Radius is: %.2f%n", circle1.getRadius());

    // Test getArea() and getCircumference()
    System.out.printf("Area is: %.2f%n", circle1.getArea());
    System.out.printf("Circumference is: %.2f%n", circle1.Circumference());
  }
}
