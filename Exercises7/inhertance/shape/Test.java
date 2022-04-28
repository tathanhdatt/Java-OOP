package inhertance.shape;

public class Test {
  public static void main(String[] args) {
    // test Circle
    // test constructor
    Circle circle1 = new Circle();
    System.out.println(circle1);
    Circle circle2 = new Circle(2.0);
    System.out.println(circle2);
    Circle circle3 = new Circle("blue", true, 3.0);
    System.out.println(circle3);

    // test setters and getters
    circle1.setRadius(1.5);
    circle1.setColor("green");
    circle1.setFilled(false);
    System.out.println("Radius: " + circle1.getRadius());
    System.out.println("Color: " + circle1.getColor());
    System.out.println("isFilled: " + circle1.isFilled());

    // test getArea() and getPerimeter()
    System.out.println("Area: " + circle1.getArea());
    System.out.println("Perimeter: " + circle1.getPerimeter());

    // test Rectangle
    // test constructor
    Rectangle rectangle1 = new Rectangle();
    System.out.println(rectangle1);
    Rectangle rectangle2 = new Rectangle(2.0, 3.0);
    System.out.println(rectangle2);
    Rectangle rectangle3 = new Rectangle("cyan", false, 5.0, 6.0);
    System.out.println(rectangle3);

    // test setters and getters
    rectangle1.setWidth(2.2);
    rectangle1.setLength(4.4);
    rectangle1.setFilled(false);
    rectangle1.setColor("pink");
    System.out.println("Width: " + rectangle1.getWidth());
    System.out.println("Length: " + rectangle1.getLength());
    System.out.println("isFilled: " + rectangle1.isFilled());
    System.out.println("Color: " + rectangle1.getColor());

    // test getArea() and getPerimeter()
    System.out.println("Area: " + rectangle1.getArea());
    System.out.println("Perimeter: " + rectangle1.getPerimeter());

    // test Square
    // test constructor
    Square square1 = new Square();
    System.out.println(square1);
    Square square2 = new Square(1.0);
    System.out.println(square2);
    Square square3 = new Square("magenta", true, 2.0);
    System.out.println(square3);

    // test setters and getters
    square1.setSize(3.0);
    System.out.println("Size: " + square1.getSize());
    square1.setWidth(4.0);
    System.out.println("Width: " + square1.getWidth());
    square1.setLength(5.0);
    System.out.println("Length: " + square1.getLength());
  }
}
