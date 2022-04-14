package myrectangleandmypoint;

public class MyRectangle {
  private MyPoint topLeft;
  private MyPoint botRight;

  public MyRectangle(int xTopLeft, int yTopLeft, int xBotRight, int yBotRight) {
    topLeft = new MyPoint(xTopLeft, yTopLeft);
    botRight = new MyPoint(xBotRight, yBotRight);
  }

  public MyRectangle(MyPoint topLeft, MyPoint botRight) {
    this.topLeft = topLeft;
    this.botRight = botRight;
  }

  public MyPoint getTopLeft() {
    return topLeft;
  }

  public void setTopLeft(MyPoint topLeft) {
    this.topLeft = topLeft;
  }

  public MyPoint getBotRight() {
    return botRight;
  }

  public void setBotRight(MyPoint botRight) {
    this.botRight = botRight;
  }

  public MyPoint getTopRight() {
    return new MyPoint(botRight.getX(), topLeft.getY());
  }

  public MyPoint getBotLeft() {
    return new MyPoint(topLeft.getX(), botRight.getY());
  }

  @Override
  public String toString() {
    return String.format(
      "MyRectangle[topLeft=%s, topRight=%s, botLeft=%s, botRight=%s",
      topLeft, getTopRight(), getBotLeft(), botRight
    );
  }

  public double getArea() {
    double side1 = topLeft.distance(getTopRight());
    double side2 = botRight.distance(getTopRight());
    return side1 * side2;
  }

  public double getPerimeter() {
    double side1 = topLeft.distance(getTopRight());
    double side2 = botRight.distance(getTopRight());
    return 2 * (side1 + side2);
  }
}
