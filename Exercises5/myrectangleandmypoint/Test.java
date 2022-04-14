package myrectangleandmypoint;

public class Test {
  public static void main(String[] args) {
    // Create points
    MyPoint topLeft = new MyPoint(0, 1);
    MyPoint botRight = new MyPoint(2, 0);
    // Test constructors
    MyRectangle rectangle1 = new MyRectangle(0, 3, 4, 0);
    System.out.println(rectangle1);
    MyRectangle rectangle2 = new MyRectangle(topLeft, botRight);
    System.out.println(rectangle2);

    // Test setters and getters
    rectangle1.setTopLeft(new MyPoint(2, 2));
    rectangle1.setBotRight(new MyPoint(3,1));
    System.out.println("TopLeft point: " + rectangle1.getTopLeft());
    System.out.println("BotRight: " + rectangle1.getBotRight());

    // Test methods
    System.out.println("Area: " + rectangle2.getArea());
    System.out.println("Perimeter: " + rectangle2.getPerimeter());
  }
}
