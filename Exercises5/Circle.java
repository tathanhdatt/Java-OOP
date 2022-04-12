public class Circle {
    private double radius;

    Circle() {
        this.radius = 1.0;
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
        return Math.PI * this.radius * this.radius;
    }

    public double Circumference() {
        return 2 * Math.PI * this.radius;
    }

    public String toString() {
        return "Circle[radius=" + this.radius + "]";
    }
}
