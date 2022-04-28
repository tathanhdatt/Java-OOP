package inhertance.circle;

public class Cylinder extends Circle {
  private double height;

  public Cylinder() {
    super();
    this.height = 1.0;
  }

  public Cylinder(double radius) {
    super(radius);
    this.height = 1.0;
  }

  public Cylinder(double radius, double height) {
    super(radius);
    this.height = height;
  }

  public Cylinder(double radius, String color, double height) {
    super(radius, color);
    this.height = height;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public double getVolume() {
    return super.getArea() * this.height;
  }

  @Override
  public String toString() {
    return "Cylinder[" +
            "height=" + height + " ," +
            super.toString() +
            ']';
  }

  @Override
  public double getArea() {
    return 2 * Math.PI * this.height + 2 * super.getArea();
  }

  public double getBaseArea() {
    return super.getArea();
  }
}
