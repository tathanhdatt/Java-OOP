package mytriangleandmypoint;

public class MyTriangle {
  public MyPoint v1;
  public MyPoint v2;
  public MyPoint v3;

  public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
    this.v1 = new MyPoint(x1, y1);
    this.v2 = new MyPoint(x2, y2);
    this.v3 = new MyPoint(x3, y3);
  }

  public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
    this.v1 = v1;
    this.v2 = v2;
    this.v3 = v3;
  }

  @Override
  public String toString() {
    return String.format("MyTriangle[v1=%s, v2=%s, v3=%s]", v1, v2, v3);
  }

  public double getPerimeter() {
    return v1.distance(v2) + v2.distance(v3) + v3.distance(v1);
  }

  public String getType() {
    double edge12 = v1.distance(v2);
    double edge23 = v2.distance(v3);
    double edge31 = v3.distance(v1);

    if (edge12 == edge23 && edge23 == edge31) {
      return "Equilateral";
    } else if (edge12 == edge23 || edge23 == edge31 || edge31 == edge12) {
      return "Isosceles";
    } else {
      return "Scalene";
    }
  }
}
