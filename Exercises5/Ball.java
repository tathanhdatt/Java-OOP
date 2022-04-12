public class Ball {
  private float x;
  private float y;
  private int radius;
  private float xDelta;
  private float yDelta;

  public Ball(float x, float y, int radius, float xDelta, float yDelta) {
    this.x = x;
    this.y = y;
    this.radius = radius;
    this.xDelta = xDelta;
    this.yDelta = yDelta;
  }

  public float getX() {
    return x;
  }

  public void setX(float x) {
    this.x = x;
  }

  public float getY() {
    return y;
  }

  public void setY(float y) {
    this.y = y;
  }

  public int getRadius() {
    return radius;
  }

  public void setRadius(int radius) {
    this.radius = radius;
  }

  public float getXDelta() {
    return xDelta;
  }

  public void setXDelta(float xDelta) {
    this.xDelta = xDelta;
  }

  public float getYDelta() {
    return yDelta;
  }

  public void setYDelta(float yDelta) {
    this.yDelta = yDelta;
  }

  public void move() {
    this.x += this.xDelta;
    this.y += this.yDelta;
  }

  public void reflectHorizontal() {
    this.xDelta = -this.xDelta;
  }

  public void reflectVertical() {
    this.yDelta = -this.yDelta;
  }

  public String toString() {
    return String.format(
      "Ball[(%.1f, %.1f), speed=(%.1f, %.1f)]",
      this.x, this.y, this.xDelta, this.yDelta
    );
  }
}
