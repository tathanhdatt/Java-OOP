package composition.circle;

public class Cylinder {
  private Circle base;
  private double height;

  public Cylinder() {
    this.base = new Circle();
    this.height = 1.0;
  }

  public Cylinder(double radius) {
    this.base = new Circle(radius);
    this.height = 1.0;
  }

  public Cylinder(double radius, double height) {
    this.base = new Circle(radius);
    this.height = height;
  }

  public Cylinder(double radius, String color, double height) {
    this.base = new Circle(radius, color);
    this.height = height;
  }

  public Circle getBase() {
    return base;
  }

  public void setBase(Circle base) {
    this.base = base;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public double getVolume() {
    return this.base.getArea() * this.height;
  }

  @Override
  public String toString() {
    return "Cylinder[" +
            "height=" + height + " ," +
            super.toString() +
            ']';
  }

  public double getArea() {
    return 2 * Math.PI * this.height + 2 * this.base.getArea();
  }
}
