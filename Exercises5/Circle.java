public class Circle {
    private double radius;

    Circle() {
        radius = 1.0;
    }

    Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double Circumference() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "Circle[radius=" + radius + "]";
    }
}
