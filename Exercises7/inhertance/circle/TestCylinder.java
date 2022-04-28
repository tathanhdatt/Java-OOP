package inhertance.circle;

public class TestCylinder {
  public static void main(String[] args) {
    Cylinder cylinder1 = new Cylinder();
    System.out.println(cylinder1
            + "\nBase area=" + cylinder1.getBaseArea()
            + "\nSurface area=" + cylinder1.getArea()
            + "\nVolume=" + cylinder1.getVolume()
    );

    System.out.println();

    Cylinder cylinder2 = new Cylinder(10.0);
    System.out.println(cylinder2
            + "\nBase area=" + cylinder2.getBaseArea()
            + "\nSurface area=" + cylinder2.getArea()
            + "\nVolume=" + cylinder2.getVolume()
    );

    System.out.println();

    Cylinder cylinder3 = new Cylinder(2.0,10.0);
    System.out.println(cylinder3
            + "\nBase area=" + cylinder3.getBaseArea()
            + "\nSurface area=" + cylinder3.getArea()
            + "\nVolume=" + cylinder3.getVolume()
    );
  }
}
