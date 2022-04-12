public class Rectangle {
  private float length;
  private float width;

  Rectangle() {
    this.length = 1.0f;
    this.width = 1.0f;
  }

  Rectangle(float length, float width) {
    this.length = length;
    this.width = width;
  }

  public float getLength() {
    return length;
  }

  public void setLength(float length) {
    this.length = length;
  }

  public float getWidth() {
    return width;
  }

  public void setWidth(float width) {
    this.width = width;
  }

  public double getArea() {
    return this.length * this.width;
  }

  public double getPerimeter() {
    return 2 * (this.length + this.width);
  }

  public String toString() {
    return String.format(
      "Rectangle[length=%.2f ,width=%.2f]",
      this.length, this.width
    );
  }
}
