package inhertance.shape;

public class Square extends Rectangle {
  public Square() {
  }

  public Square(double size) {
    super(size, size);
  }

  public Square(String color, boolean filled, double size) {
    super(color, filled, size, size);
  }

  public double getSize() {
    return super.getWidth();
  }

  public void setSize(double size) {
    super.setWidth(size);
    super.setLength(size);
  }

  public void setWidth(double size) {
    super.setWidth(size);
    super.setLength(size);
  }

  public void setLength(double size) {
    super.setLength(size);
    super.setWidth(size);
  }

  @Override
  public String toString() {
    return "Square[" + super.toString() + "]";
  }
}
